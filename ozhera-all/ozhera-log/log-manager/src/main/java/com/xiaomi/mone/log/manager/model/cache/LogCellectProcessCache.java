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
package com.xiaomi.mone.log.manager.model.cache;

import lombok.Data;

@Data
public class LogCellectProcessCache {

    private String tailId;

    private String tailName;

    private String path;

    private String ip;

    private String pattern;

    private Long appId;


    private String appName;

    // 日志文件行号
    private Long fileRowNumber;

    private Long pointer;

    private Long fileMaxPointer;

    // 收集进度
    private String collectPercentage;

    // 收集时间
    private Long collectTime;
}
