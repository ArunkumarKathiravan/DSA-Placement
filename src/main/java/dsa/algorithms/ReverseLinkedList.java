package dsa.algorithms;

public class ReverseLinkedList {
    public static class ListNode {
        public int value;
        public ListNode next;

        public ListNode(int value) {
            this.value = value;
        }
    }

    public static ListNode reverseList(ListNode head) {
        ListNode previous = null;
        ListNode current = head;
        while (current != null) {
            ListNode next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        ListNode reversed = reverseList(head);
        while (reversed != null) {
            System.out.print(reversed.value + (reversed.next == null ? "\n" : " -> "));
            reversed = reversed.next;
        }
    }
}
