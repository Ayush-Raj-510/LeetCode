class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character,Integer> bal=new HashMap<>();
        bal.put('b',1);
        bal.put('a',1);
        bal.put('l',2);
        bal.put('o',2);
        bal.put('n',1);
        HashMap<Character,Integer> t=new HashMap<>();
        for(int i=0;i<text.length();i++){
            char ch=text.charAt(i);
            t.put(ch,t.getOrDefault(ch,0)+1);
        }
        int ans = Integer.MAX_VALUE;

        String s = "balon";

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);

            int available = t.getOrDefault(ch, 0);
            int required = bal.get(ch);

            ans = Math.min(ans, available / required);
        }

        return ans;

    }
}