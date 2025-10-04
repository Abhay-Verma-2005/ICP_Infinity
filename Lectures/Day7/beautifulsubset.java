class Solution {
    public int beautifulSubsets(int[] nums, int k) {
        ArrayList<Integer> arr = new ArrayList<>();
        return solve(nums,k ,0,arr);
    }

    public int solve(int[] nums, int k , int i,ArrayList<Integer> arr){
        if(i==nums.length) return 0;
        int ans=0;
        if(issafe(arr,nums[i],k)){
            arr.add(nums[i]);
            ans=1+solve(nums,k,i+1,arr);
            arr.remove(arr.size()-1);
        }
        int ans2=solve(nums,k,i+1,arr);
        return ans+ans2;
        
    }

    public boolean issafe(ArrayList<Integer> arr, int num, int k){
        for(int ele : arr){
            if(Math.abs(num - ele) == k) return false;
        }
        return true;
    }
}
