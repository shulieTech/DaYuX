/*
 * Copyright 2021 Shulie Technology, Co.Ltd
 * Email: shulie@shulie.io
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.shulie.tro.web.app.request.application;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import io.shulie.tro.web.amdb.bean.common.EntranceTypeEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author shiyajian
 * create: 2020-12-29
 */
@Data
@ApiModel("入口服务拓扑图查询对象")
public class ApplicationEntranceTopologyQueryRequest {

    @NotBlank
    @ApiModelProperty("应用名称")
    private String applicationName;

    @NotNull
    @ApiModelProperty("入口id")
    private String linkId;

    private String method;

    private String rpcType;

    private String extend;

    private String serviceName;

    private String nodeId;

    private EntranceTypeEnum type;
}
