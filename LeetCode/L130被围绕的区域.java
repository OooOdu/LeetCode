package LeetCode;


public class L130被围绕的区域 {
    private void dfs(int x, int y, char[][] board) {
        if (x < 0 || x >= board.length || y < 0 || y >= board[0].length || board[x][y] != 'O')
            return;
        //将在边缘的O转换成G
        board[x][y] = 'G';
        dfs(x + 1, y, board);
        dfs(x, y + 1, board);
        dfs(x - 1, y, board);
        dfs(x, y - 1, board);
    }

    public void solve(char[][] board) {
        if (board == null || board.length == 0 || (board.length == 1 && board[0].length == 0))
            return;
        int m = board.length;
        int n = board[0].length;
        //只要是在边界上向外发散出来的都是可以进行变化的O，这一步是为了确定dfs的开始边
        for (int i = 0; i < m; i++) {
            dfs(0, i, board);
            dfs(m - 1, i, board);
        }
        for (int j = 0; j < n; j++) {
            dfs(j, 0, board);
            dfs(j, n - 1, board);
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 'G') {
                    board[i][j] = 'O';
                } else if (board[i][j] == 'O') {
                    board[i][j] = 'X';
                }

            }
        }
    }
}
