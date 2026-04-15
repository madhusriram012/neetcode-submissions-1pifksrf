class Solution {
    public int countComponents(int n, int[][] edges) {
        List<List<Integer>> adj=new ArrayList<>();

        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        int[] vis=new int[n];
        int count=0;
        for(int[] edge:edges){
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<n;i++){
            if(vis[i]==0){
                count++;
                bfs(i,adj,vis);
            }
        }
        return count;
    }
    public void bfs(int node,List<List<Integer>> adj,int[] vis){
        vis[node]=1;
        for(int adjNode:adj.get(node)){
            if(vis[adjNode]==0){
                bfs(adjNode,adj,vis);
            }
        }
    }
}
