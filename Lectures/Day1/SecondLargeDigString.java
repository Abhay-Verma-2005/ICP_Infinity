class Solution {
    public int secondHighest(String s) {
        int l=-1;
        int sl=-1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                int x=s.charAt(i) -'0';
                if(x>l){
                    sl=l;
                    l=x;
                }
                else if(x<l && x>sl){
                    sl=x;
                }
            }
        }
        return sl;
    }
}
