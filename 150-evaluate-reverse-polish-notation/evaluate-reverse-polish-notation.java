class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();

        for (String token : tokens) {
            switch (token) {
                case "+":
                    st.push(add(st.pop() , st.pop()));
                    break;

                case "-":
                     st.push(sub(st.pop() , st.pop()));
                    break;

                case "*":
                     st.push(mul(st.pop() , st.pop()));
                    break;

                case "/":
                     st.push(div(st.pop() , st.pop()));
                    break;

                default:
                    st.push(Integer.parseInt(token));
            }
        }

        return st.pop();
    }
    public static int add(int a , int b){
        return a + b;
    }
    public static int sub(int a , int b){
        return b - a;
    }
    public static int mul(int a , int b){
        return a * b;
    }
    public static int div(int a , int b){
        return b / a;
    }
}