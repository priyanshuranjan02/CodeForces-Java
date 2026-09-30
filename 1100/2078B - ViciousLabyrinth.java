import java.util.*;

class ViciousLabyrinth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            long k = sc.nextLong();

            int[] a = new int[n];

            if (k % 2 == 1) {
                for (int i = 0; i < n - 1; i++) {
                    a[i] = n;
                }
                a[n - 1] = n - 1;
            } else {
                for (int i = 0; i < n - 2; i++) {
                    a[i] = n - 1;
                }
                a[n - 2] = n;
                a[n - 1] = n - 1;
            }

            for (int i = 0; i < n; i++) {
                System.out.print(a[i] + (i + 1 == n ? "\n" : " "));
            }
        }
    }
}