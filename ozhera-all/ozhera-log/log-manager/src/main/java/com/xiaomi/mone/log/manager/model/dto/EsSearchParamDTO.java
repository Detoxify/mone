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

import lombok.Data;

/**
 * @author zhangjuan
 * @Description 查询 matrix es 数据的参数
 * @date 2022-06-17
 */
@Data
public class EsSearchParamDTO {
    private String esDomain;
    private String index;
    private String catalog;
    private String dbName;
    private String esToken;

    public EsSearchParamDTO(String esDomain, String index, String catalog, String dbName, String esToken) {
        this.index = index;
        this.esDomain = esDomain;
        this.catalog = catalog;
        this.dbName = dbName;
        this.esToken = esToken;
    }
}
