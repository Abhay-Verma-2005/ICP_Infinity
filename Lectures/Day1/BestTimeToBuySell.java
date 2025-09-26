public class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        if (n == 0) return 0;

        int[] l = new int[n];  
        int[] r = new int[n];  

        int low = prices[0];
        for (int i = 0; i < n; i++) {
            low = Math.min(low, prices[i]);
            l[i] = low;
        }

        int hi = prices[n - 1];
        for (int i = n - 1; i >= 0; i--) {
            hi = Math.max(hi, prices[i]);
            r[i] = hi;
        }

        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans = Math.max(ans, r[i] - l[i]);
        }

        return ans;
    }
}
