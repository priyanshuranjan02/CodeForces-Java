import java.util.*;

class SubtractMinSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            long[] a = new long[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }

            for (int i = 0; i < n - 1; i++) {
                long x = Math.min(a[i], a[i + 1]);

                a[i] -= x;
                a[i + 1] -= x;
            }

            boolean possible = true;

            for (int i = 0; i < n - 1; i++) {
                if (a[i] > a[i + 1]) {
                    possible = false;
                    break;
                }
            }

            System.out.println(possible ? "YES" : "NO");
        }
    }
}