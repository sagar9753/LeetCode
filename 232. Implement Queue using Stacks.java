Ques Link - https://leetcode.com/problems/implement-queue-using-stacks

----------------------------------------------- Solution ------------------------------------------------------

class MyQueue {
    public Deque<Integer> st1 = new ArrayDeque<>();
    public Deque<Integer> st2 = new ArrayDeque<>();

    public void push(int x) {
        st1.push(x);
    }
    
    public int pop() {
        peek();
        return st2.pop();
    }
    
    public int peek() {
        if(st2.isEmpty())
            while(!st1.isEmpty())
                st2.push(st1.pop());
        return st2.peek();
    }
    
    public boolean empty() {
        return st1.isEmpty() && st2.isEmpty();
    }
}
