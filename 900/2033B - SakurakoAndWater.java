import java.util.Scanner;

class SakurakoAndWater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[][] a = new int[n][n];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    a[i][j] = sc.nextInt();
                }
            }

            long ans = 0;

            for (int col = 0; col < n; col++) {
                int i = 0, j = col;
                int mn = 0;
                while (i < n && j < n) {
                    mn = Math.min(mn, a[i][j]);
                    i++;
                    j++;
                }
                ans += -mn;
            }

            for (int row = 1; row < n; row++) {
                int i = row, j = 0;
                int mn = 0;
                while (i < n && j < n) {
                    mn = Math.min(mn, a[i][j]);
                    i++;
                    j++;
                }
                ans += -mn;
            }

            System.out.println(ans);
        }
    }
}
