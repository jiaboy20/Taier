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

package com.dtstack.batch.domain;

import com.dtstack.engine.domain.TenantEntity;
import lombok.Data;

/**
 * @author sanyue
 * @date 2018/11/20
 */
@Data
public class UserOperatorPermission extends TenantEntity {

    private Long userId;

    /**
     * 操作类型id
     */
    private Long operatorId;

    /**
     * ddl/dml
     */
    private Integer type;

    private Long tableId;

    private Long applyId;

    private Long createUserId;

    private Long modifyUserId;

}
