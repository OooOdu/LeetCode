package LeetCode;

public class L707设计链表 {
    class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }

    class MyLinkedList {
        Node head;
        int length;

        /**
         * Initialize your data structure here.
         */
        public MyLinkedList() {
            head = new Node(-1);
            length = 0;
        }

        /**
         * Get the value of the index-th node in the linked list. If the index is
         * invalid, return -1.
         */
        public int get(int index) {
            if (index >= length || index < 0) return -1;
            Node cur = head;
            for (int i = 0; i <= index; i++) {
                cur = cur.next;
            }
            return cur.val;
        }

        /**
         * Add a node of value val before the first element of the linked list. After
         * the insertion, the new node will be the first node of the linked list.
         */
        public void addAtHead(int val) {

        }

        /**
         * Append a node of value val to the last element of the linked list.
         */
        public void addAtTail(int val) {

        }

        /**
         * Add a node of value val before the index-th node in the linked list. If index
         * equals to the length of linked list, the node will be appended to the end of
         * linked list. If index is greater than the length, the node will not be
         * inserted.
         */
        public void addAtIndex(int index, int val) {

        }

        /**
         * Delete the index-th node in the linked list, if the index is valid.
         */
        public void deleteAtIndex(int index) {

        }
    }
}
