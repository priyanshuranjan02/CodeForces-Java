import java.util.*;

class ReplaceAndSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int q = sc.nextInt();

            long[] a = new long[n];
            long[] b = new long[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }

            for (int i = 0; i < n; i++) {
                b[i] = sc.nextLong();
            }

            long[] mx = new long[n];

            mx[n - 1] = Math.max(a[n - 1], b[n - 1]);

            for (int i = n - 2; i >= 0; i--) {
                mx[i] = Math.max(Math.max(a[i], b[i]), mx[i + 1]);
            }

            long[] prefix = new long[n + 1];

            for (int i = 0; i < n; i++) {
                prefix[i + 1] = prefix[i] + mx[i];
            }

            StringBuilder out = new StringBuilder();

            while (q-- > 0) {
                int l = sc.nextInt() - 1;
                int r = sc.nextInt() - 1;

                long answer = prefix[r + 1] - prefix[l];
                out.append(answer).append(' ');
            }
            System.out.println(out);
        }
    }
}