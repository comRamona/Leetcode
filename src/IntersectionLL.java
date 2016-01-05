/**
 * Created by rama on 05/01/16.
 */
public class IntersectionLL {
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;
        int l1 = 0;
        int l2 = 0;
        ListNode a = headA;
        while (a != null) {
            l1++;
            a = a.next;
        }
        ListNode b = headB;
        while (b != null) {
            l2++;
            b = b.next;
        }
        ListNode longer, shorter;
        longer = l1 > l2 ? headA : headB;
        shorter = l1 <= l2 ? headA : headB;
        int diff = Math.abs(l1 - l2);
        int i = 0;
        while (i != diff) {
            i++;
            longer = longer.next;
        }
        while (longer != null && shorter != null) {
            if (longer == shorter) return longer;
            longer = longer.next;
            shorter = shorter.next;
        }
        return null;
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(5);

        ListNode b = new ListNode(100);

        System.out.println(getIntersectionNode(a, b));
    }
}