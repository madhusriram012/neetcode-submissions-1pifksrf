class Pair{
    int node,parent;
    public Pair(int node,int parent){
        this.node=node;
        this.parent=parent;
    }
}
class Solution {
    public boolean validTree(int n, int[][] edges) {
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        Set<Integer> vis=new HashSet<>();
        for(int[] edge:edges){
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(0,-1));
        while(!q.isEmpty()){
            int node=q.peek().node;
            int par=q.peek().parent;
            q.remove();
            vis.add(node);
            for(int adjNode:adj.get(node)){
                if(adjNode==par) continue;
                if(vis.contains(adjNode)){
                    return false;
                }
                q.add(new Pair(adjNode,node));
            }
        }
        return vis.size()==n;
    }
}
