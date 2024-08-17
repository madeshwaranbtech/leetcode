import java.util.*;
class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }
        solve(ans, board, n, 0);
        return ans;
    }

    private void solve(List<List<String>> ans, char[][] board, int n, int col){
        if (col == n){
            ans.add(construct(board));
            return;
        }
        for(int row=0;row<n;row++){
            if (isSafe(row, col, n, board)) {
                board[row][col] = 'Q'; 
                solve(ans, board, n, col + 1);
                board[row][col] = '.';
            }
        }
    }
    private List<String> construct(char[][] board) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            result.add(new String(board[i]));
        }
        return result;
    }
    private boolean isSafe(int row, int col, int n, char[][] board) {
        for (int i = 0; i < col; i++) {
            if (board[row][i] == 'Q') {
                return false;
            }
        }
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        for (int i = row, j = col; i < n && j >= 0; i++, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }
}
