class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int[][][] dp=new int[n][2][3]; 

        for(int i= 0;i<n;i++) {
            for(int j=0;j<2;j++) {
                Arrays.fill(dp[i][j], -1);
            }
        }

        return solve(prices,0, 0,2,dp);
    }
    public int solve(int[] prices, int i,int b,int cap,int[][][] dp){
        if(i==prices.length) return 0;
        if(cap==0) return 0;
        int profit=0;

        if (dp[i][b][cap] != -1) return dp[i][b][cap];
        //buy
        if(b==0){
            profit=Math.max(-prices[i]+solve(prices,i+1,1,cap,dp),//take
                            0+solve(prices,i+1,0,cap,dp));//not take
        }
        //sell
        else{
            profit=Math.max(prices[i]+solve(prices,i+1,0,cap-1,dp),//sell
                            0+solve(prices,i+1,1,cap,dp));//not sell
        }
        return dp[i][b][cap]=profit;
    }
}
