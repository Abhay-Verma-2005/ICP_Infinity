class Solution {
    boolean isPalindrome(String s) {
        return palin(s,0,s.length()-1);
    }
    public boolean palin(String s,int i,int e){
        if(i>=e) return true;
        return s.charAt(i)==s.charAt(e) && palin(s,++i,--e);
    }
}