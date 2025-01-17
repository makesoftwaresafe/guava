/*
 * Copyright (C) 2018 The Guava Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.common.collect;


/**
 * GWT emulation of {@link JdkBackedImmutableBiMap}. Never used, but must exist so that the client
 * is willing to deserialize maps that were this type on the server.
 */
class JdkBackedImmutableBiMap<K, V> extends RegularImmutableBiMap<K, V> {
  private JdkBackedImmutableBiMap(ImmutableMap<K, V> delegate, ImmutableBiMap<V, K> inverse) {
    super(delegate, inverse);
  }
}
