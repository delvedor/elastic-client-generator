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

import { NodeRoles } from '@nodes/nodes_info/NodeRole'
import { Dictionary } from '@spec_utils/Dictionary'
import { Id, Name } from '@_types/common'
import { TransportAddress } from '@_types/Networking'

export class NodeAttributes {
  /** Lists node attributes. */
  attributes: Dictionary<string, string>
  /** The ephemeral ID of the node. */
  ephemeral_id: Id
  /** The unique identifier of the node. */
  id?: Id
  /** The unique identifier of the node. */
  name: Name
  /** The host and port where transport HTTP connections are accepted. */
  transport_address: TransportAddress
  roles?: NodeRoles
}
