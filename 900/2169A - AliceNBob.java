import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            long a = sc.nextLong();

            long L = 0, R = 0;
            for (int i = 0; i < n; i++) {
                long v = sc.nextLong();
                if (v < a) L++;
                if (v > a) R++;
            }

            // Choose b to maximize Bob's score
            if (L > R) {
                System.out.println(a - 1);
            } else {
                System.out.println(a + 1);
            }
        }
    }
}