import java.util.*;

class MochasArray {
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

            long mn2 = Long.MAX_VALUE;

            for (int i = 0; i < n; i++) {
                if (a[i] % mn != 0) {
                    mn2 = Math.min(mn2, a[i]);
                }
            }

            if (mn2 == Long.MAX_VALUE) {
                System.out.println("Yes");
                continue;
            }

            boolean possible = true;

            for (int i = 0; i < n; i++) {
                if (a[i] % mn != 0 && a[i] % mn2 != 0) {
                    possible = false;
                    break;
                }
            }

            System.out.println(possible ? "Yes" : "No");
        }
    }
}