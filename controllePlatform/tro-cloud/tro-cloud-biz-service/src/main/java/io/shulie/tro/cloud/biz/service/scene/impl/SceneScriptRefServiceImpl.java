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

package io.shulie.tro.cloud.biz.service.scene.impl;

import javax.annotation.Resource;

import com.pamirs.tro.entity.dao.scenemanage.TSceneScriptRefMapper;
import com.pamirs.tro.entity.domain.entity.scenemanage.SceneScriptRef;
import com.pamirs.tro.entity.domain.query.SceneScriptRefQueryParam;
import org.springframework.stereotype.Service;
import io.shulie.tro.cloud.biz.service.scene.SceneScriptRefService;

/**
 * @Author: mubai
 * @Date: 2020-05-12 20:23
 * @Description:
 */

@Service
public class SceneScriptRefServiceImpl implements SceneScriptRefService {
    @Resource
    private TSceneScriptRefMapper TSceneScriptRefMapper;

    @Override
    public synchronized SceneScriptRef selectByExample(SceneScriptRefQueryParam param) {
        return TSceneScriptRefMapper.selectByExample(param);
    }
}
