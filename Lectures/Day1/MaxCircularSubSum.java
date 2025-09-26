class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int sum = 0;
        int n = nums.length;
        int y = kadnes(nums);

        if (y<0) return y;

        for (int i=0;i<n;i++) {
            sum += nums[i];
            nums[i]*=-1;
        }

        int k =kadnes(nums);
        return Math.max(y,k+sum);
    }

    public int kadnes(int[] arr) {
        int ans = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            ans = Math.max(sum, ans);
            if (sum < 0) sum = 0;
        }
        return ans;
    }
}
