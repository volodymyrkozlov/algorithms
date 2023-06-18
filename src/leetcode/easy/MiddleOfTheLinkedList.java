package leetcode.easy;

import java.util.ArrayList;

public class MiddleOfTheLinkedList {
    public static void main(String[] args) {
        System.out.println(middleNode(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6))))))));
    }

    public static ListNode middleNode(ListNode head) {
        var currentNode = head;

        var nodesValues = new ArrayList<ListNode>();
        while (currentNode != null) {
            nodesValues.add(currentNode);
            currentNode = currentNode.next;
        }

        if (nodesValues.size() % 2 != 0) {
            return nodesValues.get((nodesValues.size() / 2));
        } else {
            return nodesValues.get((nodesValues.size() + 1) / 2);
        }
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        @Override
        public String toString() {
            return "ListNode{" +
                    "val=" + val +
                    ", next=" + next +
                    '}';
        }
    }

}
