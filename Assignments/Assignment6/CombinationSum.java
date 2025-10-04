class Solution {
    public List<List<Integer>> combinationSum(int[] arr, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> ll=new ArrayList<>();
        solve(arr,target,0,0,ll,ans);
        return ans;
    }
    public void solve(int [] arr, int tar, int i, int curr, List<Integer> ll,List<List<Integer>> ans){
        if(curr==tar){
            ans.add(new ArrayList<>(ll));
            return;
        }
        if(i>=arr.length || curr > tar) return;
        ll.add(arr[i]);
        solve(arr,tar,i,curr+arr[i],ll,ans);
        ll.remove(ll.size()-1);
        solve(arr,tar,i+1,curr,ll,ans);
    }
}
