package com.googlecode.hibernate.memcached.client.spymemcached

import com.googlecode.hibernate.memcached.BaseTestCase
import net.spy.memcached.AddrUtil
import net.spy.memcached.MemcachedClient

/**
 * DOCUMENT ME!
 * @author Ray Krueger
 */
class SpyMemcacheTest extends BaseTestCase {
/*
    MemcachedCache cache
    MemcachedClient client

    protected void setUp() {
        client = new MemcachedClient(AddrUtil.getAddresses("localhost:11211"))
        cache = new MemcachedCache("MemcachedCacheTest", new SpyMemcache(client))
    }

    protected void tearDown() {
        client.shutdown()
    }

    void test() {
        cache.put("test", "value")
        Thread.sleep(100)
        assertEquals("value", cache.get("test"))
    }

    void test_clear() {
        cache.setClearSupported(true)
        cache.put("test", "value")
        Thread.sleep(100)
        assertEquals("value", cache.get("test"))
        cache.clear()
        Thread.sleep(100)
        assertNull(cache.get("test"))
    }
*/
}
