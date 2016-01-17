
public class LLInsert{
    public static ListNode insert(ListNode head, int data) {
  	//Complete this method
        if(head==null){
            head = new ListNode(data);
        }
        else
            {
                ListNode p = head;
            while(p.next!=null){
                p=p.next;
            }
                p.next = new ListNode(data);
        }
        return head;
	}
	}
