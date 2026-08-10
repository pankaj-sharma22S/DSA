class Solution {
    public String countAndSay(int n) {
        String res="1";
        for(int i=2; i<=n; i++){
            int count=1;
            StringBuilder ans=new StringBuilder();
            for(int j=1; j<res.length(); j++){
                if(res.charAt(j)==res.charAt(j-1)){
                    count++;
                }
                else{
                    ans.append(count);
                    ans.append(res.charAt(j-1));
                    count=1;
                }
            }
            ans.append(count); 
            ans.append(res.charAt(res.length() - 1));
            res=ans.toString();
        }
        return res;
    }
}