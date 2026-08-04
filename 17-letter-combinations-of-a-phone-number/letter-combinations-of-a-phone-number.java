class Solution {
    String[]all={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    List<String> ans=new ArrayList<>();
    void comb(String digits,int idx,StringBuilder build){
        if(idx==digits.length()){
            ans.add(build.toString());
            return;
        }
        String s=all[digits.charAt(idx)-'0'];
        for(int i=0; i<s.length(); i++){
            build.append(s.charAt(i));
            comb(digits,idx+1,build);
            build.deleteCharAt(build.length()-1);
        }
    } 
    public List<String> letterCombinations(String digits) {
        
        comb(digits,0,new StringBuilder());
        return ans;
        
    }
}