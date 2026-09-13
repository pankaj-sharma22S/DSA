class Solution {
    Map<Integer,Integer> map=new TreeMap<>();
    public boolean carPooling(int[][] trips, int capacity) {
        for(int []n:trips){
            int pass=n[0];

            map.put(n[1],map.getOrDefault(n[1],0)+pass);
            map.put(n[2],map.getOrDefault(n[2],0)-pass);

        }
        int count=0;
        for(int n:map.values()){
            count+=(n);
            if(count>capacity){
                return false;
            }
        }
        return true;
    }
}