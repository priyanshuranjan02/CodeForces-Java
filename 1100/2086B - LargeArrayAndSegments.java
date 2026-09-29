import java.util.*;

class LargeArrayAndSegments {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            long k = sc.nextLong();
            long x = sc.nextLong();

            long[] a = new long[n];
            long sum = 0;

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
                sum += a[i];
            }

            long total = sum * k;
            long prefix = 0;
            long ans = 0;

            for (int i = 0; i < n; i++) {
                long remaining = total - prefix - x;

                if (remaining >= 0) {
                    long count = remaining / sum + 1;

                    // There are only k copies
                    count = Math.min(count, k);

                    ans += count;
                }

                prefix += a[i];
            }

            System.out.println(ans);
        }
    }
}