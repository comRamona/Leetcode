/**
 * Created by rama on 20/01/16.
 * Detect if a linked list ha a cycle
 */
public class LinkedListCycle {
    /**
     * first approach: reverse list and see if you reach the same node
     */
    public boolean hasCycle(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev == head && head != null && head.next != null;

    }

    // Floyd’s cycle finding algorithm, also called the Tortoise and hare algorithm.
    //use two pointers, one moving twice as fast
    public boolean hasCycleFloyd(ListNode head) {
        if (head == null) return false;
        ListNode slow = head;
        ListNode fast = head;
        do {
            if (fast.next == null || fast.next.next == null)
                return false;
            fast = fast.next.next;

            slow = slow.next;
        }
        while (fast != slow);

        return true;  //if the loop exists, found meeting point

    }
}
