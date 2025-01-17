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

import { Name, VersionString } from '@_types/common'
import { integer, long } from '@_types/Numeric'
import { NodeInfoJvmMemory } from './NodeInfoJvmMemory'

export class NodeJvmInfo {
  gc_collectors: string[]
  mem: NodeInfoJvmMemory
  memory_pools: string[]
  pid: integer
  start_time_in_millis: long
  version: VersionString
  vm_name: Name
  vm_vendor: string
  vm_version: VersionString
  bundled_jdk: boolean
  using_bundled_jdk: boolean
  using_compressed_ordinary_object_pointers?: boolean | string
  input_arguments: string[]
}
