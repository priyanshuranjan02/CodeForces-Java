import java.util.*;

class SquarePool {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            long s = sc.nextLong();

            int answer = 0;

            for (int i = 0; i < n; i++) {
                int dx = sc.nextInt();
                int dy = sc.nextInt();

                long x = sc.nextLong();
                long y = sc.nextLong();

                if (dx == dy) {
                    if (x == y) {
                        answer++;
                    }
                } else {
                    if (x + y == s) {
                        answer++;
                    }
                }
            }
            System.out.println(answer);
        }
    }
}