package Basics.BackTracking;

public class SudokoSolver {
    public static void main(String[] args) {
        char[][] board = {
            {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
            {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
            {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
            {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
            {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
            {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
            {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
            {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
            {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };
        solveSudoku(board);
    }
        static boolean solveSudoku(char[][] board) {
            return helper(board,0,0);
        }
        static boolean helper(char[][] board,int row,int col){
            if(row == board.length){
                display(board);
                return true;
            }
            int nextRow = (col==board.length-1)?row+1:row;
            int nextCol = (col==board.length-1)?0:col+1;
            if(board[row][col]!='.'){
                 return helper(board,nextRow,nextCol);
            }
             for (char num = '1'; num <= '9'; num++) {
                if (isSafeToPlaceNumber(board, row, col, num)) {
                                    board[row][col] = num;
                    
                                    if (helper(board, nextRow, nextCol)) {
                                        return true;
                                    }
                    
                                    board[row][col] = '.'; // Backtrack
                                }
                            }
                            return false;
                        }
                        private static boolean isSafeToPlaceNumber(char[][] board, int row, int col, char num) {
                            for (int c = 0; c < board.length; c++) {
                                if (board[row][c] == num) {
                                    return false;
                                }
                            }
                             // Check column
                            for (int r = 0; r < board.length; r++) {
                                if (board[r][col] == num) {
                                    return false;
                                }
                            }
                            int subGridRowStart = (row / 3) * 3;
                            int subGridColStart = (col / 3) * 3;
                    
                            for (int r = subGridRowStart; r < subGridRowStart + 3; r++) {
                                for (int c = subGridColStart; c < subGridColStart + 3; c++) {
                                    if (board[r][c] == num) {
                                        return false;
                                    }
                                }
                            }
                    
                            return true;
                        }
                        private static void display(char[][] board){
            for(char[] row:board){
                for(char col: row){
                    System.out.print(col+" ");
                }
               System.out.println(); 
            }
        }
        

}
