class MyQueue {

    Stack<Integer> st1;
    Stack<Integer> st2;
    public MyQueue() {
        st1 = new Stack<>();
        st2 = new Stack<>();
    }
    
    public void push(int x) {
        st1.push(x);
    }
    
    public int pop() {
        while(st1.isEmpty()==false){
            st2.push(st1.pop());
        }
        int poppedValue = st2.pop();
        while(st2.isEmpty()==false){
            st1.push(st2.pop());
        }
        return poppedValue;
    }
    
    public int peek() {
     while(st1.isEmpty()==false){
            st2.push(st1.pop());
        }
        int top = st2.peek();
        while(st2.isEmpty()==false){
            st1.push(st2.pop());
        }
        return top;   
    }
    
    public boolean empty() {
        if(st1.size()==0){
            return true;
        }
        return false;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
