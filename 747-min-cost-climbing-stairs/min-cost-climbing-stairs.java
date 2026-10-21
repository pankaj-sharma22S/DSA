class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] arr=new int[cost.length+1];
        arr[0]=0;
        arr[1]=0;
        for(int i=2; i<arr.length; i++){
            arr[i]=Math.min(
                cost[i-1]+arr[i-1],
                cost[i-2]+arr[i-2]
            );
        }
        return arr[arr.length-1];
    }
}