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
package com.xiaomi.mone.log.agent.input;

import java.io.Serializable;

/**
 * 原样日志类型输入
 * 该类型的日志，只负责原样采集到mq，不负责消费
 *
 * @author shanwb
 * @date 2022-12-23
 */
public class OriginLogInput extends Input implements Serializable {

    public OriginLogInput() {
        super();
    }
}
