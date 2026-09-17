import java.util.*;

class AbrahamsGreatEscape {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            if (k == n * n - 1) {
                System.out.println("NO");
                continue;
            }

            System.out.println("YES");

            char[][] grid = new char[n][n];

            for (int i = 0; i < n; i++) {
                Arrays.fill(grid[i], 'D');
            }

            int count = 0;

            for (int i = 0; i < n && count < k; i++) {
                for (int j = 0; j < n && count < k; j++) {
                    grid[i][j] = 'U';
                    count++;
                }
            }

            int firstEmpty = -1;

            for (int j = 0; j < n; j++) {
                if (grid[n - 1][j] != 'U') {
                    firstEmpty = j;
                    break;
                }
            }

            if (firstEmpty != -1) {
                grid[n - 1][firstEmpty] = 'R';

                for (int j = firstEmpty + 1; j < n; j++) {
                    if (grid[n - 1][j] != 'U') {
                        grid[n - 1][j] = 'L';
                    }
                }
            }

            for (int i = 0; i < n; i++) {
                System.out.println(new String(grid[i]));
            }
        }
    }
}