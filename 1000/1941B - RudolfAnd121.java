import java.util.*;

class RudolfAnd121 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            long[] a = new long[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }

            boolean possible = true;

            for (int i = 0; i < n - 2; i++) {
                if (a[i] < 0) {
                    possible = false;
                    break;
                }

                long x = a[i];

                a[i] -= x;
                a[i + 1] -= 2 * x;
                a[i + 2] -= x;
            }

            if (possible && (a[n - 2] != 0 || a[n - 1] != 0)) {
                possible = false;
            }

            System.out.println(possible ? "YES" : "NO");
        }
    }
}