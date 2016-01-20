/**
 * Created by rama on 19/01/16.
 * <p>
 * 2->3->4->5->7  2   5->7->2->3->4
 */

public class RotateList2 {
    public static ListNode rotate(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) return head;
        ListNode p = head;
        int j = 0;
        while (j != k && p != null) {
            p = p.next;
            j++;
        }
        ListNode q = head;
        while (p.next != null) {
            q = q.next;
            p = p.next;
        }
        ListNode newHead = q.next;
        q.next = null;
        p.next = head;
        return newHead;
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(2);
        insert(a, 3);
        insert(a, 4);
        insert(a, 5);
        insert(a, 7);
        ListNode x = rotate(a, 2);
        while (x != null) {
            System.out.print(x.val);
            x = x.next;
        }


    }

    public static ListNode insert(ListNode head, int data) {
        //Complete this method
        if (head == null) {
            head = new ListNode(data);
        } else {
            ListNode p = head;
            while (p.next != null) {
                p = p.next;
            }
            p.next = new ListNode(data);
        }
        return head;
    }
}
