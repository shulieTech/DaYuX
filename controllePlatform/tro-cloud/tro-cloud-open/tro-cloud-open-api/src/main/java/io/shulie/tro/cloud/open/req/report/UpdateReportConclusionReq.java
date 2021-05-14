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

package io.shulie.tro.cloud.open.req.report;

import io.shulie.tro.cloud.open.req.HttpCloudRequest;
import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * @author 无涯
 * @Package io.shulie.tro.cloud.open.req.report
 * @date 2021/2/1 6:04 下午
 */
@Data
@ApiModel
public class UpdateReportConclusionReq extends HttpCloudRequest {
    private Long id;
    private String errorMessage;
    private Integer conclusion;
}
