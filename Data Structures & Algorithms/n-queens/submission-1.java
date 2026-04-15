class Solution {
    Set<Integer> col=new HashSet<>();
    Set<Integer> posD=new HashSet<>();
    Set<Integer> negD=new HashSet<>();
    List<List<String>> list=new ArrayList<>();
    public List<List<String>> solveNQueens(int n) {
        char[][] board=new char[n][n];
        for(char[] row:board){
            Arrays.fill(row,'.');
        }
        backtrack(0,n,board);
        return list;
    }
    public void backtrack(int r,int n,char[][] board){
        if(r==n){
            List<String> copy = new ArrayList<>();
            for(char[] row:board){
                copy.add(new String(row));
            }
            list.add(copy);
            return;
        }
        for(int c=0;c<n;c++){
            if(col.contains(c) || posD.contains(r+c) || negD.contains(r-c)){
                continue;
            }

            col.add(c);
            posD.add(r+c);
            negD.add(r-c);
            board[r][c]='Q';
            backtrack(r+1,n,board);
            col.remove(c);
            posD.remove(r+c);
            negD.remove(r-c);
            board[r][c]='.';
        }
    }
}
