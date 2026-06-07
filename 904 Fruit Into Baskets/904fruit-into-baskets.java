class Solution {
    public int totalFruit(int[] fruits) {
        int low=0;
        int ans=Integer.MIN_VALUE;
        HashMap<Integer,Integer> freq=new HashMap<>();
        for(int high=0;high<fruits.length;high++){
            freq.put(fruits[high],freq.getOrDefault(fruits[high],0)+1);
            while(freq.size()>2){
                freq.put(fruits[low],freq.get(fruits[low])-1);
                if(freq.get(fruits[low])==0){
                    freq.remove(fruits[low]);
                }
                low++;
            }
            int len=high-low+1;
            ans=Math.max(len,ans);
        }
        return ans;
    }
}