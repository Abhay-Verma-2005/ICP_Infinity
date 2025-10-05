class Solution {
    public int maxProfit(int[] prices) {
        int [][] dp=new int[prices.length][2];
        for(int[] e: dp) Arrays.fill(e,-1);

        return solve(prices,0, 0,dp);
    }
    public int solve(int[] prices, int i,int b,int[][] dp){
        if(i==prices.length) return 0;
        int profit=0;
        if(dp[i][b]!=-1){
            return dp[i][b];
        }
        //buy
        if(b==0){
            profit=Math.max(-prices[i]+solve(prices,i+1,1,dp),//take
                            0+solve(prices,i+1,0,dp));//not take
        }
        //sell
        else{
            profit=Math.max(prices[i]+solve(prices,i+1,0,dp),//sell
                            0+solve(prices,i+1,1,dp));//not sell
        }
        return dp[i][b]=profit;
    }
}
