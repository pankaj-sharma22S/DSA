class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> ans=new ArrayList<>();
        Set<String> set=new HashSet<>();
        for(int i=0; i<=s.length()-10; i++){
            String str=s.substring(i,i+10);
            if(!set.contains(str)){
                set.add(str);
            }
            else{
                if(!ans.contains(str)){
                    ans.add(str);
                }
            }
        }
        return ans;
    }
}