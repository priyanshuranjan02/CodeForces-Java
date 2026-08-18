import java.util.Scanner;

class PushingBalls {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            char[][] grid = new char[n][m];

            for (int i = 0; i < n; i++) {
                grid[i] = sc.next().toCharArray();
            }

            boolean[][] rowPrefix = new boolean[n][m + 1];
            boolean[][] colPrefix = new boolean[n + 1][m];

            for (int i = 0; i < n; i++) {
                rowPrefix[i][0] = true;

                for (int j = 1; j <= m; j++) {
                    rowPrefix[i][j] = rowPrefix[i][j - 1] && grid[i][j - 1] == '1';
                }
            }

            for (int j = 0; j < m; j++) {
                colPrefix[0][j] = true;

                for (int i = 1; i <= n; i++) {
                    colPrefix[i][j] = colPrefix[i - 1][j] && grid[i - 1][j] == '1';
                }
            }

            boolean possible = true;

            for (int i = 0; i < n && possible; i++) {
                for (int j = 0; j < m; j++) {
                    if (grid[i][j] == '1') {
                        if (i == 0 || j == 0) {
                            continue;
                        }

                        boolean fromLeft = rowPrefix[i][j];
                        boolean fromTop = colPrefix[i][j];

                        if (!fromLeft && !fromTop) {
                            possible = false;
                            break;
                        }
                    }
                }
            }
            System.out.println(possible ? "YES" : "NO");
        }
    }
}