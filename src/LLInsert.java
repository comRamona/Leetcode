class Node{
	int data;
	Node next;
	Node(int d){
        data=d;
        next=null;
    }
	
}
public class LLInsert{
	public static  Node insert(Node head,int data)
	{
  	//Complete this method
        if(head==null){
            head=new Node(data);
        }
        else
            {
            Node p=head;
            while(p.next!=null){
                p=p.next;
            }
            p.next=new Node(data);
        }
        return head;
	}
	}
