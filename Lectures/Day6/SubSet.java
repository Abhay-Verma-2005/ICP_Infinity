class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        subset(nums, 0, new ArrayList<>(), ans);
        return ans;
    }
    public void subset(int[] arr, int i,List<Integer> ll,List<List<Integer>> ans) {
         if (i == arr.length) {
            ans.add(new ArrayList<>(ll)); 
            return;
        }
        subset(arr, i + 1, ll, ans);
        ll.add(arr[i]);
        subset(arr, i + 1, ll, ans);
        ll.remove(ll.size() - 1);
    }
}