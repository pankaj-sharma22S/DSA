class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:nums1){
            if(!map.containsKey(num)){
                map.put(num,1);
            }
            else{
                map.put(num,map.get(num)+1);
            }
        }
        int k=0;
        int []ans=new int[nums1.length];
        for(int num:nums2){
            int count=map.getOrDefault(num,0);
            if(count==0){
                continue;
            }
            else{
                ans[k++]=num;
                map.put(num,map.get(num)-1);

            }

        }
        return Arrays.copyOfRange(ans,0,k);
    }
}