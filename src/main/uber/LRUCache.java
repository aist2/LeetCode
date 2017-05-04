package uber;

import java.util.HashMap;
import java.util.Map;

class LRUCache {
    private final Map<Integer, Node> map;
    private final int capacity;
    private Node head;
    private Node tail;
    private int count;

    LRUCache(int capacity) {
        map = new HashMap<>(capacity);
        this.capacity = capacity;
        this.count = 0;
        head = null;
        tail = null;
    }

    public int get(int key) {
        if (map.containsKey(key)) {
            Node node = map.get(key);
            updateUsage(node);
            return node.val;
        } else {
            return -1;
        }
    }

    public void put(int key, int value) {
        Node node;
        if (map.containsKey(key)) {
            node = map.get(key);
            node.val = value;
            updateUsage(node);
        } else {
            node = new Node(key, value);
            map.put(key, node);
            addNode(node);
        }
    }

    private void updateUsage(Node node) {
        if (node == tail) {
            return;
        }
        if (node == head) {
            head = node.next;
        }
        if (node.prev != null) {
            node.prev.next = node.next;
        }
        if (node.next != null) {
            node.next.prev = node.prev;
        }
        node.prev = null;
        node.next = null;
        tail.next = node;
        node.prev = tail;
        tail = node;
    }

    private void addNode(Node node) {
        if (count == 0) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            node.prev = tail;
            tail = node;
        }
        count++;
        if (count > capacity) {
            removeHeadNode();
        }
    }

    private void removeHeadNode() {
        map.remove(head.key);
        head = head.next;
        head.prev = null;
        count--;
    }

    private class Node {
        final int key;
        int val;
        Node next;
        Node prev;

        Node(int key, int val) {
            this.key = key;
            this.val = val;
            next = null;
            prev = null;
        }

        public String toString() {
            return "<" + key + "," + val + ">";
        }
    }
}
