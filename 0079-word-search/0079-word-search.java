class Solution {
    int m;
    int n;
    public boolean exist(char[][] board, String word) {
        m = board.length;
        n = board[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]==word.charAt(0) && helper(i,j,board,word,0)){
                    return true;
                }
            }
        }
        return false;
    }
    boolean helper(int i,int j,char[][] board,String word,int idx){
        if(idx == word.length()) return true;
        if(i <0 || j<0  || i>= m || j>=n) return false;
        if(board[i][j] != word.charAt(idx) || board[i][j]=='$') return false;
        
        char ch = board[i][j];
        board[i][j] = '$';
        boolean res1= helper(i+1,j,board,word,idx+1);
        boolean res2= helper(i-1,j,board,word,idx+1);
        boolean res3= helper(i,j+1,board,word,idx+1);
        boolean res4= helper(i,j-1,board,word,idx+1);
        board[i][j] = ch;
        return res1 || res2 || res3|| res4;
    }
}