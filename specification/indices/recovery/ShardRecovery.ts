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

import { Type } from '@_types/common'
import { long } from '@_types/Numeric'
import { DateString, EpochMillis } from '@_types/Time'
import { RecoveryIndexStatus } from './RecoveryIndexStatus'
import { RecoveryOrigin } from './RecoveryOrigin'
import { RecoveryStartStatus } from './RecoveryStartStatus'
import { RecoveryTranslogStatus } from './RecoveryTranslogStatus'
import { RecoveryVerifyIndex } from './RecoveryVerifyIndex'

export class ShardRecovery {
  id: long
  index: RecoveryIndexStatus
  primary: boolean
  source: RecoveryOrigin
  stage: string
  start?: RecoveryStartStatus
  start_time?: DateString
  start_time_in_millis: EpochMillis
  stop_time?: DateString
  stop_time_in_millis: EpochMillis
  target: RecoveryOrigin
  total_time?: DateString
  total_time_in_millis: EpochMillis
  translog: RecoveryTranslogStatus
  type: Type
  verify_index: RecoveryVerifyIndex
}
