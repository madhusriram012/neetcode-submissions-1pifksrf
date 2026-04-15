class Pair{
    int first,second;
    public Pair(int first,int second){
        this.first=first;
        this.second=second;
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
            int row=q.peek().first;
            int col=q.peek().second;
            q.remove();
            int[] delr={-1,0,1,0};
            int[] delc={0,1,0,-1};
            for(int i=0;i<4;i++){
                int newr=row+delr[i];
                int newc=col+delc[i];

                if(newr>=0 && newr<n && newc>=0 && newc<m && grid[newr][newc]==2147483647){
                    grid[newr][newc]=1+grid[row][col];
                    q.add(new Pair(newr,newc));
                }
            }
        }
    }
}
