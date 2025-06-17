class Solution {
    static final int MOD = 1_000_000_007;
    long[] fact, invFact;

    public int countGoodArrays(int n, int m, int k) {
        if (k > n - 1) return 0;

        precompute(n);

        long res = (nCr(n - 1, k) * m) % MOD;
        res = (res * modPow(m - 1, n - 1 - k)) % MOD;

        return (int) res;
    }

    // Modular Exponentiation (Iterative and Fast)
    long modPow(long base, long exp) {
        long result = 1;
        base %= MOD;
        while (exp > 0) {
            if ((exp & 1) == 1)
                result = (result * base) % MOD;
            base = (base * base) % MOD;
            exp >>= 1;
        }
        return result;
    }

    // Precompute factorials and inverse factorials
    void precompute(int n) {
        fact = new long[n + 1];
        invFact = new long[n + 1];

        fact[0] = 1;
        for (int i = 1; i <= n; i++)
            fact[i] = (fact[i - 1] * i) % MOD;

        invFact[n] = modPow(fact[n], MOD - 2);
        for (int i = n - 1; i >= 0; i--)
            invFact[i] = (invFact[i + 1] * (i + 1)) % MOD;
    }

    // nCr using precomputed arrays
    long nCr(int n, int r) {
        if (r < 0 || r > n) return 0;
        return (((fact[n] * invFact[r]) % MOD) * invFact[n - r]) % MOD;
    }
}
