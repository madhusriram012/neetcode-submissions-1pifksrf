class Solution {
    public int countComponents(int n, int[][] edges) {
        DisjointSet ds=new DisjointSet(n);
        for(int[] edge:edges){
            if(ds.findUPar(edge[0]) != ds.findUPar(edge[1])){
                ds.unionByRank(edge[0],edge[1]);
            }
        }
        int count=0;
        for(int i=0;i<n;i++){
            if(i==ds.findUPar(i)){
                count++;
            }
        }
        return count;
    }
}
class DisjointSet{
    int[] rank;
    int[] parent;
    public DisjointSet(int n){
        rank=new int[n];
        parent=new int[n];
        for(int i=0;i<n;i++){
            parent[i]=i;
            rank[i]=0;
        }
    }
    public int findUPar(int node){
        if(node==parent[node]){
            return parent[node];
        }
        return parent[node]=findUPar(parent[node]);
    }
    public void unionByRank(int u,int v){
        int ulp_u=findUPar(u);
        int ulp_v=findUPar(v);
        if(ulp_u==ulp_v) return;
        if(rank[ulp_u]>rank[ulp_v]){
            parent[ulp_v]=ulp_u;
        }else if(rank[ulp_u]<rank[ulp_v]){
            parent[ulp_u]=ulp_v;
        }else{
            parent[ulp_u]=ulp_v;
            rank[ulp_v]++;
        }
    }
}
