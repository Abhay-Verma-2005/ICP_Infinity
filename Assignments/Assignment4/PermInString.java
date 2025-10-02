class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length()>s2.length()) return false;

        int[] freq1 = new int[128];
        for (int i = 0; i < s1.length(); i++) {
            freq1[s1.charAt(i)]++;
        }

        for (int i = 0; i <= s2.length() - s1.length(); i++) {
            if (check(freq1, s2, i, i + s1.length())) {
                return true;
            }
        }

        return false;
    }

    public boolean check(int[] freq, String s, int st, int en) {
        int[] temp = freq.clone();  
        for (int i = st; i < en; i++) {
            temp[s.charAt(i)]--;
        }
        for (int val : temp) {
            if (val != 0) return false;
        }
        return true;
    }
}
