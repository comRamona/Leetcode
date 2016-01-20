/**
 * Created by rama on 19/01/16.
 */
public class MyStack<T> {
    SNode head;

    public static void main(String[] args) {
        MyStack<Integer> stack = new MyStack<>();
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }

    //push is like inserting at the beginning
    public void push(T val) {
        if (head == null)
            head = new SNode(val);
        else {
            SNode a = new SNode(val);
            a.next = head;
            head = a;
        }
    }

    public T pop() {
        if (head == null) return null;
        T val = head.val;
        head = head.next;
        return val;
    }

    class SNode {
        T val;
        SNode next;

        SNode(T val) {
            this.val = val;
        }

    }
}
