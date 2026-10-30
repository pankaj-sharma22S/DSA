class Solution {
    public  boolean bfs(int start,List<List<Integer>> adj,boolean[] visited){
        Queue<int[]> q=new LinkedList<>();
        q.offer(new int[]{start,-1});
        visited[start]=true;
        while(!q.isEmpty()){
            int[]arr=q.poll();
            int node=arr[0];
            int parent=arr[1];
            for(int neig:adj.get(node)){
                if(!visited[neig]){
                visited[neig]=true;
                q.add(new int[]{neig,node});
                
                }
                else if(neig!=parent){
                    return true;
                }
            }
        }
    return false;
    }
    public int[] findRedundantConnection(int[][] edges) {
        int n=edges.length;
        List<List<Integer>> adj=new ArrayList<>();
         for (int i = 0; i <= n; i++) {
            adj.add(new ArrayList<>());
        }
        for(int[] edg:edges){
        boolean[]visited=new boolean[n+1];
            int u=edg[0];
            int v=edg[1];
             adj.get(u).add(v);
            adj.get(v).add(u);

        
            if( bfs(u,adj,visited)){
                return edg;
            }
        
        }
        return new int[0];
    }
}