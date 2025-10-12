class Solution {
    public int minDistance(String s, String w) {
        int n= s.length();
        int m= w.length();
        int[][] dp = new int[n+1][m+1];
        for(int i=1;i<n+1;i++){
            dp[i][0]=i;
        }
        for(int i=1;i<m+1;i++){
            dp[0][i]=i;
        }


        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                 if(s.charAt(i-1)==w.charAt(j-1)){
                    dp[i][j]= dp[i-1][j-1];
                }
                else{
        // delete 
        int a= 1+dp[i-1][j];
        // insert
        int b= 1+dp[i][j-1];
        // replace
        int c=1+dp[i-1][j-1];
        dp[i][j] = Math.min(a,Math.min(b,c));
                }
            }
        }
       

        return dp[n][m];
    }
}
