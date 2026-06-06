class Solution {
    public void sortColors(int[] nums) {
        int countzero=0;
        int countone=0;
        int counttwo=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                countzero++;
            }
            else if(nums[i]==1){
                countone++;
            }else{
                counttwo++;
            }
        }
        int index = 0;
        while (countzero-- > 0) {
            nums[index] = 0;
            index++;
        }
        while (countone-- > 0) {
            nums[index] = 1;
            index++;
        }

        while (counttwo-- > 0) {
            nums[index] = 2;
            index++;
        }
    }
}