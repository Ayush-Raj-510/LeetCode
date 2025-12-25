class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int maxm=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
                if(count>maxm){
                maxm=count;
                }
            }
            else{
                count=0;
            }   
        }
        return maxm;
    }
}