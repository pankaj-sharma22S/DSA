class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0; i<stones.length(); i++){
            if(!map.containsKey(stones.charAt(i))){
                map.put(stones.charAt(i),1);
            }
            else{
                map.put(stones.charAt(i),map.get(stones.charAt(i))+1);
            }
            
        }
        int ans=0; 
          for(int i=0; i<jewels.length(); i++){
            int count=map.getOrDefault(jewels.charAt(i),0);
            ans+=count;
          }
          return ans;
    }
}