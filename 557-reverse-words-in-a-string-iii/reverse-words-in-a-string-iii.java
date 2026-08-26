class Solution {
    public String reverseWords(String s) {
     s=s.trim();
     int n=s.length()-1;
    int i=0;
    StringBuilder str=new StringBuilder();
    for(int r=0; r<=n; r++){
        if(s.charAt(r)!=' '){
            str.append(s.charAt(r));

        }
        else if(r>0&&s.charAt(r-1)!=' '){
            str.append(' ');

        }
    }
    int j=str.length();
    int left=0;
    for(int k=0; k<=j; k++){
        if(k==j||str.charAt(k)==' '){
        int m=k-1;
        while(left<m){
        char temp=str.charAt(left);
        str.setCharAt(left,str.charAt(m));
        str.setCharAt(m,temp); 
        left++;
        m--;
        }
     left=k+1;
     }
    }
   
    return str.toString();
    }
}