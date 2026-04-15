class Pair{
    int row,col;
    public Pair(int row,int col){
        this.row=row;
        this.col=col;
    }
}
class Solution {
    public void islandsAndTreasure(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        Queue<Pair> q=new LinkedList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==0){
                    q.add(new Pair(i,j));
                }
            }
        }
        while(!q.isEmpty()){
            int r=q.peek().row;
            int c=q.peek().col;
            q.remove();
            int[] delr={-1,0,1,0};
            int[] delc={0,1,0,-1};
            for(int i=0;i<4;i++){
                int newr=r+delr[i];
                int newc=c+delc[i];
                if(newr>=0 && newr<n && newc>=0 && newc<m){
                    if(grid[newr][newc]==-1) continue;
                    if(grid[newr][newc]==2147483647){
                        q.add(new Pair(newr,newc));
                        grid[newr][newc]=1+grid[r][c];
                    }
                }
            }
        }
    }
}
