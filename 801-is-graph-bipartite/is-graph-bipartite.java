class Solution {
    public boolean isBipartite(int[][] graph) {
        Queue<Integer> q=new LinkedList<>();
        int n=graph.length;
         int[] color = new int[n];
        Arrays.fill(color, -1);

        for(int i=0; i<n; i++){
            if(color[i]==-1){
                color[i]=0;
                q.offer(i);
            }
            while(!q.isEmpty()){
                int node=q.poll();
                for( int neig:graph[node]){
                    if(color[neig]==-1){
                        color[neig]=1-color[node];
                        q.add(neig);
                    }
                    else if(color[neig]==color[node]){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}