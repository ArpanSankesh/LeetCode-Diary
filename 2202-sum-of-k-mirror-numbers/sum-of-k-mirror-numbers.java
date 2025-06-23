class Solution {
    public long kMirror(int k, int n) {
        long sum = 0;
        int count = 0;

        // Generate palindromes by building half and mirroring it
        for (int length = 1; ; length++) {
            // Odd length palindromes
            for (long half = (long)Math.pow(10, (length - 1) / 2); half < (long)Math.pow(10, (length + 1) / 2); half++) {
                long num = buildPalindrome(half, length % 2 == 1);
                if (isPalindrome(toBaseK(num, k))) {
                    sum += num;
                    count++;
                    if (count == n) return sum;
                }
            }
        }
    }

    // Build base-10 palindrome from half
    private long buildPalindrome(long half, boolean oddLength) {
        long res = half;
        if (oddLength) half /= 10;
        while (half > 0) {
            res = res * 10 + (half % 10);
            half /= 10;
        }
        return res;
    }

    // Convert number to base-k as a string
    private String toBaseK(long num, int k) {
        StringBuilder sb = new StringBuilder();
        while (num > 0) {
            sb.append(num % k);
            num /= k;
        }
        return sb.toString();
    }

    // Check if a string is a palindrome
    private boolean isPalindrome(String s) {
        int l = 0, r = s.length() - 1;
        while (l < r) {
            if (s.charAt(l++) != s.charAt(r--)) return false;
        }
        return true;
    }
}
