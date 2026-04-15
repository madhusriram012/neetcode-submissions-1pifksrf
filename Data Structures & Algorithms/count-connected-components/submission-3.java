class Solution {
    public int countComponents(int n, int[][] edges) {
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }

        for(int[] edge:edges){
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }
        int[] vis=new int[n];
        int count=0;
        for(int i=0;i<n;i++){
            if(vis[i]==0){
                count++;
                bfs(i,vis,adj);
            }
        }
        return count;
    }
    public void bfs(int node,int[] vis,List<List<Integer>> adj){
        vis[node]=1;
        for(int adjNode:adj.get(node)){
            if(vis[adjNode]==0){
                bfs(adjNode,vis,adj);
            }
        }
    }
}
