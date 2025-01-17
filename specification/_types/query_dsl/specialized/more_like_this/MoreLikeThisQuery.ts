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
import { StopWords } from '@_types/analysis/StopWords'
import {
  Field,
  Fields,
  MinimumShouldMatch,
  Routing,
  VersionNumber,
  VersionType
} from '@_types/common'
import { double, integer } from '@_types/Numeric'
import { QueryBase } from '@_types/query_dsl/abstractions/query/Query'
import { Like } from './like/Like'

export class MoreLikeThisQuery extends QueryBase {
  analyzer?: string
  boost_terms?: double
  fields?: Fields
  include?: boolean
  like?: Like | Like[]
  max_doc_freq?: integer
  max_query_terms?: integer
  max_word_length?: integer
  min_doc_freq?: integer
  minimum_should_match?: MinimumShouldMatch
  min_term_freq?: integer
  min_word_length?: integer
  per_field_analyzer?: Dictionary<Field, string>
  routing?: Routing
  stop_words?: StopWords
  unlike?: Like | Like[]
  version?: VersionNumber
  version_type?: VersionType
}
