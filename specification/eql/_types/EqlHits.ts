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

import { TotalHits } from '@global/search/hits/TotalHits'
import { EqlHitsEvent } from './EqlHitsEvent'
import { EqlHitsSequence } from './EqlHitsSequence'

export class EqlHits<TEvent> {
  /**
   * Metadata about the number of matching events or sequences.
   */
  total?: TotalHits
  /**
   * Contains events matching the query. Each object represents a matching event.
   */
  events?: EqlHitsEvent<TEvent>[]
  /**
   * Contains event sequences matching the query. Each object represents a matching sequence. This parameter is only returned for EQL queries containing a sequence.
   * @doc_url https://www.elastic.co/guide/en/elasticsearch/reference/current/eql-syntax.html#eql-sequences
   */
  sequences?: EqlHitsSequence<TEvent>[]
}
