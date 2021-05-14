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

package io.shulie.tro.web.app.cache;

/**
 * @author shiyajian
 * create: 2020-12-17
 */
public interface AgentCacheSupport<T> {

    /**
     * 获得缓存
     */
    T get(String namespace);

    /**
     * 缓存失效
     */
    void evict(String namespace);
}
