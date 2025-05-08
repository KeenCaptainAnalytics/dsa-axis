public class Queen4 {


    static boolean constraintSatisfied(int board[][], int row, int col){
        for(int i=row;i>=0;i--){
           if(board[i][col] ==1){
            return false;
           } 
        }


        for(int i=row, j=col; i>=0 && j>=0 ; i--, j--){
            if(board[i][j]==1){
                return false;
            }
        }

        for(int i=row, j=col; i>=0 && j<=3 ; i--, j++){
            if(board[i][j]==1){
                return false;
            }
        }


        return true;
    }

    static boolean placeQueens(int board[][], int q){

        if(q == 4){
            return true;
        }
        for(int col=0;col<4;col++){
            if(constraintSatisfied(board, q, col)==true){
                board[q][col] =1;

                boolean answer = placeQueens(board, q+1);
                if(answer==false){
                    board[q][col]=0;
                }
                else{
                    return true;
                }
            }
            else{
                continue;
            }
        }

        return false;
    }
    public static void main(String[] args) {
        int board[][] = {
            {0,0,0,0},
            {0,0,0,0},
            {0,0,0,0},
            {0,0,0,0}
        };


        placeQueens(board, 0);

        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
}
