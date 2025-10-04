class Solution {
    public void solveSudoku(char[][] board) {
        solve(board, 0, 0);
    }

    private boolean solve(char[][] board, int row, int col) {
        if(col==9){
            row++;
            col=0;
        }
        if(row==9){
            return true;
        }
        if(board[row][col]!='.'){
            return solve(board,row,col+1);
        }
        for(int i=1;i<=9;i++){
           char ch=(char)('0'+i); 
            if(isSafe(board,row,col,ch)){
                board[row][col]=ch;
                if (solve(board, row, col + 1)) {
                    return true;
                }
                board[row][col]='.';
            }
        }
        return false;
    }

    private boolean isSafe(char[][] board, int row, int col, char num) {
        // Check row
        for (int c = 0; c < 9; c++) {
            if (board[row][c] == num) {
                return false;
            }
        }
        
        // Check column
        for (int r = 0; r < 9; r++) {
            if (board[r][col] == num) {
                return false;
            }
        }
        
        // Check 3x3 subgrid
        int startRow = row - row % 3;
        int startCol = col - col % 3;
        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {
                if (board[i][j] == num) {
                    return false;
                }
            }
        }
        
        return true;
    }
}
