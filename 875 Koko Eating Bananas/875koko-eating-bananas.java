class Solution {
    public long speed(int arr[],int guess){
        int n=arr.length;
        long hour=0;
        for(int i=0;i<n;i++){
            hour=hour+arr[i]/guess;
            if(arr[i]%guess!=0){
                hour++;
            }
        }
        return hour;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high=piles[0];
        for(int i=1;i<piles.length;i++){
            if(high<piles[i]){
                high=piles[i];
            }
        }
        int ans=-1;
        while(low<=high){
            int mid=(high+low)/2;
            long hour=speed(piles,mid);
            if(hour>h){
                low=mid+1;
            }else{
                ans=mid;
                high=mid-1;
            }
        }
        return ans;
    }
}