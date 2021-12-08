/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.dtstack.engine.rdbs.db2;

import com.dtstack.engine.pluginapi.pojo.Column;
import com.dtstack.engine.pluginapi.exception.RdosDefineException;
import com.dtstack.engine.rdbs.common.AbstractRdbsClient;
import com.dtstack.engine.rdbs.common.executor.AbstractConnFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Db2Client extends AbstractRdbsClient {

    private static final Logger LOGGER = LoggerFactory.getLogger(Db2Client.class);

    public Db2Client() {
        this.dbType = "db2";
    }

    // select SYSCAT.COLUMNS to get column information
    private static final String TABLE_INFO_SQL = "SELECT t.COLNO AS INDEX, t.COLNAME AS NAME, t.REMARKS AS COMMENT, LOWER(t.TYPENAME) AS TYPE FROM SYSCAT.COLUMNS t WHERE TABSCHEMA='%s' AND TABNAME=upper('%s') ORDER BY INDEX ASC ";

    @Override
    protected AbstractConnFactory getConnFactory() {
        return new Db2ConnFactory();
    }


    @Override
    public List<Column> getAllColumns(String tableName, String schemaName, String dbName) {

        List<Column> columnList = new ArrayList<>();
        ResultSet res = null;
        try(Connection conn = this.connFactory.getConn();
            Statement statement = conn.createStatement()){
            String sql = String.format(TABLE_INFO_SQL, schemaName, tableName);
            res = statement.executeQuery(sql);
            while (res.next()){
                Column column = new Column();
                column.setName(res.getString("NAME"));
                column.setType(res.getString("TYPE"));
                column.setComment(res.getString("COMMENT"));
                column.setIndex(res.getInt("INDEX"));
                columnList.add(column);
            }
        }catch (Exception e){
            throw new RdosDefineException("getColumnsList exception");
        }finally {
            if(null != res){
                try {
                    res.close();
                } catch (SQLException e) {
                    LOGGER.error("close sqlResult exception,e:{}", e.getMessage());
                }
            }
        }
        return columnList;
    }
}
