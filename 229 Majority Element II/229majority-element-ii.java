import java.util.*;

class Solution {
    public List<Integer> majorityElement(int[] nums) {

        int count1 = 0, count2 = 0;
        int element1 = 0, element2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == element1){
                count1++;
            } 
            else if (nums[i] == element2){
                count2++;
            } 
            else if (count1 == 0) {
                element1 = nums[i];
                count1++;
            }
            else if (count2 == 0) {
                element2 = nums[i];
                count2++;
            }
            else {
                count1--;
                count2--;
            }
        }

        count1 = 0;
        count2 = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == element1){
                count1++;
            } 
            else if (nums[i] == element2){
                count2++;
            } 
        }

        ArrayList<Integer> list = new ArrayList<>();
        if (count1 > nums.length / 3) {
            list.add(element1);
        }
        if (count2 > nums.length / 3) { 
            list.add(element2);
        }
        return list;
    }
}