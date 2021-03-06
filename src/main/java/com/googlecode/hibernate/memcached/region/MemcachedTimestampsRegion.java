/* Copyright 2008 Ray Krueger
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.googlecode.hibernate.memcached.region;

import org.hibernate.cache.spi.TimestampsRegion;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.googlecode.hibernate.memcached.MemcachedRegionSettings;
import com.googlecode.hibernate.memcached.client.HibernateMemcachedClient;
/**
 * Implements the {@link TimestampsRegion} interface.
 * @author kcarlson
 */
public class MemcachedTimestampsRegion extends AbstractGeneralDataRegion implements TimestampsRegion {
    
    private final Logger log = LoggerFactory.getLogger(MemcachedTimestampsRegion.class);

    /**
     * Creates a new {@link MemcachedTimestampsRegion}.
     * 
     * @param client   the client used to access Memcached
     * @param settings the settings for this region
     */
    public MemcachedTimestampsRegion(HibernateMemcachedClient client, MemcachedRegionSettings settings) {
        super(client, settings);
    }

}
