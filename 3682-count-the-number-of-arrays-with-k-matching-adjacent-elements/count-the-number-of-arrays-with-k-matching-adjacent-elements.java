class Solution {

public static final int MOD = 1000000007;

    public int findPower(int a, int b ){
         long res = 1, base = a % MOD;
        while (b > 0) {
            if ((b & 1) == 1) res = (res * base) % MOD;
            base = (base * base) % MOD;
            b >>= 1;
        }
        return (int) res;
    }

    public  long ncr(int n, int r, long[] factorial, long[] FermatFact){
    //ncr = n! / (n-r)! * r!
     return (((factorial[n] * FermatFact[n - r]) % MOD) * FermatFact[r]) % MOD;
    } 

    public int countGoodArrays(int n, int m, int k) {
       if (k > n - 1) return 0;

        long[] factorial = new long[n + 1];
        factorial[0] = 1;
        for (int i = 1; i <= n; i++) {
            factorial[i] = (factorial[i - 1] * i) % MOD;
        }

        long[] FermatFact = new long[n + 1];
        for (int i = 0; i <= n; i++) {
            FermatFact[i] = findPower((int) factorial[i], MOD - 2);
        }

        long result = ncr(n - 1, k, factorial, FermatFact);
        result = (result * m) % MOD;
        result = (result * findPower(m - 1, n - 1 - k)) % MOD;

        return (int) result;
    }
}