class Solution {
    public int reverse(int x) {
        int val = 0;
        while (x != 0) {

            int digit = x % 10;
            if ((val > Integer.MAX_VALUE / 10) || (val == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0;
            }
            if ((val < Integer.MIN_VALUE / 10 || (val == Integer.MIN_VALUE / 10 && digit < -8))) {
                return 0;
            }

            val = val * 10 + digit;
            x = x / 10;

        }
        return val;
    }
}
