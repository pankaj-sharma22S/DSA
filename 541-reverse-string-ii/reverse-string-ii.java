class Solution {
    StringBuilder  reverse(StringBuilder str,int st,int end){
        
        while(st<end){
            char temp=str.charAt(st);
            str.setCharAt(st,str.charAt(end));
            str.setCharAt(end,temp);
            st++;
            end--;
        }
        
        return str;
    }
    public String reverseStr(String s, int k) {
        int left=0;
        StringBuilder ans=new StringBuilder(s);
          int n=s.length();
        for(int i=0; i<n; i++){
            if(i-left==k-1){
             ans=reverse(ans,left,i);
            left=k+i+1;
            }
        }
        if(left<n){
             ans=reverse(ans,left,n-1);
        }
        return ans.toString();

    }
}