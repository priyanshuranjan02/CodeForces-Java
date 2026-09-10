import java.util.*;

class AnotherSortingProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            long[] a = new long[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }

            long k = 0;

            for (int i = 0; i < n - 1; i++) {
                k = Math.max(k, a[i] - a[i + 1]);
            }

            if (k == 0) {
                System.out.println("YES");
                continue;
            }

            long prev = a[0];
            boolean possible = true;

            for (int i = 1; i < n; i++) {
                if (a[i] >= prev) {
                    prev = a[i];
                } else {
                    long modified = a[i] + k;

                    if (modified < prev) {
                        possible = false;
                        break;
                    }

                    prev = modified;
                }
            }

            System.out.println(possible ? "YES" : "NO");
        }
    }
}