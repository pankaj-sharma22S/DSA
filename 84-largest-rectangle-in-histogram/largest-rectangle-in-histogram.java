class Solution {
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        int ans=0;
        Stack<Integer> s=new Stack<>();
        for(int i=0; i<=n; i++){
            int temp=i==n?0:heights[i];
            while(!s.isEmpty()&& heights[s.peek()]>temp){
                int idx=s.pop();
                int right=i-1;
                int left=s.isEmpty()?0:s.peek()+1;
                int wid=right-left+1;
                ans=Math.max(ans,heights[idx]*wid);
            }
            if(i<n){
            s.push(i);
            }
        }
        return ans;
    }
}