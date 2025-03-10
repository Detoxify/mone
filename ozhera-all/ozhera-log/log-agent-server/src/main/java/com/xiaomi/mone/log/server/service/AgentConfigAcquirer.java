/*
 * Copyright 2020 Xiaomi
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package com.xiaomi.mone.log.server.service;

import com.xiaomi.mone.log.api.model.meta.LogCollectMeta;

/**
 * @author wtt
 * @version 1.0
 * @description
 * @date 2022/12/6 14:29
 */
public interface AgentConfigAcquirer {

    /**
     * 获取日志配置信息
     * @param ip
     * @return
     */
    LogCollectMeta getLogCollectMetaFromManager(String ip);
}
