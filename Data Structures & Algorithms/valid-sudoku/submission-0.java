class Solution {
    public boolean isValidSudoku(char[][] board) {
        int [][] rows=new int[9][9];
        int [][] cols=new int[9][9];
        int [][] boxs=new int[9][9];

        for(int r=0;r<9;r++){
            for(int c=0;c<9;c++){
                if(board[r][c]=='.'){
                    continue;
                }
                int value=board[r][c]-'1';

                if(rows[r][value]==1){
                    return false;

                }
                rows[r][value]=1;
                if(cols[c][value]==1){
                    return false;

                }
                cols[c][value]=1;
                int boxId=3*(r/3)+(c/3);
                if(boxs[boxId][value]==1){
                    return false;
                }
                boxs[boxId][value]=1;
            }
        }
        return true;
    }
}
