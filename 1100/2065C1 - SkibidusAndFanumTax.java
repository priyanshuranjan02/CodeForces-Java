import java.util.*;

class SkibidusAndFanumTax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            long[] a = new long[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }

            long b = sc.nextLong();

            long prev = Long.MIN_VALUE;
            boolean possible = true;

            for (int i = 0; i < n; i++) {

                long option1 = a[i];
                long option2 = b - a[i];

                long chosen = Long.MAX_VALUE;

                // Choose the smallest option >= prev
                if (option1 >= prev) {
                    chosen = Math.min(chosen, option1);
                }

                if (option2 >= prev) {
                    chosen = Math.min(chosen, option2);
                }

                // Neither option works
                if (chosen == Long.MAX_VALUE) {
                    possible = false;
                    break;
                }

                prev = chosen;
            }

            System.out.println(possible ? "YES" : "NO");
        }
    }
}