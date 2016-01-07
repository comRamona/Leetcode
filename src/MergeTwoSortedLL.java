/**
 * Created by rama on 07/01/16.
 */
public class MergeTwoSortedLL {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null&&l2==null) return null;
        ListNode res=new ListNode(0);
        ListNode l3=res;
        while(l1!=null&&l2!=null){
            if(l1.val<=l2.val) {
                l3.next=new ListNode(l1.val);
                l1=l1.next;
            }
            else {
                l3.next=new ListNode(l2.val);
                l2=l2.next;
            }
            l3=l3.next;
        }
        while(l1!=null){
            l3.next=new ListNode(l1.val);
            l3=l3.next;
            l1=l1.next;
        }
        while(l2!=null){
            l3.next=new ListNode(l2.val);
            l3=l3.next;
            l2=l2.next;
        }
        return res.next;
    }
}
