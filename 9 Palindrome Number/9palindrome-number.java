class Solution {
    public boolean isPalindrome(int x) {
        int originalno = x;
        int revn = 0;
        while (originalno > 0) {
            int ld = originalno % 10;
            revn = (revn * 10) + ld;
            originalno = originalno / 10; 
        }
        if (x == revn) {
            return true;
        } else {
            return false;
        }
    }
}