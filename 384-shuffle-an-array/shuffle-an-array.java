class Solution {
     int[] arr;
    int []init;
    Random r;
    public Solution(int[] nums) {
    arr=nums.clone();
    init=nums.clone();    
    }
    
    public int[] reset() {
        arr=init.clone();
        return arr;
    }
    
    public int[] shuffle() {
        List<Integer> list=new ArrayList<>();
        r=new Random();
        for(int num:arr){
            list.add(num);
        }
        for(int i=0; i<arr.length; i++){
            int ridx=r.nextInt(list.size());
            arr[i]=list.get(ridx);
            list.remove(ridx);
        }
        return arr;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */