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

package com.dtstack.batch.web.model.vo.query;

import com.dtstack.engine.common.param.DtInsightAuthParam;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.sql.Timestamp;

@Data
@ApiModel("添加字段模型信息")
public class BatchModelColumnAddVO extends DtInsightAuthParam {
    @ApiModelProperty(hidden = true)
    private Long userId;

    @ApiModelProperty(value = "类型", example = "1")
    private Integer type;

    @ApiModelProperty(value = "指标类型", example = "1")
    private Integer columnType;

    @ApiModelProperty(value = "指标命名", example = "指标命名")
    private String columnName;

    @ApiModelProperty(value = "指标名称", example = "指标名称")
    private String columnNameZh;

    @ApiModelProperty(value = "数据类型", example = "int")
    private String dataType;

    @ApiModelProperty(value = "指标口径", example = "desc")
    private String modelDesc;

    @ApiModelProperty(value = "最近修改人id", example = "1")
    private Long modifyUserId;

    @ApiModelProperty(value = "创建者用户id", example = "1")
    private Long createUserId;

    @ApiModelProperty(hidden = true)
    private Long tenantId;

    @ApiModelProperty(hidden =  true)
    private Long projectId;

    @ApiModelProperty(hidden =  true)
    private Long dtuicTenantId;

    @ApiModelProperty(value = "app类型", example = "1")
    private Integer appType;

    @ApiModelProperty(value = "ID", example = "0")
    private Long id = 0L;

    @ApiModelProperty(value = "创建时间", example = "2020-11-04 14:48:05")
    private Timestamp gmtCreate;

    @ApiModelProperty(value = "修改时间", example = "2020-11-04 14:48:05")
    private Timestamp gmtModified;

    @ApiModelProperty(value = "是否删除", example = "0")
    private Integer isDeleted = 0;
}
