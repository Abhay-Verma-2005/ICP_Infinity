class Solution {
    public int uniquePaths(int n, int m) {
        int[][] dp=new int[n][m];
        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i], -1);
        }
        int ans=solve(n,m,0,0,dp);
        return ans;
    }
    public int solve(int n, int m, int r, int c,int[][]dp){
        if(r==n-1 && c==m-1){
            return 1;
        }
        if(r>=n || c>=m){
            return 0;
        }
        if (dp[r][c] != -1) {
            return dp[r][c];
        }

        int rt=solve(n,m,r+1,c,dp);
        int ct=solve(n,m,r,c+1,dp);
        dp[r][c]=rt+ct;
        return dp[r][c];
    }
}
