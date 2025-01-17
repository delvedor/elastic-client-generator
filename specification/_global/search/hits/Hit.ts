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

import { Explanation } from '@global/explain/Explanation'
import { Dictionary } from '@spec_utils/Dictionary'
import { UserDefinedValue } from '@spec_utils/UserDefinedValue'
import {
  Id,
  IndexName,
  SequenceNumber,
  Type,
  VersionNumber
} from '@_types/common'
import { double, long } from '@_types/Numeric'
import { SortResults } from '../sort/Sort'
import { InnerHitsResult } from './InnerHitsResult'
import { NestedIdentity } from './NestedIdentity'

export class Hit<TDocument> {
  _index: IndexName
  _id: Id

  _score?: double
  _type?: Type

  _explanation?: Explanation
  fields?: Dictionary<string, UserDefinedValue>
  highlight?: Dictionary<string, string[]>
  inner_hits?: Dictionary<string, InnerHitsResult>
  matched_queries?: string[]
  _nested?: NestedIdentity
  _ignored?: string[]

  _shard?: string
  _node?: string
  _routing?: string
  _source?: TDocument
  _seq_no?: SequenceNumber
  _primary_term?: long
  _version?: VersionNumber
  sort?: SortResults
}
