public class NQueen {

    static boolean isRightPlace(int board[][], int row, int col){
        
        //upper  left diag, upper right diag, upper column

        for(int i=row-1, j=col-1;i>=0&&j>=0;i--,j--){
            if(board[i][j]==1){
                return false;
            }
        }

        for(int i = row-1, j =col+1; i>=0 && j<=3 ;i--, j++){
            if(board[i][j] ==1){
                return false;
            }
        }

        for(int i = row ;i>=0;i--){
            if(board[i][col]==1){
                return false;
            }
        }

        return true;

    }
    static boolean nQueenHelper(int board[][], int q){
        if(q==4){
            return true;
        }

        for(int col =0;col<4;col++){
            if(isRightPlace(board, q, col)){
                board[q][col] = 1;
                if(nQueenHelper(board, q+1)==false){
                    board[q][col]=0;
                }
                else{
                    return true;
                }
            }
        }
        return false;

    }

    static void printBoard(int board[][]){
        for(int i=0;i< 4;i++){
            for(int j=0;j<4;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println() ;
        }
    }
    public static void main(String[] args) {
        int board[][] = new int[4][4];

        nQueenHelper(board, 0);

        printBoard(board);

    }
}
