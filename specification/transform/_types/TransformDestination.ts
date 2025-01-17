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

import { IndexName } from '@_types/common'

export class TransformDestination {
  /** The destination index for the transform. The mappings of the destination index are deduced based on the source fields when possible. If alternate mappings are required, use the Create index API prior to starting the transform. */
  index?: IndexName
  /**
   * The unique identifier for an ingest pipeline.
   * @doc_url https://www.elastic.co/guide/en/elasticsearch/reference/current/ingest.html
   */
  pipeline?: string
}
