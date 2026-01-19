class Solution {
    public int strStr(String h, String n) {
        int i = 0, j = 0;
        while (i < h.length()) {
            if (h.charAt(i) == n.charAt(j)) {
                i++; j++;
                if (j == n.length()) return i - j;
            } else {
                i = i - j + 1; 
                j = 0;
            }
        }
        return -1;
    }
}
