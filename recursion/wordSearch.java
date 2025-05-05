class Solution {

    boolean helper(char[][] board, String s, boolean visited[][], int i, int row, int col){
 print(visited);       
        System.out.println();
        if(i==s.length()){
            return true;
        }
        // row, col+1 (right)
        // row, col-1 (left)
        //row-1, col (top)
        //row+1, col (bottom)
        
        if(row+1 < board.length  && board[row+1][col]== s.charAt(i) && visited[row+1][col]==false){
            
            visited[row+1][col] = true;
           boolean result1 = helper(board , s, visited, i+1,row+1, col );
           if(result1==false){
             visited[row+1][col] = false;
           }
           else{
            return true;
           }
        }

        if(row-1>=0 && board[row-1][col]== s.charAt(i) && visited[row-1][col]==false){
            visited[row-1][col] = true;
           boolean result1 = helper(board , s, visited, i+1,row-1, col );
           if(result1==false){
             visited[row-1][col] = false;
           }
           else{
            return true;
           }
           
           
        }
        
        if(col-1>=0 && board[row][col-1]== s.charAt(i) && visited[row][col-1]==false){
            visited[row][col-1] = true;
           boolean result1 = helper(board , s, visited, i+1,row, col-1 );
           if(result1==false){
             visited[row][col-1] = false;
           }
           else{
            return true;
           }
           
           
        }

        if(col+1<board[0].length && board[row][col+1]== s.charAt(i) && visited[row][col+1]==false){
            visited[row][col+1] = true;
           boolean result1 = helper(board , s, visited, i+1,row, col+1 );
           if(result1==false){
             visited[row][col+1] = false;
           }
           else{
            return true;
           } 
        }
        return false;
    }

    public void print(boolean [][] visited){
        for(int i=0;i<visited.length ;i++){
            for(int j=0;j<visited[0].length ;j++){
                System.out.print(visited[i][j]+" ");
            }
            System.out.println();
        }
    }
    public boolean exist(char[][] board, String word) {
        boolean visited[][] = new boolean[board.length][board[0].length];

        for(int i=0;i<board.length;i++){
            for(int j =0;j<board[0].length ;j++){
                    if(board[i][j]==word.charAt(0)){
                       visited[i][j]=true;
                       boolean result = helper(board , word, visited,1, i,j ); 
                       
                       if(result == true){
                        // print(visited);
                        return true;
                       }                  
                       else{
                         visited[i][j]= false;
                       }  
                    }
            }
        }
        return false;
    }
}
