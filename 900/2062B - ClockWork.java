import java.util.*;

class ClockWork {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            boolean ok = true;

            for (int i = 0; i < n; i++) {
                long a = sc.nextLong();

                long d = Math.max(i, n - 1 - i);

                if (a <= 2 * d) {
                    ok = false;
                }
            }
            System.out.println(ok ? "YES" : "NO");
        }
    }
}