public class KnightTour {

    static boolean knightHelper(int board[][], int place, int row, int col){
        if(place==26){
            return true;
        }

        int[] dx = {2, 1, -1, -2, -2, -1, 1, 2};
        int[] dy = {1, 2, 2, 1, -1, -2, -2, -1};

        for(int i =0;i<8;i++){
            if(row+dx[i]>=0 && row+dx[i] <5 && col+dy[i] >=0 && col+dy[i] <5 && board[row+dx[i]][col+dy[i]] == 0){
                board[row+dx[i]][col+dy[i]] = place;

               if( knightHelper(board, place+1, row+dx[i],col+dy[i])==true){
                return true;
               }
               else{
                board[row+dx[i]][col+dy[i]] = 0;
               }
            }
        }
        return false;
    }   
    public static void main(String[] args) {
        int board[][]= new int[5][5];
        board[0][0]=1;
        knightHelper(board, 2, 0, 0);

        for(int i=0;i<5;i++){
            for(int j =0;j<5;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }

    }
}
