class Solution {
    public int maxDistance(List<List<Integer>> arrays) {

        int min=arrays.get(0).get(0);
        int size=arrays.get(0).size();
        int ans=0; 
        int max=arrays.get(0).get(size-1);
        for(int i=1; i<arrays.size(); i++){
            int nsize=arrays.get(i).size();
            
                int nmax=arrays.get(i).get(nsize-1);
                int nmin=arrays.get(i).get(0);
                ans=Math.max(ans,nmax-min);
                ans=Math.max(ans,max-nmin); 
                min=Math.min(min,arrays.get(i).get(0));
                max=Math.max(max,arrays.get(i).get(nsize-1));
            
        }
return ans;
    }
}