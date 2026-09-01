class Solution {
    public int maximalRectangle(char[][] matrix) {
        int[][]mat=new int[matrix.length][matrix[0].length];
        int r=matrix.length;
        int c=matrix[0].length;
        int maxArea=Integer.MIN_VALUE;
    
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                mat[i][j]=matrix[i][j]-'0';
            }
        }
        for(int i=1; i<r; i++){
            for(int j=0; j<c; j++){
                if(mat[i][j]==1){
                mat[i][j]+=mat[i-1][j];
            }
            }
        }
        
        for(int[]arr:mat){
        Stack<Integer> s=new Stack<>();

            for(int i=0; i<=arr.length; i++){
                int temp=(i==arr.length)?0:arr[i];
                while(!s.isEmpty()&& arr[s.peek()]>temp){
                    int idx=s.pop();
                    int height=arr[idx];
                    int left=s.isEmpty()?-1:s.peek();
                    int right=i;
                    int width=right-left-1;
                    maxArea=Math.max(maxArea,height*width);
                }
                if(i<arr.length){
                s.push(i);
            }
            }
        }
        return maxArea==Integer.MIN_VALUE?0:maxArea;
        
    }
}