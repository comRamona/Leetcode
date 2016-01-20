/**
 * Created by rama on 19/01/16.
 */
public class MyQueue<T> {
    public ListNode head;

    public MyQueue() {
        head = null;
    }

    public static void main(String[] args) {
        MyQueue<Integer> queue = new MyQueue<>();
        queue.enque(2);
        queue.enque(3);
        queue.enque(4);
        System.out.println(queue.deque());
        System.out.println(queue.deque());
    }

    public void enque(T val) {
        if (head == null) head = new ListNode(val);
        else {
            ListNode p = head;
            while (p.next != null) {
                p = p.next;
            }
            p.next = new ListNode(val);
        }
    }

    public T deque() {
        if (head == null) return null;
        T val = head.val;
        head = head.next;
        return val;
    }

    class ListNode {
        T val;
        ListNode next;

        ListNode(T val) {
            this.val = val;
            next = null;
        }
    }
}
