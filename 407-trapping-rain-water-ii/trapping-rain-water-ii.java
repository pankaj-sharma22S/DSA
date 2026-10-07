class Solution {
    public int trapRainWater(int[][] heightMap) {
        PriorityQueue<int[]> heap=new PriorityQueue<>((a,b)->a[0]-b[0]);
        int n=heightMap.length;
        int m=heightMap[0].length;
        int water=0;
        if(n<=2||m<=2){
            return 0;
        }
        boolean[][]visited=new boolean[n][m];
        for(int i=0; i<m; i++){
            heap.add(new int[] {heightMap[0][i],0,i});
            visited[0][i]=true;
            heap.add(new int[] {heightMap[n-1][i],n-1,i});
            visited[n-1][i]=true;

        }
        for(int i=0; i<n; i++){
            heap.add(new int[] {heightMap[i][0],i,0});
            visited[i][0]=true;

            heap.add(new int[] {heightMap[i][m-1],i,m-1});
            visited[i][m-1]=true;
        }
        int[][] direction={
            {-1,0},
            {1,0},
            {0,-1},
            {0,1}
        };
        while(!heap.isEmpty()){
            int[] arr=heap.poll();
            int height=arr[0];
            int row=arr[1];
            int col=arr[2];
            for(int[] dir:direction){
               int  nr=row+dir[0];
                int nc=col+dir[1];
                if(nr<0||nc<0|nr>=n||nc>=m){
                    continue;
                }
                if(visited[nr][nc]){
                    continue;
                }
                if(height>heightMap[nr][nc]){
                    water+=height-heightMap[nr][nc];
                }
                heap.add(new int[]{
                    Math.max(height,heightMap[nr][nc]),
                    nr,nc
                });
                visited[nr][nc]=true;

            }
        }
    return water;
    }
}