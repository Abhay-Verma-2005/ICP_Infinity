class Solution {
    public int search(int[] nums, int targ) {
        int lo=0;
        int hi=nums.length-1;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(nums[mid]==targ){
                return mid;
            }
            // left sorted
            if(nums[lo]<=nums[mid]){
                if(targ>=nums[lo] && targ<nums[mid]){
                    hi=mid-1;
                }
                else{
                    lo=mid+1;
                }
            }
            // right sorted
            else{
                if(targ>nums[mid] && targ<=nums[hi]){
                    lo=mid+1;
                }
                else{
                    hi=mid-1;
                }
            }
        }
        return -1;
    }
}
