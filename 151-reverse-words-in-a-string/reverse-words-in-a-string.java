class Solution {
  public   void reverse(int i,int j ,StringBuilder str){
         while(i<j){
            char temp=str.charAt(i);
            str.setCharAt(i,str.charAt(j));
            str.setCharAt(j,temp);
            i++;
            j--;
        } 
    }
    public String reverseWords(String s) {
        s=s.trim();
        int n=s.length();
        StringBuilder str=new StringBuilder();
        for(int i=0; i<n; i++){
            if(s.charAt(i)!=' '){
                str.append(s.charAt(i));
            }
            else if(s.charAt(i-1)!=' '){
                str.append(s.charAt(i));
            }
        }
        int k=0, j=str.length()-1;
        while(k<j){
            char temp=str.charAt(k);
            str.setCharAt(k,str.charAt(j));
            str.setCharAt(j,temp);
            k++;
            j--;
        } 
        int left=0;
        k=0;
        j=str.length();
        while(k<=j){
            if(k==str.length()||str.charAt(k)==' '){
           reverse(left,k-1,str);
           left=k+1;
            }
            k++;
            
        } 
        return str.toString();

    }
}