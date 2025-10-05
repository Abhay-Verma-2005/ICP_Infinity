class Solution {
    public int minDistance(String s, String w) {
        int n= s.length()-1;
        int m= w.length()-1;
        int[][] dp = new int[n+1][m+1];
        for (int[] row : dp) Arrays.fill(row, -1);
       return solve(s, w,n,m, dp);
    }
    public int solve(String s, String w,int i, int j,int[][] dp){
        if(i<0) return j+1; //exhausted s (remainings)
        if(j<0) return i+1; //exhauseted w
        if(dp[i][j]!=-1) return dp[i][j];
        if(s.charAt(i)==w.charAt(j)){
            dp[i][j]=solve(s,w,i-1,j-1,dp);
            return dp[i][j];
        }
        // delete 
        int a= 1+solve(s,w,i-1,j,dp);
        // insert
        int b= 1+solve(s,w,i,j-1,dp);
        // replace
        int c= 1+solve(s,w,i-1,j-1,dp);
        dp[i][j] = Math.min(a,Math.min(b,c));
        return dp[i][j];
    }
}
