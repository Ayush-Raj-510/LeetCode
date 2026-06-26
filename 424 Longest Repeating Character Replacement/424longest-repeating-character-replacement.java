class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer> map =new HashMap<>();
        int low=0;
        int ans=0;
        int maxfreq=0;
        for(int high=0;high<s.length();high++){
            char ch=s.charAt(high);
            map.put(ch,map.getOrDefault(ch,0)+1);
            maxfreq=Math.max(maxfreq,map.get(ch));
            while((high-low+1)-maxfreq>k){
                char leftchar=s.charAt(low);
                map.put(leftchar,map.get(leftchar)-1);
                low++;
            }
            ans=Math.max(ans,high-low+1);
        }
        return ans;
    }
}