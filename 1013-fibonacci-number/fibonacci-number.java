class Solution {
    public int fib(int n) {
	    if(n == 1 || n == 0) return n;
	    int temp1 = fib(n-1);
	    int temp2 = fib(n-2);
	    return temp1 + temp2;
    }
}