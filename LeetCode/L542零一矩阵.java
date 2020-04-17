package LeetCode;

public class L542零一矩阵 {
    //是多源的dfs 0为源头，注意将需要计算的1转为Integer.MAX_VALUE 与L286题很像；
    private void dfs(int x, int y, int depth, int matrix[][]) {
        if (x < 0 || x >= matrix.length || y < 0 || y >= matrix[0].length || matrix[x][y] < depth)
            return;
        matrix[x][y] = depth;
        dfs(x + 1, y, depth + 1, matrix);
        dfs(x - 1, y, depth + 1, matrix);
        dfs(x, y + 1, depth + 1, matrix);
        dfs(x, y - 1, depth + 1, matrix);
    }

    public int[][] updateMatrix(int[][] matrix) {
        int depth = 0;
        if (matrix == null || matrix.length == 0 || (matrix.length == 1 && matrix[0].length == 0))
            return matrix;
        int m = matrix.length;
        int n = matrix[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] != 0 && !((i > 0 && matrix[i - 1][j] == 0) || (i < m - 1 && matrix[i + 1][j] == 0)
                        || (j > 0 && matrix[i][j - 1] == 0) || (j < n - 1 && matrix[i][j + 1] == 0))) {
                    matrix[i][j] = Integer.MAX_VALUE;
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    dfs(i, j, depth, matrix);
                }
            }
        }
        return matrix;
    }
}
