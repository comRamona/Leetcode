/**
 * Created by rama on 04/01/16.
 */
public class DeleteDupSorted {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            ListNode from = curr;
            while (from.next != null) {
                if (from.next.val == curr.val)
                    from.next = from.next.next;
                else break;
            }
            curr = from.next;

        }
        return head;
    }
}
