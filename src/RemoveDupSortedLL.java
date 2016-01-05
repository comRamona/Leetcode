/**
 * Created by rama on 04/01/16.
 * Most efficient solution
 */
public class RemoveDupSortedLL {
    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null)
            return head;

        ListNode p = head;

        while (p != null && p.next != null) {
            if (p.val == p.next.val) {
                p.next = p.next.next;
            } else {
                p = p.next;
            }
        }

        return head;
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        a.next = new ListNode(1);
        a.next.next = new ListNode(2);
        a.next.next.next = new ListNode(3);
        ListNode b = deleteDuplicates(a);
        System.out.println(b.val);
    }
}
