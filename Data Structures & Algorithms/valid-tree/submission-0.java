class Pair{
    int first,second;
    public Pair(int first,int second){
        this.first=first;
        this.second=second;
    }
}
class Solution {
    public boolean validTree(int n, int[][] edges) {
        if(edges.length>n-1) return false;
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }

        for(int[] edge:edges){
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }

        Set<Integer> visit=new HashSet<>();
        Queue<Pair> q=new LinkedList<>();
        q.offer(new Pair(0,-1));
        visit.add(0);
        while(!q.isEmpty()){
            int node=q.peek().first;
            int parent=q.peek().second;
            q.remove();
            for(int adjNode:adj.get(node)){
                if(adjNode==parent){
                    continue;
                }
                if(visit.contains(adjNode)){
                    return false;
                }
                visit.add(adjNode);
                q.offer(new Pair(adjNode,node));
            }
        }

        return visit.size()==n;
    }
}
