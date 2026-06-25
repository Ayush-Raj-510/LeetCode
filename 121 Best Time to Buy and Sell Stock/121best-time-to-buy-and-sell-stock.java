class Solution {
    public int maxProfit(int[] prices) {
        int min=prices[0];
        int maxprofit=Integer.MIN_VALUE;
        for(int i=1;i<prices.length;i++){
            if(prices[i]<min){
                min=prices[i];
            }
            int profit=prices[i]-min;
            maxprofit=Math.max(maxprofit,profit);
        }
        if(maxprofit==Integer.MIN_VALUE){
            return 0;
        }
        return maxprofit;
    }
}