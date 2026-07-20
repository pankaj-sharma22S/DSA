class Solution {
    public String addBinary(String a, String b) {
       int i=a.length()-1;
       int j=b.length()-1;
       int c=0;
       int k=0;
       StringBuilder ans = new StringBuilder();
       while(i>=0||j>=0||c!=0){
        int sum=0;
        if(i>=0){
            sum+=a.charAt(i--)-'0';
        }
        if(j>=0){
            sum+=b.charAt(j--)-'0';

        }
        ans.append((sum+c)%2);
        c=(sum+c)/2;
      
       }
  
       return ans.reverse().toString();
    }
}