class KthLargest {
    int k;
PriorityQueue<Integer> minheap;
    public KthLargest(int k, int[] nums) {
        minheap=new PriorityQueue<>();
        this.k=k;
        for(int num:nums){
            minheap.add(num);
            if(minheap.size()>k){
                minheap.poll();
            }
        }
    }
    
    public int add(int val) {
        if(minheap.size()<k){
            minheap.add(val);
            return minheap.peek();
        }
        minheap.add(val);
        minheap.poll();
        return minheap.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */