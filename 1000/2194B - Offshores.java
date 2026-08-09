import java.util.*;

class Offshores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            long x = sc.nextLong();
            long y = sc.nextLong();

            long[] a = new long[n];

            long total = 0;

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
                total += a[i] / x;
            }

            long ans = 0;

            for (int i = 0; i < n; i++) {
                long current = a[i] + (total - a[i] / x) * y;
                ans = Math.max(ans, current);
            }
            System.out.println(ans);
        }
    }
}