class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ll = new ArrayList<>();
        solve(n,"",0,0,ll);
        return ll;
    }
    public static void solve(int n,String ans, int open , int close,List<String> ll){
        if(open==n && close==n){
            ll.add(ans);
            return;
        }
        if(open >n || close>open){
            return;
        }
        solve(n,ans+"(",open+1,close,ll);
        solve(n,ans+")",open,close+1,ll);
    }
}
