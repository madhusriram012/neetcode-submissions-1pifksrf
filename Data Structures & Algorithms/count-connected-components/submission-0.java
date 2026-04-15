class Solution {
    public int countComponents(int n, int[][] edges) {
        List<List<Integer>> adj=new ArrayList<>();
        int[] vis=new int[n];
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }

        for(int[] edge:edges){
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }
        int res=0;
        for(int i=0;i<n;i++){
            if(vis[i]==0){
                bfs(i,vis,adj);
                res++;
            }
        }
        return res;
    }

    public void bfs(int node,int[] vis,List<List<Integer>> adj){
        
        Queue<Integer> q=new LinkedList<>();
        q.add(node);
        vis[node]=1;
        while(!q.isEmpty()){
            int curr=q.poll();
            for(int adjNode:adj.get(curr)){
                if(vis[adjNode]==0){
                    q.add(adjNode);
                    vis[adjNode]=1;
                }
            }
        }
    }
}
