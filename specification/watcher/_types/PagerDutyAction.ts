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

import { HttpInputRequestResult, HttpInputResponseResult } from './Action'

export class PagerDutyContext {
  href: string
  src: string
  type: PagerDutyContextType
}

export enum PagerDutyContextType {
  link = 0,
  image = 1
}

export class PagerDutyEvent {
  account: string
  attach_payload: boolean
  client: string
  client_url: string
  context: PagerDutyContext[]
  description: string
  event_type: PagerDutyEventType
  incident_key: string
}

export enum PagerDutyEventType {
  trigger = 0,
  resolve = 1,
  acknowledge = 2
}

export class PagerDutyActionEventResult {
  event: PagerDutyEvent
  reason: string
  request: HttpInputRequestResult
  response: HttpInputResponseResult
}

export class PagerDutyActionResult {
  sent_event: PagerDutyActionEventResult
}
