class Solution {
    public int maxArea(int[] height) {
        int st=0;
        int end=height.length-1;
        int area=0;
        while(st<end){
        
            int h=Math.min(height[st],height[end]);
            int width=end-st;
            area=Math.max(area,h*width);
                if(height[st]<height[end]){
                st++;
            }
             else{
                end--;
             }
        }
        return area;
    }
}