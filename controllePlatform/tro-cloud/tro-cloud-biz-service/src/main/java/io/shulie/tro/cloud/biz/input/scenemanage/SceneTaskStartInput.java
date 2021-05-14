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

package io.shulie.tro.cloud.biz.input.scenemanage;

import lombok.Data;

import java.util.List;

/**
 * @ClassName SceneTaskStartInput
 * @Description
 * @Author qianshui
 * @Date 2020/11/4 下午4:49
 */
@Data
public class SceneTaskStartInput {

    private Long sceneId;

    private Long deptId;

    private Long uid;

    private List<Long> enginePluginIds;
}
