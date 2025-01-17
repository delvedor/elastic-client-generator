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

import { VersionString } from '@_types/common'
import { CharGroupTokenizer } from './CharGroupTokenizer'
import { KeywordTokenizer } from './KeywordTokenizer'
import { LetterTokenizer } from './LetterTokenizer'
import { LowercaseTokenizer } from './LowercaseTokenizer'
import { NoriTokenizer } from './NoriTokenizer'
import { EdgeNGramTokenizer } from './n_gram/EdgeNGramTokenizer'
import { NGramTokenizer } from './n_gram/NGramTokenizer'
import { PathHierarchyTokenizer } from './PathHierarchyTokenizer'
import { StandardTokenizer } from './StandardTokenizer'
import { UaxEmailUrlTokenizer } from './UaxEmailUrlTokenizer'
import { WhitespaceTokenizer } from './WhitespaceTokenizer'

export class TokenizerBase {
  type: string
  version?: VersionString
}

export type Tokenizer =
  | CharGroupTokenizer
  | EdgeNGramTokenizer
  | KeywordTokenizer
  | LetterTokenizer
  | LowercaseTokenizer
  | NGramTokenizer
  | NoriTokenizer
  | PathHierarchyTokenizer
  | StandardTokenizer
  | UaxEmailUrlTokenizer
  | WhitespaceTokenizer
