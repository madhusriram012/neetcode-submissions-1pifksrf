class Solution {
    public int[] findRedundantConnection(int[][] edges) {
        int n=edges.length;
        int[] indegree=new int[n+1];
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<=n;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] edge:edges){
            int u=edge[0];
            int v=edge[1];
            adj.get(u).add(v);
            adj.get(v).add(u);
            indegree[u]++;
            indegree[v]++;
        }

        Queue<Integer> q=new LinkedList<>();
        for(int i=1;i<=n;i++){
            if(indegree[i]==1){
                q.add(i);
            }
        }

        while(!q.isEmpty()){
            int curr=q.poll();
            indegree[curr]--;
            for(int adjNode:adj.get(curr)){
                indegree[adjNode]--;
                if(indegree[adjNode]==1){
                    q.add(adjNode);
                }
            }
        }

        for(int i=edges.length-1;i>=0;i--){
            int u=edges[i][0];
            int v=edges[i][1];
            if(indegree[u]==2 && indegree[v]>0){
                return new int[]{u,v};
            }
        }
        return new int[0];
    }
}
