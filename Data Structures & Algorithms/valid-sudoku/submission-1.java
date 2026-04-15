class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int row=0;row<9;row++){
            Set<Character> set=new HashSet<>();
            for(int i=0;i<9;i++){
                if(board[row][i]=='.') continue;
                if(set.contains(board[row][i])) return false;
                set.add(board[row][i]);
            }
        }
        for(int col=0;col<9;col++){
            Set<Character> set=new HashSet<>();
            for(int i=0;i<9;i++){
                if(board[i][col]=='.') continue;
                if(set.contains(board[i][col])) return false;
                set.add(board[i][col]);
            }
        }
        for(int i=0;i<9;i++){
            Set<Character> set=new HashSet<>();
            for (int j = 0; j < 9; j++) {
                int row = 3 * (i / 3) + j / 3;
                int col = 3 * (i % 3) + j % 3;
                char c = board[row][col];
                if (c == '.') continue;
                if (set.contains(c)) return false;
                set.add(c);
            }
        }

        return true;
    }
}
