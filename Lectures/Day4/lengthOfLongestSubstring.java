class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new LinkedHashSet<>();
        int max = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            while (set.contains(c)) {
                for (Character ch : set) {
                    set.remove(ch);
                    break;
                }
            }

            set.add(c);
            max = Math.max(max, set.size());
        }

        return max;
    }
}
