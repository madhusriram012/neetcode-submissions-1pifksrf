class Solution {
    public int countComponents(int n, int[][] edges) {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        int[] vis=new int[n];
        for(int[] edge:edges){
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }
        int res=0;
        for(int i=0;i<n;i++){
            if(vis[i]==0){
                res++;
                bfs(i,vis,adj);
            }
        }
        return res;
    }
    public void bfs(int node,int[] vis,ArrayList<ArrayList<Integer>> adj){
        vis[node]=1;
        for(int adjNode:adj.get(node)){
            if(vis[adjNode]==0){
                bfs(adjNode,vis,adj);
            }
        }
    }
}
