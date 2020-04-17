package LeetCode;
class MyLinkedList {
    class Node {
        int val;
        Node prev;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    Node head;
    Node tail;

    public MyLinkedList() {
        head = new Node(-1);
        tail = new Node(-1);

        head.next = tail;
        tail.prev = head;
    }
    
    public int get(int index) {
        Node node = getNode(index);
        return node == null ? -1 : node.val;
    }

    private Node getNode(int index) {
        Node node = head.next;
        while (node != null && index > 0) {
            node = node.next;
            index--;
        }
        return node;
    }
   
    public void addAtHead(int val) {
        Node node = new Node(val);
        node.next = head.next;
        node.prev = head;
        node.next.prev = node;
        node.prev.next = node;
    }
    
    public void addAtTail(int val) {
        Node node = new Node(val);
        node.next = tail;
        node.prev = tail.prev;
        node.next.prev = node;
        node.prev.next = node;
    }
    
    public void addAtIndex(int index, int val) {
        Node cur = getNode(index);
        // 要插入的索引不存在只有一种情况：cur == null。于删除操作不同，即便到了 tail，也可以在 tail 前插入节点。
        if (cur == null) {
            return;
        }
        Node node = new Node(val);
        node.prev = cur.prev;
        node.next = cur;
        node.prev.next = node;
        node.next.prev = node;
    }
    
    public void deleteAtIndex(int index) {
        Node cur = getNode(index);
        // 要删除的索引不存在有两种情况：cur == null 或者 cur 到了 tail
        if (cur == null || cur.val == -1) {
            return;
        }
        cur.prev.next = cur.next;
        cur.next.prev = cur.prev;
        cur.prev = null;
        cur.next = null;
    }
}