class MinStack {
    Stack<Long> st = new Stack<>();
    long minVal;

    public MinStack() {
    }

    public void push(int val) {
        if (st.isEmpty()) {
            st.push(0L); // store diff as 0
            minVal = val;
        } else {
            long diff = (long) val - minVal;
            st.push(diff);
            if (diff < 0) {
                minVal = val;
            }
        }
    }

    public void pop() {
        long diff = st.pop();
        if (diff < 0) {
            minVal = minVal - diff;
        }
    }

    public int top() {
        long diff = st.peek();
        if (diff >= 0) {
            return (int) (minVal + diff);
        } else {
            return (int) minVal;
        }
    }

    public int getMin() {
        return (int) minVal;
    }
}
