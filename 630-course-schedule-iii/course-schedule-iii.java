class Solution {
    public int scheduleCourse(int[][] courses) {
        Arrays.sort(courses,(a,b)->a[1]-b[1]);
       PriorityQueue<Integer> q =
            new PriorityQueue<>((a, b) -> b - a);
        int time=0;
        for(int []arr:courses){
            time+=arr[0];
            q.add(arr[0]);
            if(time>arr[1]){
           time -= q.poll();
                
            }
        }
        return q.size();
    }
}