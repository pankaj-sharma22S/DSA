class Solution {
    public int binaryGap(int n) {
        long a=n;
        StringBuilder s=new StringBuilder();
        
        while(n!=0){
           
          s.append(n%2);
          n=n/2;

        }
        s.reverse();
        System.out.println(s);
       int ans=0;
        int k=0;
        int m=0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)-'0'==1){
                k=i;
                 for(int l=k+1; l<s.length(); l++){
                if(s.charAt(l)-'0'==1){
                m=l;
                ans=Math.max(ans,m-k);
                break;
                
            }     
         }
            }
        }

  return ans;
    }
}