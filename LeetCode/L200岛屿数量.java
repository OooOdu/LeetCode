package LeetCode;

public class L200岛屿数量 {
    private void bfs(char[][] grid, int x, int y) {
        if (x < 0 || x >= grid.length || y < 0 || y >= grid[0].length || grid[x][y] != '1')
            return;
        grid[x][y] = '0';
        bfs(grid, x - 1, y);
        bfs(grid, x + 1, y);
        bfs(grid, x, y - 1);
        bfs(grid, x, y + 1);

    }

    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0 || (grid.length == 1 && grid[0].length == 0))
            return 0;
        int sum = 0;
        int a = grid.length;
        int b = grid[0].length;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                if (grid[i][j] == 1) {
                    sum++;
                    bfs(grid, i, j);
                }
            }
        }
        return sum;
    }
}
