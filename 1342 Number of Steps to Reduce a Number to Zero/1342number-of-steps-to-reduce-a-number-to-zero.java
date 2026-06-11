class Solution {
    public int numberOfSteps(int num) {
        int count = 0;
        int ans = num;
        while (ans > 0) {
            if (ans % 2 == 0) {
                ans = ans / 2;
                count++;
            } else {
                ans = ans - 1;
                count++;
            }
        }
        return count;
    }
}