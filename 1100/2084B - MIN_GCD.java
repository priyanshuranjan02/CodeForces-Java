import java.util.*;

class MIN_GCD {
    static long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            long[] a = new long[n];
            long mn = Long.MAX_VALUE;

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
                mn = Math.min(mn, a[i]);
            }

            int count = 0;

            for (long x : a) {
                if (x == mn) {
                    count++;
                }
            }

            if (count >= 2) {
                System.out.println("Yes");
                continue;
            }

            long g = 0;

            for (long x : a) {
                if (x != mn && x % mn == 0) {
                    g = gcd(g, x);
                }
            }
            System.out.println(g == mn ? "Yes" : "No");
        }
    }
}