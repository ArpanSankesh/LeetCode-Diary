class MinStack {
    Stack<Pair<Integer, Integer>> st = new Stack<>();
    public MinStack() {
        
    }
    
    public void push(int val) {
        if(st.empty()){
            st.push(new Pair<>(val, val));
        } else {
            int minVal = Math.min(val, st.peek().getValue());
            st.push(new Pair<>(val, minVal));
        }
    }
    
    public void pop() {
        st.pop();
    }
    
    public int top() {
        return st.peek().getKey();
    }
    
    public int getMin() {
        return st.peek().getValue();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */