import java.util.*;

class SendingMessages {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            long f = sc.nextLong();
            long a = sc.nextLong();
            long b = sc.nextLong();

            long prev = 0;
            boolean possible = true;

            for (int i = 0; i < n; i++) {
                long curr = sc.nextLong();

                long gap = curr - prev;
                f -= Math.min(gap * a, b);

                if (f <= 0) {
                    possible = false;
                }
                prev = curr;
            }
            System.out.println(possible ? "YES" : "NO");
        }
    }
}