/**
 * Created by rama on 19/01/16.
 */
public class MyQueue<T> {
    public ListNode head;
    public ListNode last;
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
        ListNode t = new ListNode(val);
        if (last != null)
            last.next = t;
        last = t;
        if (head == null)
            head = last;
    }

    public T deque() {
        if (head == null) return null;
        T val = head.val;
        head = head.next;
        if (head == null)
            last = null;
        return val;
    }

    public boolean isEmpty() {
        return head == null;
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
