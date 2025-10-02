class Solution {
    public int characterReplacement(String s, int k) {
        int j=0,maxLen=0,maxCount=0;
        int n=s.length();
        int[] freq=new int[26];
        for(int i=0;i<n;i++){
            freq[s.charAt(i)-'A']++;
            maxCount=Math.max(maxCount,freq[s.charAt(i)-'A']);
            while((i-j+1)-maxCount>k){
                freq[s.charAt(j)-'A']--;
                j++;
            }
            maxLen=Math.max(maxLen,i-j+1);
        }
        return maxLen;
    }
}
