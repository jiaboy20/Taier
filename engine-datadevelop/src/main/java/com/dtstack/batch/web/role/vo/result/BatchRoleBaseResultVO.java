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

package com.dtstack.batch.web.role.vo.result;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel("权限基础信息")
public class BatchRoleBaseResultVO {

    @ApiModelProperty(value = "租户 ID",example = "1")
    private Long tenantId;

    @ApiModelProperty(value = "项目 ID",example = "1")
    private Long projectId;

    @ApiModelProperty(value = "角色名称",example = "访客")
    private String roleName;

    @ApiModelProperty(value = "角色类型",example = "1")
    private Integer roleType;

    @ApiModelProperty(value = "角色值",example = "1")
    private Integer roleValue;

    @ApiModelProperty(value = "角色排序",example = "desc")
    private String roleDesc;

    @ApiModelProperty(value = "修改用户ID",example = "5")
    private Long modifyUserId;
}
