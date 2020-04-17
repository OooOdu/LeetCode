package LeetCode;

public class L286墙与门 {
    public void dfs(int[][] rooms, int x, int y, int depth) {
        if (x < 0 || x >= rooms.length || y < 0 || y >= rooms[0].length || rooms[x][y] < depth)
            return;
        rooms[x][y] = depth;
        dfs(rooms, x + 1, y, depth + 1);
        dfs(rooms, x - 1, y, depth + 1);
        dfs(rooms, x, y + 1, depth + 1);
        dfs(rooms, x, y - 1, depth + 1);
    }

    public void wallsAndGates(int[][] rooms) {
        if (rooms.length == 0 || rooms == null)
            return;
        int a = rooms.length;
        int b = rooms[0].length;
        int depth = 0;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                if (rooms[i][j] == 0) {
                    dfs(rooms, i, j, depth);
                }

            }
        }
    }
}
