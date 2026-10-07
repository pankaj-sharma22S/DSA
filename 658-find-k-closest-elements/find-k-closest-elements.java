class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<Integer> heap=new PriorityQueue<>((a,b)->{
        int d1=Math.abs(a-x);
        int d2=Math.abs(b-x);
        if(d1!=d2){
        return Integer.compare(d2,d1);
        }
        else{
        return Integer.compare(b,a); 
        }
        }
        );
        
        List<Integer> ans=new ArrayList<>();
        for(int num:arr){
            heap.add(num);
            if(heap.size()>k){
                heap.poll();
            }
        }
        while(!heap.isEmpty()){
            ans.add(heap.poll());
        }
        Collections.sort(ans);
        return ans;
    }
}