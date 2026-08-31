class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String,Integer> map=new HashMap<>();
        List<String> res=new ArrayList<>();
        for(int i=0; i<list1.length; i++){
            map.put(list1[i],i);
        }
        int ans=Integer.MAX_VALUE;
        int idx=-1;
        for(int i=0; i<list2.length; i++){
            if( map.containsKey(list2[i])){
                if(i+map.get(list2[i])<ans){
                    res=new ArrayList<>();
                    res.add(list2[i]);
                    ans=i+map.get(list2[i]);
                }
                else if(i+map.get(list2[i])==ans){
                    res.add(list2[i]);
                }
                
            }
          
        }
        String[] narr=new String[res.size()];
        for(int k=0; k<res.size(); k++){
            narr[k]=res.get(k);
        }

       
            return narr;
       
    }
}