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

import { AnalysisConfig } from '@ml/_types/AnalysisConfig'
import { AnalysisLimits } from '@ml/_types/AnalysisLimits'
import { DataDescription } from '@ml/_types/DataDescription'
import { ModelPlotConfig } from '@ml/_types/ModelPlotConfig'
import { Id } from '@_types/common'
import { long } from '@_types/Numeric'
import { DateString, Time } from '@_types/Time'

export class Response {
  body: {
    allow_lazy_open: boolean
    analysis_config: AnalysisConfig
    analysis_limits: AnalysisLimits
    background_persist_interval: Time
    create_time: DateString
    data_description: DataDescription
    description: string
    job_id: Id
    job_type: string
    model_plot: ModelPlotConfig
    model_snapshot_id: string
    model_snapshot_retention_days: long
    renormalization_window_days: long
    results_index_name: string
    results_retention_days: long
  }
}
