class Solution {
    public boolean checkValidString(String s) {
     int high=0;
     int low=0;
     for(int i=0; i<s.length(); i++){
     if(s.charAt(i)=='('){
        high++;
        low++;
     }
     else if(s.charAt(i)==')'){
        high--;
        low--;
     }
     else{
        high++;
        low--;
     }
     
     
    
     if(high<0){
        return false;
     }
     if(low<0){
        low=0;
     } 
     }
     return low==0;
    }
}