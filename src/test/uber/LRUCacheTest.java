package uber;

import org.junit.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import static org.junit.Assert.assertEquals;

public class LRUCacheTest {

    @Test
    public void test1() throws Exception {
        LRUCache cache = new LRUCache(2);
        cache.put(1, 1);
        cache.put(2, 2);
        assertEquals(1, cache.get(1));
        cache.put(3, 3);
        assertEquals(-1, cache.get(2));
        cache.put(4, 4);
        assertEquals(-1, cache.get(1));
        assertEquals(3, cache.get(3));
        assertEquals(4, cache.get(4));
    }

    @Test
    public void test2() throws Exception {
        LRUCache cache = new LRUCache(2);
        cache.get(2);
        cache.put(2, 6);
        cache.get(1);
        cache.put(1, 5);
        cache.put(1, 2);
        cache.get(1);
        cache.get(2);
    }

    @Test
    public void test3() throws Exception {
        LRUCache cache = new LRUCache(2);
        cache.put(2, 1);
        cache.put(3, 2);
        cache.get(3);
        cache.get(2);
        cache.put(4, 3);
        cache.get(2);
        cache.get(3);
        cache.get(4);
    }

    @Test
    public void test4() throws Exception {
        LRUCache cache = new LRUCache(10);
        cache.put(10, 13);
        cache.put(3, 2);
        cache.get(3);
        cache.get(2);
        cache.put(4, 3);
        cache.get(2);
        cache.get(3);
        cache.get(4);
    }

    @Test
    public void test5() throws Exception {
        LRUCache cache = new LRUCache(10);
        ExecutorService executor = Executors.newFixedThreadPool(5);
        executor.submit(() -> cache.put(1,1));
        Future<Integer> future = executor.submit(() -> cache.get(1));
        assertEquals(1, (int)future.get());
        executor.shutdown();
    }
}