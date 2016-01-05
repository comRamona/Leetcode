/**
 * Created by rama on 05/01/16.
 * Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
 * push(x) -- Push element x onto stack.
 * pop() -- Removes the element on top of the stack.
 * top() -- Get the top element.
 * getMin() -- Retrieve the minimum element in the stack.
 */

class MinStack {
    Integer min = null;
    Node top = null;

    public void push(int x) {
        Node oldTop = top;
        int newMin = x;
        if (oldTop != null)
            if (oldTop.min < newMin) newMin = oldTop.min;
        Node n = new Node(x, newMin);
        if (top == null) top = n;
        else {
            n.next = top;
            top = n;
        }
    }

    public void pop() {
        if (top != null) top = top.next;


    }

    public int top() {
        return top.val;
    }

    public int getMin() {
        return top.min;
    }

    private class Node {
        int val, min;
        Node next;

        Node(int val, int min) {
            this.val = val;
            this.min = min;
        }
    }
}