/*
 * Licensed to Elasticsearch B.V. under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch B.V. licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

import {
  DataFrameAnalysisAnalyzedFields,
  DataFrameAnalysisContainer,
  DataFrameAnalyticsDestination,
  DataFrameAnalyticsSource
} from '@ml/_types/DataFrameAnalytics'
import { ByteSize, Id, VersionString } from '@_types/common'
import { integer, long } from '@_types/Numeric'

export class Response {
  body: {
    id: Id
    create_time: long
    version: VersionString
    source: DataFrameAnalyticsSource
    description?: string
    dest: DataFrameAnalyticsDestination
    model_memory_limit: ByteSize
    allow_lazy_start: boolean
    max_num_threads: integer
    analysis: DataFrameAnalysisContainer
    analyzed_fields?: DataFrameAnalysisAnalyzedFields
  }
}
