class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<numbers.length;i++){
            int present=target-numbers[i];
            if(map.containsKey(present)){
                return new int[] {map.get(present)+1,i+1};
            }
            map.put(numbers[i],i);
        }

        return new int[] {};
    }
}