/**
 * Created by rama on 17/01/16.
 * Rotate linked list:
 * split list at kth from end
 * reverse(0,length-k-1)
 * reverse(length-k,n-1)
 * reverse(0,n-1)
 * It worked!
 */
public class RotatedList {
    public ListNode rotateRight1(ListNode head, int k) { //setting kth as head
        if (head == null || head.next == null || k == 0) return head;
        int nr = 0;
        ListNode size = head;
        while (size != null) {
            nr++;
            size = size.next;
        }
        k = k % nr;
        if (k == 0) return head;
        ListNode p = head;
        ListNode q = head;
        for (int i = 1; i <= k; i++)
            q = q.next;
        if (q == null) return head.next;
        while (q.next != null) {
            p = p.next;
            q = q.next;
        }

        ListNode save = p.next;
        p.next = null;
        q.next = head;
        return save;


    }

    public ListNode rotateRight2(ListNode head, int k) {  //using reverse
        ListNode curr = head;
        if (head == null) return head;
        int nr = 0;
        while (curr != null) {
            nr++;
            curr = curr.next;
        }
        k = k % nr;
        if (head.next == null || k == 0) return head;
        ListNode p = head, q = head;
        int x = 0;
        while (x != k) {
            q = q.next;
            x++;
        }
        while (q.next != null) {
            p = p.next;
            q = q.next;
        }

        ListNode save = p.next;
        ListNode a = reverse(head, p.next);
        ListNode end = reverse(save, null);
        head.next = end;

        return reverse(a, null);
    }

    public ListNode reverse(ListNode head, ListNode to) {
        ListNode curr = head;
        ListNode prev = null;
        while (curr != to) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
        return head;

    }
}
