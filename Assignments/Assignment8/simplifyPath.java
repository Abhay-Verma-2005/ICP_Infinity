class Solution {
    public String simplifyPath(String s) {
        List<String> res = new ArrayList<>();
        String[] arr = s.split("/");

        for (String ele : arr) {
            if (ele.equals("..")) {
                if (!res.isEmpty()) {
                    res.remove(res.size() - 1);
                }
            } else if (!ele.equals("") && !ele.equals(".")) {
                res.add(ele);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (String a : res) {
            sb.append("/").append(a);
        }

        return sb.length() == 0 ? "/" : sb.toString();
    }
}
