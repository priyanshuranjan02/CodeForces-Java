import java.util.*;

class Pacer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            long m = sc.nextLong();

            long ans = 0;

            long prevTime = 0;
            int prevSide = 0;

            boolean possible = true;

            for (int i = 0; i < n; i++) {
                long time = sc.nextLong();
                int side = sc.nextInt();

                long d = time - prevTime;

                int parity = prevSide ^ side;

                if (d % 2 == parity) {
                    ans += d;
                } else {
                    ans += d - 1;
                }
                prevTime = time;
                prevSide = side;
            }
            ans += (m - prevTime);
            System.out.println(ans);
        }
    }
}