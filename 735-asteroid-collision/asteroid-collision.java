class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();

        for (int astroid : asteroids) {
            boolean destroyed = false;

            while (!st.isEmpty() && astroid < 0 && st.peek() > 0) {
                if (st.peek() < -astroid) {
                    st.pop();
                    continue;
                } else if (st.peek() == -astroid) {
                    st.pop();
                }
                destroyed = true;
                break;
            }
            if (!destroyed) {
                st.push(astroid);
            }
        }
        int[] result = new int[st.size()];
        for (int i = st.size() - 1; i >= 0; i--) {
            result[i] = st.pop();
        }

        return result;

    }
}