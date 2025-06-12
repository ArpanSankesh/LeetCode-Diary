class Solution {
    static final long M = 1_000_000_007;

    public int countGoodNumbers(long n) {
        long even = (n + 1) / 2;
        long odd = n / 2;

        long result = pow(5, even) * pow(4, odd) % M;
        return (int) result;
    }

    private long pow(long x, long n) {
        if (n == 0)
            return 1;

        if (n % 2 == 0) {
            return pow((x * x) % M, n / 2) % M;
        } else {
            return (x % M * pow(x, n - 1) % M) % M;
        }
    }

}