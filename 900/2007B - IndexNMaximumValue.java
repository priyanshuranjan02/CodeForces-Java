import java.util.*;

class IndexNMaximumValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            long mx = Long.MIN_VALUE;

            for (int i = 0; i < n; i++) {
                mx = Math.max(mx, sc.nextLong());
            }

            for (int i = 0; i < m; i++) {

                char op = sc.next().charAt(0);
                long l = sc.nextLong();
                long r = sc.nextLong();

                if (l <= mx && mx <= r) {
                    if (op == '+')
                        mx++;
                    else
                        mx--;
                }

                System.out.print(mx + " ");
            }

            System.out.println();
        }
    }
}