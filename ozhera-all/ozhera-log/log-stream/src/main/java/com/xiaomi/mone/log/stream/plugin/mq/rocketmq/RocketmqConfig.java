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
package com.xiaomi.mone.log.stream.plugin.mq.rocketmq;

import com.xiaomi.mone.log.stream.plugin.mq.MQConfig;
import lombok.Data;

/**
 * RocketMq的一些配置
 */
@Data
public class RocketmqConfig extends MQConfig {

    private String consumerGroup;

    private String consumerFromWhere;

    private String namesrvAddr;

    private String ak;

    private String sk;
}
