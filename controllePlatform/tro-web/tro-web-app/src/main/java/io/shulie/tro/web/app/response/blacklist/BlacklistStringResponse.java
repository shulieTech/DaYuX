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

package io.shulie.tro.web.app.response.blacklist;

import lombok.Data;

/**
 * @author 无涯
 * @Package io.shulie.tro.web.app.response.fastdebug
 * @date 2020/12/28 9:43 上午
 */
@Data
public class BlacklistStringResponse {
    private String content;

    public BlacklistStringResponse(String content) {
        this.content = content;
    }
}
