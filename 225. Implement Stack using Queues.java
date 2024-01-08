Ques link - https://leetcode.com/problems/implement-stack-using-queues/

-------------------------------------- Solution ----------------------------------------------

class MyStack {
    private Queue<Integer> q = new ArrayDeque<>();
    
    public void push(int x) {
        q.add(x);
        for(int i = 1 ; i < q.size() ; i++)
            q.add(q.remove());
    }

    public int pop() {
        return q.remove();
    }

    public int top() {
        return q.peek();
    }

    public boolean empty() {
        return q.isEmpty();
    }
}
