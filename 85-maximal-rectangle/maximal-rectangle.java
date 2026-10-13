class Solution {
    public int maximalRectangle(char[][] matrix) {
        if (matrix.length == 0) return 0;
        int[] height=new int[matrix[0].length];
        int n=matrix.length;
        int m=matrix[0].length;
        int ans=0;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
               if (matrix[i][j] == '1') {
                  height[j]++;
                  }
              else {
                height[j] = 0;
                }
            }
        Stack<Integer> stack=new Stack<>();
        
        for(int i2=0; i2<=m; i2++){
            int curr=(i2==m)?0:height[i2];
            while(!stack.isEmpty() && height[stack.peek()]>curr){
                int h=height[stack.pop()];
                int right=i2-1;
                int left=stack.isEmpty()?0:stack.peek()+1;
                int width=right-left+1;
                System.out.println(right);
                
                System.out.println(width);
                ans=Math.max(ans,h*width);
            }
            if(i2<m){
                stack.push(i2);
            }
        }
    }
        return ans;
    }
}