import java.util.*;

class WonderfulGloves {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            long[] l = new long[n];
            long[] r = new long[n];

            for (int i = 0; i < n; i++) {
                l[i] = sc.nextLong();
            }

            for (int i = 0; i < n; i++) {
                r[i] = sc.nextLong();
            }

            long ans = 0;
            long[] extra = new long[n];

            for (int i = 0; i < n; i++) {
                ans += Math.max(l[i], r[i]);
                extra[i] = Math.min(l[i], r[i]);
            }

            Arrays.sort(extra);

            for (int i = n - 1; i >= n - k + 1; i--) {
                ans += extra[i];
            }

            System.out.println(ans + 1);
        }
    }
}