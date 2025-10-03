class Solution {
    public void reverseString(char[] s) {
        int n=s.length-1;
        reverse(s,0,n);
    }
    public void reverse(char[] s, int i, int e){
        if(i>=e) return;
        char temp=s[i];
        s[i]=s[e];
        s[e]=temp;
        reverse(s,++i,--e);
    }
}