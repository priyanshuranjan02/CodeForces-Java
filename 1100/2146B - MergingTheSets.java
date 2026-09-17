import java.util.*;

class MergingTheSets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            int[] frequency = new int[m + 1];
            int[][] sets = new int[n][];

            int covered = 0;

            for (int i = 0; i < n; i++) {
                int l = sc.nextInt();
                sets[i] = new int[l];

                for (int j = 0; j < l; j++) {
                    int x = sc.nextInt();
                    sets[i][j] = x;

                    if (frequency[x] == 0) {
                        covered++;
                    }

                    frequency[x]++;
                }
            }

            if (covered < m) {
                System.out.println("NO");
                continue;
            }

            int ways = 1; 

            for (int i = 0; i < n; i++) {
                for (int x : sets[i]) {
                    frequency[x]--;

                    if (frequency[x] == 0) {
                        covered--;
                    }
                }

                if (covered == m) {
                    ways++;
                }

                for (int x : sets[i]) {
                    if (frequency[x] == 0) {
                        covered++;
                    }

                    frequency[x]++;
                }
            }

            System.out.println(ways >= 3 ? "YES" : "NO");
        }
    }
}