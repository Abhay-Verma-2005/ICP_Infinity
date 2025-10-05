class Solution {
    public int lengthOfLIS(int[] nums) {
        ArrayList<Integer>  arr = new ArrayList<>();
        int l=0;
        for(int i=0;i<nums.length;i++){
            int idx=lowerBound(arr,nums[i]);
            if (idx == arr.size()) {
                arr.add(nums[i]);
            } else {
                arr.set(idx, nums[i]);
            }
        }
        return arr.size();
    }
     public int lowerBound(ArrayList<Integer> list, int tar) {
        int lo = 0;
        int hi = list.size();

        while (lo < hi) {
            int mid = (lo + hi) / 2;
            if (list.get(mid) >= tar) {
                hi = mid;
            } else {
                lo = mid + 1;
            }
        }
        return lo;
    }
}
