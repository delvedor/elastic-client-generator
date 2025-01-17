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

import { Dictionary } from '@spec_utils/Dictionary'
import { GeoLocation } from '@_types/query_dsl/geo/GeoLocation'
import { SuggestContextQuery } from '../context_suggester/SuggestContextQuery'
import { SuggesterBase } from '../Suggester'
import { SuggestFuzziness } from './SuggestFuzziness'

export class CompletionSuggester extends SuggesterBase {
  contexts?: Dictionary<
    string,
    string | string[] | GeoLocation | SuggestContextQuery[]
  >
  fuzzy?: SuggestFuzziness
  prefix?: string
  regex?: string
  skip_duplicates?: boolean
}
