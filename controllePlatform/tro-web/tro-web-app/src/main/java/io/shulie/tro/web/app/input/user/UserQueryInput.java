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

package io.shulie.tro.web.app.input.user;

import java.util.List;

import io.shulie.tro.common.beans.page.PagingDevice;
import lombok.Data;

/**
 * @Author ZhangXT
 * @Description
 * @Date 2020/11/4 14:41
 */
@Data
public class UserQueryInput extends PagingDevice {

    /**
     * 成员/用户名称
     */
    private String name;

    /**
     * 部门id
     */
    private List<String> deptIds;

    /**
     * 角色id
     */
    private List<String> roleIds;

    /**
     * 用户id
     */
    private List<String> userIds;
}
