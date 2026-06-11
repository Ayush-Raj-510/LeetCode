class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> ran=new HashMap<>();
        HashMap<Character,Integer> mag=new HashMap<>();
        for(int i=0;i<ransomNote.length();i++){
            char ch=ransomNote.charAt(i);
            ran.put(ch,ran.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<magazine.length();i++){
            char ch=magazine.charAt(i);
            mag.put(ch,mag.getOrDefault(ch,0)+1);
        }
        if(ran.size()>mag.size()){
            return false;
        }
        for(int i=0;i<ransomNote.length();i++){
            char ch=ransomNote.charAt(i);
            if(! mag.containsKey(ch) || mag.get(ch)<ran.get(ch)){
                return false;
            }
        }
        return true;
    }
}