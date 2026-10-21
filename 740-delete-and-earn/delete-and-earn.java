class Solution {
     Map<Integer,Integer> cache =new HashMap<>();
   public  int f(int n,Map<Integer,Integer> map){
        if(cache.containsKey(n)){
            return cache.get(n);
        }
        if(n==0){
            return 0;
        }
        if(n==1){
            return map.getOrDefault(1,0);
        }

        cache.put( n,Math.max(
            map.getOrDefault(n,0)+f(n-2,map),f(n-1,map)
        ));
        return cache.get(n);
    }
    public int deleteAndEarn(int[] nums) {
        Map<Integer,Integer> map =new HashMap<>();
    int max=0;
    for(int num:nums){
        max=Math.max(max,num);
       if(map.containsKey(num)){
        map.put(num,map.get(num)+num);
       }
       else{
        map.put(num,num);
       }
       
    }
    return f(max,map);
    }
}