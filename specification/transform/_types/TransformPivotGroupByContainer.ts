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

import { DateHistogramAggregation } from '@_types/aggregations/bucket/date_histogram/DateHistogramAggregation'
import { GeoTileGridAggregation } from '@_types/aggregations/bucket/geo_tile_grid/GeoTileGridAggregation'
import { HistogramAggregation } from '@_types/aggregations/bucket/histogram/HistogramAggregation'
import { TermsAggregation } from '@_types/aggregations/bucket/terms/TermsAggregation'

/**
 * @variants container
 */
export class TransformPivotGroupByContainer {
  date_histogram?: DateHistogramAggregation
  geotile_grid?: GeoTileGridAggregation
  histogram?: HistogramAggregation
  terms?: TermsAggregation
}
