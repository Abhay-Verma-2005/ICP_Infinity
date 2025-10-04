class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        subset(nums, 0, new ArrayList<>(), ans);
        return ans;
    }
    public void subset(int[] arr, int i,List<Integer> ll,List<List<Integer>> ans) {
         if (i == arr.length) {
            ans.add(new ArrayList<>(ll)); 
            return;
         }
        //include
        ll.add(arr[i]);
        subset(arr, i + 1, ll, ans);
        
        //exclude
        ll.remove(ll.size() - 1);

        int idx=i+1;
        while(idx<arr.length && arr[idx]==arr[i]) idx++;
        subset(arr, idx, ll, ans);
        
    }

}
