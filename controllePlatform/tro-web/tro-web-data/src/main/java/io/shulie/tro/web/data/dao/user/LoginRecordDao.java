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

package io.shulie.tro.web.data.dao.user;

import java.util.List;

import io.shulie.tro.web.data.param.user.LoginRecordParam;
import io.shulie.tro.web.data.param.user.LoginRecordSearchParam;
import io.shulie.tro.web.data.result.user.LoginRecordResult;

/**
 * @author 无涯
 * @Package io.shulie.tro.web.data.dao.user
 * @date 2021/4/7 5:21 下午
 */
public interface LoginRecordDao {
    void insert(LoginRecordParam param);

    List<LoginRecordResult> getList(LoginRecordSearchParam param);
}
