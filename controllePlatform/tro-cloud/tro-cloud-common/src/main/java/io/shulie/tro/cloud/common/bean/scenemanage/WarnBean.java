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

package io.shulie.tro.cloud.common.bean.scenemanage;

import java.io.Serializable;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
* @Package io.shulie.tro.cloud.common.bean.scenemanage
* @author 无涯
* @description:
* @date 2021/2/3 11:46 上午
*/
@Data
public class WarnBean implements Serializable {

    @ApiModelProperty(value = "报告 ID")
    private Long reportId;

    @ApiModelProperty(value = "SLA ID")
    private Long slaId;

    @ApiModelProperty(value = "SLA名称")
    private String slaName;

    @ApiModelProperty(value = "活动ID")
    private String businessActivityId;

    @ApiModelProperty(value = "活动名称")
    private String businessActivityName;

    @ApiModelProperty(value = "警告次数")
    private Long total;

    @ApiModelProperty(value = "规则明细")
    private String content;

    @ApiModelProperty(value = "最新警告时间")
    private String lastWarnTime;

}
