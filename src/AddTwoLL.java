/**
 * Created by rama on 04/01/16.
 * You are given two linked lists representing two non-negative numbers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
 * <p>
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 */
public class AddTwoLL {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        if (l1 == null && l2 == null) return null;
        ListNode c1 = l1;
        ListNode c2 = l2;
        int a = 0;
        int b = 0;
        if (c1 != null) a = c1.val;
        if (c2 != null) b = c2.val;
        int x = a + b + carry;
        if (x > 9) {
            carry = (x / 10) % 10;
            x = x % 10;
        }
        ListNode head = new ListNode(x);
        ListNode first = head;
        c1 = c1.next;
        c2 = c2.next;
        while (c1 != null || c2 != null) {
            if (c1 != null) a = c1.val;
            else a = 0;
            if (c2 != null) b = c2.val;
            else b = 0;
            x = a + b + carry;
            if (x > 9) {
                carry = (x / 10) % 10;
                x = x % 10;
            } else
                carry = 0;
            head.next = new ListNode(x);
            head = head.next;
            if (c1 != null) c1 = c1.next;
            if (c2 != null) c2 = c2.next;
        }
        if (carry != 0) head.next = new ListNode(carry);
        return first;
    }

}
