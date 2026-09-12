import java.util.*;

class Cyclists {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int p = sc.nextInt();
            long m = sc.nextLong();

            long[] a = new long[n + 1];

            for (int i = 1; i <= n; i++) {
                a[i] = sc.nextLong();
            }

            PriorityQueue<Long> pq = new PriorityQueue<>();

            for (int i = 1; i < p; i++) {
                pq.add(a[i]);
            }

            long A = 0;

            for (int i = 0; i < p - k; i++) {
                A += pq.poll();
            }

            m -= A;
            m -= a[p];

            if (m < 0) {
                System.out.println(0);
                continue;
            }

            pq.clear();

            for (int i = 1; i <= n; i++) {
                if (i != p) {
                    pq.add(a[i]);
                }
            }

            long B = 0;

            for (int i = 0; i < n - k; i++) {
                B += pq.poll();
            }

            long costPerExtraPlay = B + a[p];

            long answer = 1 + m / costPerExtraPlay;

            System.out.println(answer);
        }
    }
}