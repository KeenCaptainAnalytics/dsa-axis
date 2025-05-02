public class sudoku {

    static boolean  contraintChecker(int arr[][], int row, int col , int option){

        for(int i=0;i<9;i++){
            if(arr[row][i] == option){
                return false;
            }
        }
        for(int i=0;i<9;i++){
            if(arr[i][col] == option){
                return false;
            }
        }


        int x= row- row%3;
        int y= col-col%3;

        for(int i =x;i<x+3;i++){
            for(int j =y;j<y+3;j++){
                if(arr[i][j]==option){
                    return false;
                }
            }
        }

        return true;
    }
    static boolean helper(int arr[][], int row , int col) {
        // print(arr);
        if(col==9 && row ==8){
            return true;
        }
        if(col==9){
            row= row+1;
            col=0;
        }
        if(arr[row][col]!=0){
           return helper(arr, row, col+1);
        }
        else if(arr[row][col]==0){
            for(int i=1;i<=9;i++){
                if(contraintChecker(arr, row, col, i)){
                    arr[row][col]=i;
                    if(helper(arr, row, col+1)){

                        return true;
                    }
                    else{
                        arr[row][col] = 0;
                    }
                }
            }
            
        }
            
    return false;
    }

    static void print(int arr[][]){
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int arr[][] ={{5,3,0,0,7,0,0,0,0},
        {6,0,0,1,9,5,0,0,0},
        {0,9,8,0,0,0,0,6,0},
        {8,0,0,0,6,0,0,0,3},
        {4,0,0,8,0,3,0,0,1},
        {7,0,0,0,2,0,0,0,6},
        {0,6,0,0,0,0,2,8,0},
        {0,0,0,4,1,9,0,0,5},
        {0,0,0,0,8,0,0,7,9}};

        if(helper(arr, 0, 0)==true);
        print(arr);
    }
}
