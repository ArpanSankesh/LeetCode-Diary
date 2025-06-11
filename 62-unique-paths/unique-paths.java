class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m+1][n+1];

        for(int[] row : dp){
            Arrays.fill(row, -1);
        }
        
        return countPath(m , n , dp);
    }
    private int countPath(int m , int n , int[][] dp) {
        if (m == 0 || n == 0) return 0;
        if (m == 1 && n == 1)return 1;
        if (dp[m][n] != -1) return dp[m][n];

        int up = countPath(m - 1, n,dp);
        int left = countPath(m, n - 1,dp);

        dp[m][n] = up + left;
        return dp[m][n]; 
    }
}

//   int[][] dp = new int[m][n];

//         for(int i =0 ; i < m; i++){
//             for(int j = 0 ; j< n; j++){
//                 if(i == 0 || j == 0){
//                     dp[i][j] = 1;
//                 } else{
//                     dp[i][j] = dp[i-1][j] + dp[i][j-1];
//                 }
//             }
//         }
//             return dp[m-1][n-1];
//     }