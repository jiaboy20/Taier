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

package com.dtstack.batch.web.datamask.vo.result;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.sql.Timestamp;

@Data
@ApiModel("脱敏关联表结果信息")
public class BatchDataMaskConfigRelatedTableResultVO {
    @ApiModelProperty(value = "修改用户名称", example = "admin")
    private String modifyUserName;

    @ApiModelProperty(value = "项目名称", example = "project_name")
    private String projectName;

    @ApiModelProperty(value = "项目别名", example = "project_alia")
    private String projectAlias;

    @ApiModelProperty(value = "表名称", example = "test")
    private String tableName;

    @ApiModelProperty(value = "脱敏id", example = "1")
    private Long configId;

    @ApiModelProperty(value = "脱敏表id", example = "1")
    private Long tableId;

    @ApiModelProperty(value = "脱敏表字段名称", example = "col_name")
    private String columnName;

    @ApiModelProperty(value = "修改用户id", example = "1")
    private Long modifyUserId;

    @ApiModelProperty(value = "开启/关闭脱敏 0-正常 1-禁用", example = "0")
    private Integer enable = 0;

    @ApiModelProperty(value = "是否是原始脱敏字段", example = "0")
    private Integer isOrigin;

    @ApiModelProperty(value = "租户id")
    private Long tenantId;

    @ApiModelProperty(value = "项目id")
    private Long projectId;

    @ApiModelProperty(value = "dtuic租户id")
    private Long dtuicTenantId;

    @ApiModelProperty(value = "app类型", example = "1")
    private Integer appType;

    @ApiModelProperty(value = "id", example = "1")
    private Long id = 0L;

    @ApiModelProperty(value = "创建时间", example = "2020-08-14 14:41:55")
    private Timestamp gmtCreate;

    @ApiModelProperty(value = "修改时间", example = "2020-08-14 14:41:55")
    private Timestamp gmtModified;

    @ApiModelProperty(value = "是否删除", example = "1")
    private Integer isDeleted = 0;
}
