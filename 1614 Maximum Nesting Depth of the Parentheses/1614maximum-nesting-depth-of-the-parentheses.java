class Solution {
    public int maxDepth(String s) {
        int maxm = 0;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                count++;
                if (count > maxm) {
                    maxm = count;
                }
            }
            if (s.charAt(i) == ')') {
                count--;
            }
        }
        return maxm;
    }
}