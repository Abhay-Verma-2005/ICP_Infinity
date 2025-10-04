class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]!='.' && !check(board,i,j)){
                    return false;
                }
            }
        }
        return true;
    }
    public boolean check(char[][] board, int r , int c){
        // check col
        for(int i=0;i<9;i++){
            if(i!=r && board[i][c]==board[r][c]){
                return false;
            }
        }

        // check row
        for(int j=0;j<9;j++){
            if(j!=c && board[r][j]==board[r][c]){
                return false;
            }
        }

        //checl Box\
        int row=r-r%3;
        int col=c-c%3;
        for(int i=row;i<row+3;i++){
            for(int j=col;j<col+3;j++){
                if(j!=c && i!=r && board[i][j]==board[r][c]){
                    return false;
                }
            }
        }
        return true;
    }
}
