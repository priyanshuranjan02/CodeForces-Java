import java.util.*;

class MakeItZigzag {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            long[] a = new long[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }

            long prefixMax = a[0];

            for (int i = 1; i < n; i++) {
                prefixMax = Math.max(prefixMax, a[i]);

                if (i % 2 == 1) {
                    a[i] = prefixMax;
                }
            }

            long answer = 0;

            for (int i = 0; i < n; i += 2) {
                long left = Long.MAX_VALUE;
                long right = Long.MAX_VALUE;

                if (i - 1 >= 0) {
                    left = a[i - 1];
                }

                if (i + 1 < n) {
                    right = a[i + 1];
                }

                long limit = Math.min(left, right);

                if (a[i] >= limit) {
                    answer += a[i] - limit + 1;
                }
            }
            System.out.println(answer);
        }
    }
}