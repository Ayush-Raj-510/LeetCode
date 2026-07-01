class Solution {
    public boolean detectCapitalUse(String word) {
        int count=0;
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            if(Character.isUpperCase(ch)){
                count++;
            }
        }
        if(count==word.length() || count==0 || count==1 && word.charAt(0) >= 'A' && word.charAt(0) <= 'Z' ){
            return true;
        }
        return false;
    }
}