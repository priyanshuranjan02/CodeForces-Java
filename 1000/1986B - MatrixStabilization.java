import java.util.*;

class MatrixStabilization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            long[][] a = new long[n][m];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    a[i][j] = sc.nextLong();
                }
            }

            for (int i = 0; i < n; i++) {

                for (int j = 0; j < m; j++) {
                    long maxNeighbour = Long.MIN_VALUE;

                    if (i > 0) {
                        maxNeighbour = Math.max(maxNeighbour, a[i - 1][j]);
                    }

                    if (i + 1 < n) {
                        maxNeighbour = Math.max(maxNeighbour, a[i + 1][j]);
                    }

                    if (j > 0) {
                        maxNeighbour = Math.max(maxNeighbour, a[i][j - 1]);
                    }

                    if (j + 1 < m) {
                        maxNeighbour = Math.max(maxNeighbour, a[i][j + 1]);
                    }

                    if (a[i][j] > maxNeighbour) {
                        a[i][j] = maxNeighbour;
                    }
                }
            }

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    System.out.print(a[i][j]);

                    if (j + 1 < m) {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
}