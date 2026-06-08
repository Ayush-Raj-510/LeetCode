class Solution {
    public boolean info(int arr_s[],int arr_t[]){
        for(int i=0;i<256;i++){
            if(arr_s[i]<arr_t[i]){
                return false;
            }
        }
        return true;
    }
    public String minWindow(String s, String t) {
        int arr_s[]=new int[256];
        int arr_t[]=new int[256];
        int low=0;
        int res=Integer.MAX_VALUE;
        int start=0;
        for(int i=0;i<t.length();i++){
            arr_t[t.charAt(i)]++;
        }
        for(int high=0;high<s.length();high++){
            char ch=s.charAt(high);
            arr_s[ch]++;
            while(info(arr_s,arr_t)){
                int len=high-low+1;
                if(len<res){
                    res=len;
                    start=low;
                }
                arr_s[s.charAt(low)]--;
                low++;
            }
        }
        return res == Integer.MAX_VALUE ? "" : s.substring(start, start + res);
    }
}