class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        int ans=Integer.MIN_VALUE;
        int left=0;
        if(s.length()==0){
            return 0;
        }
        for(int i=0; i<s.length(); i++){
            if(map.containsKey(s.charAt(i) )&& map.get(s.charAt(i))>=left){
                left=map.get(s.charAt(i))+1; 
               
            }
            
                map.put(s.charAt(i),i);
                ans=Math.max(ans,i-left+1);
            
        }
        return ans;
    }
}