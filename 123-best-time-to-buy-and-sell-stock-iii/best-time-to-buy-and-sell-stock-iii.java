class Solution {
    public int maxProfit(int[] prices) {
        int[] left=new int[prices.length];
        int min=prices[0];
        int[] right=new int[prices.length];
        for(int i=1; i<prices.length; i++){
           min=Math.min(min,prices[i]);
           left[i]=Math.max(left[i-1],prices[i]-min);
        }
        int max=prices[prices.length-1];
         for(int i=prices.length-2; i>=0; i--){
           max=Math.max(max,prices[i]);
           right[i]=Math.max(right[i+1],max - prices[i]);
        }
        int ans = 0;

        for (int i = 0; i < prices.length; i++) {
            ans = Math.max(ans, left[i] + right[i]);
        }

        return ans;
    }
}