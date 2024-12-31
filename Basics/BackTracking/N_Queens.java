package Basics.BackTracking;

public class N_Queens {
    public static void main(String[] args) {
        boolean[][] queen ={{true,true,true,true},
                            {true,true,true,true},
                             {true,true,true,true},
                             {true,true,true,true}};
        char[][] board = {{'-','-','-','-'},
        {'-','-','-','-'},
         {'-','-','-','-'},
         {'-','-','-','-'}};
        int ans =N_Queen(queen,0,board);
        System.out.println(ans);

    }
    static int N_Queen(boolean[][] queen,int r,char[][] board){
        if (r==board.length){
            display(board);
                        return 1;
                    }
                    int count =0;
                    for(int col =0;col<board.length;col++){
                        if(isSafe(r,col,board)){
                                        board[r][col] ='Q';
                                        queen[r][col]=false;
                                        count+=N_Queen(queen,r+1,board);
                                        board[r][col]='-';
                                        queen[r][col]=true;
                                    }
                                }
                                
                                
                                
                            
                        
                        
                            return count;
                                           
                            }
                            private static void display(char[][] board) {
                                for (char[] row : board) {
                                    for (char col : row) {
                                        System.out.print(col + " ");
                                    }
                                    System.out.println();
                                }
                                System.out.println();
                            }
                            private static boolean isSafe(int r, int col, char[][] board) {
                                //row wise check
                                for (int i = 0; i < r; i++) {
                                    if (board[i][col] == 'Q') {
                                        return false;
                                    }
                                }
                                 // Check upper left diagonal
                                 for (int i = r - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
                                      if (board[i][j] == 'Q') {
                                          return false;
                                       }
                                 }

                           // Check upper right diagonal
                           for (int i = r - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
                               if (board[i][j] == 'Q') {
                                      return false;
                                 }
                              }

                                return true;
                            }
    
}
