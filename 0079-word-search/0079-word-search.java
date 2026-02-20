class Solution {
    public boolean exist(char[][] board, String word) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j] == word.charAt(0) && helper(board,word,i,j,0)){
                    return true;
                }
            }
        }
        return false;
    }
    boolean helper(char[][] board,String word,int i,int j, int idx){
        if(idx == word.length()) return true;
        if(i<0 || j<0 || i>= board.length || j>= board[0].length ) return false;
        if(board[i][j] != word.charAt(idx) || board[i][j] == '$') return false;
        char ch = board[i][j];
        board[i][j] = '$';
        boolean res1 = helper(board,word,i+1,j,idx+1);
        boolean res2 = helper(board,word,i-1,j,idx+1);
        boolean res3 = helper(board,word,i,j+1,idx+1);
        boolean res4 = helper(board,word,i,j-1,idx+1);
        board[i][j] = ch;
        return res1 || res2 || res3 || res4;
    }
}