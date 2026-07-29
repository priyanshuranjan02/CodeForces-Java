import java.util.*;

class BrrBrrrProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            int[][] g = new int[n][n];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    g[i][j] = sc.nextInt();
                }
            }

            int[] p = new int[2 * n + 1];
            boolean[] used = new boolean[2 * n + 1];

            for (int j = 0; j < n; j++) {
                p[j + 2] = g[0][j];
                used[p[j + 2]] = true;
            }

            for (int i = 1; i < n; i++) {
                p[n + i + 1] = g[i][n - 1];
                used[p[n + i + 1]] = true;
            }

            for (int x = 1; x <= 2 * n; x++) {
                if (!used[x]) {
                    p[1] = x;
                    break;
                }
            }

            for (int i = 1; i <= 2 * n; i++) {
                System.out.print(p[i] + " ");
            }
            System.out.println();
        }
    }
}