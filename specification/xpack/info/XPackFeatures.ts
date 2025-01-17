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

import { XPackFeature } from './XPackFeature'

export class XPackFeatures {
  aggregate_metric: XPackFeature
  analytics: XPackFeature
  ccr: XPackFeature
  data_frame?: XPackFeature
  data_science?: XPackFeature
  data_streams: XPackFeature
  data_tiers: XPackFeature
  enrich: XPackFeature
  eql: XPackFeature
  flattened?: XPackFeature
  frozen_indices: XPackFeature
  graph: XPackFeature
  ilm: XPackFeature
  logstash: XPackFeature
  ml: XPackFeature
  monitoring: XPackFeature
  rollup: XPackFeature
  runtime_fields?: XPackFeature
  searchable_snapshots: XPackFeature
  security: XPackFeature
  slm: XPackFeature
  spatial: XPackFeature
  sql: XPackFeature
  transform: XPackFeature
  vectors: XPackFeature
  voting_only: XPackFeature
  watcher: XPackFeature
}
