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
package com.xiaomi.mone.log.manager.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * @author wtt
 * @version 1.0
 * @description
 * @date 2021/8/19 11:19
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MilogAppEnvDTO implements Serializable {
    /**
     * 环境名称
     */
    private String label;
    /**
     * 环境主键
     */
    private Long value;
    /**
     * 环境下的ips集合
     */
    private List<String> ips;
}
