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
package com.xiaomi.mone.log.manager.service.statement;

import org.elasticsearch.index.query.BoolQueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;

import java.util.List;

import static com.xiaomi.mone.log.manager.service.statement.StatementMatchParseFactory.DOUBLE_QUOTATION_MARK_SEPARATOR;

/**
 * must语句匹配
 */
public class MustStatementMatchParse implements StatementMatchParse {
    @Override
    public BoolQueryBuilder matchBuild(List<QueryEntity> queryEntities) {
        BoolQueryBuilder boolQueryBuilder = QueryBuilders.boolQuery();
        for (QueryEntity entity : queryEntities) {
            if (entity.getFieldValue().startsWith(DOUBLE_QUOTATION_MARK_SEPARATOR)) {
                boolQueryBuilder.must(QueryBuilders.matchPhraseQuery(entity.getField(), entity.getFieldValue()));
            } else {
                boolQueryBuilder.must(QueryBuilders.matchQuery(entity.getField(), entity.getFieldValue()));
            }
        }
        return boolQueryBuilder;
    }
}
