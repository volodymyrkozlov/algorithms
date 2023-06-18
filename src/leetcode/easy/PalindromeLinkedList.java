package leetcode.easy;

public class PalindromeLinkedList {
    public static void main(String[] args) {
        boolean palindrome = isPalindrome(new ListNode(1, new ListNode(2, new ListNode(1))));
        System.out.println(palindrome);
    }

    public static boolean isPalindrome(ListNode head) {
        var word = new StringBuilder();
        var lastNode = head;
        while (lastNode != null) {
            word.append(Integer.valueOf(lastNode.val));
            lastNode = lastNode.next;
        }

        var charArray = word.toString().toCharArray();

        var wordBackToBeginning = new StringBuilder();

        for (var i = charArray.length - 1; i >= 0; i--) {
            wordBackToBeginning.append(charArray[i]);
        }

        return word.toString().contentEquals(wordBackToBeginning);
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
