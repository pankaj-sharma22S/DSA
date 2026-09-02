class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> s=new Stack<>();
        
        for(int i=0; i<asteroids.length; i++){
            int isadd=1;
            while(!s.isEmpty()&& asteroids[s.peek()]>0 && asteroids[i]<0){
                if( asteroids[s.peek()]<Math.abs(asteroids[i])){
                s.pop();
                
                }

                else if(asteroids[s.peek()]==Math.abs(asteroids[i])){
                    s.pop();
                    isadd=0;
                    break;
                }
                 else if(asteroids[s.peek()]>Math.abs(asteroids[i])){
                   
                    isadd=0;
                    break;
                }
                else{
                    
                    break;
                }
               
            }
        if(isadd==1){
        s.push(i);
        
        }
        // if(s.isEmpty()){
        //     return;
         }
        int[]ans=new int[s.size()];
        
        for(int j=s.size()-1; j>=0; j--){
            ans[j]=asteroids[s.pop()];
        }
        return ans;

    }
}