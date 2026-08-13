class Solution {
    int value(char c){
        if(c=='I'){
            return 1;
        }
        else if(c=='V'){
            return 5;
        }
         else if(c=='X'){
            return 10;
        }
         else if(c=='L'){
            return 50;
        }
         else if(c=='C'){
            return 100;
        }
         else if(c=='D'){
            return 500;
        }
        return 1000;
    }
    public int romanToInt(String s) {
        int ans=0;
        for(int i=0; i<s.length(); i++){
            int v=value(s.charAt(i));
            if(i+1<s.length() && v<value(s.charAt(i+1))){
                ans-=v;
            }
            else{
                ans+=v;
            }
        }
        return ans;
    }
}