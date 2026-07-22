import java.util.*;

class GameOfMathletes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            int[] cnt = new int[n + 1];

            for (int i = 0; i < n; i++) {
                cnt[sc.nextInt()]++;
            }

            int ans = 0;

            for (int x = 1; x <= n; x++) {
                int y = k - x;

                if (y < 1 || y > n) continue;

                if (x < y) {
                    ans += Math.min(cnt[x], cnt[y]);
                }
            }

            if (k % 2 == 0) {
                int x = k / 2;
                if (x >= 1 && x <= n) {
                    ans += cnt[x] / 2;
                }
            }
            System.out.println(ans);
        }
    }
}