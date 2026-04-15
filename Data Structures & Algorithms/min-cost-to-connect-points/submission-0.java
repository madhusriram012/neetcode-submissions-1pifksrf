class Solution {
    public int minCostConnectPoints(int[][] points) {
        int n=points.length;
        int node=0;
        int[] dist=new int[n];
        Arrays.fill(dist,(int)(1e8));
        int[] vis=new int[n];
        int edges=0;
        int res=0;
        while(edges<n-1){
            vis[node]=1;
            int nextNode=-1;
            for(int i=0;i<n;i++){
                if(vis[i]==1) continue;
                int currDist= Math.abs(points[i][0] - points[node][0]) + 
                              Math.abs(points[i][1] - points[node][1]);
                dist[i]=Math.min(dist[i],currDist);
                if(nextNode== -1 || dist[i]<dist[nextNode]){
                    nextNode=i;
                }
            }
            res+=dist[nextNode];
            node=nextNode;
            edges++;
        }
        return res;
    }
}
