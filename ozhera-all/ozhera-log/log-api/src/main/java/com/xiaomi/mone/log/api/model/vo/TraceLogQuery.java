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
package com.xiaomi.mone.log.api.model.vo;

import lombok.Data;

import java.io.Serializable;

@Data
public class TraceLogQuery implements Serializable {
    private Long appId;
    private String ip;
    private String traceId;
    private String generationTime;
    private String level;
    // 最大返回数据条数
    private Integer total = 1000;
    // es查询过期时间（毫秒）
    private Long timeout = 2000L;

    public TraceLogQuery(Long appId, String ip, String traceId) {
        this.appId = appId;
        this.ip = ip;
        this.traceId = traceId;
    }

    public TraceLogQuery() {
    }
}
