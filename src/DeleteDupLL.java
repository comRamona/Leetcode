import java.util.HashSet;
import java.util.Set;

/**
 * Created by rama on 04/01/16.
 * <p>
 * Given a linked list, delete all duplicates such that each element appear only once.
 * <p>
 * For example,
 * Given 1->1->2, return 1->2.
 * Given 1->1->2->3->3, return 1->2->3.
 */
public class DeleteDupLL {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return head;
        Set<Integer> map = new HashSet<Integer>();
        ListNode curr = head;
        map.add(curr.val);
        while (curr.next != null) {
            ListNode p = curr.next;
            if (map.contains(p.val)) {
                curr.next = p.next;

            } else {
                map.add(p.val);
                curr = p;
            }

        }

        return head;

    }
}
