class Solution {
    public int longestOnes(int[] nums, int k) {
        int s= 0,maxlen=0, flip=0;
        for (int end=0; end<nums.length; end++) {
            if (nums[end]==0) flip++;

            while (flip>k) {
                if (nums[s]==0) flip--;
                s++;
            }

            maxlen=Math.max(maxlen, end - s+1);
        }
        return maxlen;
    }
}
