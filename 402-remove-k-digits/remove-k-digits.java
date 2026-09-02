class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Integer> s=new Stack<Integer>();
        int n=num.length();
        StringBuilder ans=new StringBuilder();
        
        for(int i=0; i<=n; i++){
            while(k>0 && !s.isEmpty()&&(i==n||num.charAt(s.peek())>num.charAt(i))){
                int idx=s.pop();
                k--;
            }
            if(i<n){
            s.push(i);
            }
        }
        while(k>0 &&  !s.isEmpty()){
            s.pop();
            k--;
        }
        for(int i=0; i<n; i++){
            if(s.isEmpty()){
                break;
            }
            ans.append(num.charAt(s.pop()));
        }
        int start=0;
        ans.reverse();
        int m=ans.length();
        while(start<ans.length()&&ans.charAt(start)=='0'){
                start++;
        }
        
        ans.delete(0,start);
        return start==m?"0":ans.toString();
       
    }
}