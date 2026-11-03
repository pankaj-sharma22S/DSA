class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
            
          ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
      int n = numCourses;
      int k=0;
        int ans[]=new int[n]; 
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        int[] indegree = new int[n];

     
        for (int[] p : prerequisites) {
            int u = p[1];
            int v = p[0];

            adj.get(u).add(v);
            indegree[v]++;
        }
          Queue<Integer> q = new LinkedList<>();
          for(int i=0; i<n; i++){
            if(indegree[i]==0){
                q.offer(i);
            }
          }
          int count = 0;
        while(!q.isEmpty()){
            int node=q.poll();
            ans[k++]=node;
            count++;
            for(int neig:adj.get(node)){
                indegree[neig]--;
                if(indegree[neig]==0){
                    q.offer(neig);
                }
            }
        }
        if(count!=n){
            return new int[0];
        }
        return ans;
    }
}