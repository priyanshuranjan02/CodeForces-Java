import java.util.*;

class ArtisticBalanceTree {
    static long bestMarkedSum(ArrayList<Long> values, int operations) {
        if (operations == 0 || values.isEmpty()) {
            return 0;
        }

        values.sort(Collections.reverseOrder());

        int limit = Math.min(operations, values.size());

        long current = 0;
        long best = Long.MIN_VALUE;

        for (int i = 0; i < limit; i++) {
            current += values.get(i);
            best = Math.max(best, current);
        }

        return best;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            long[] a = new long[n];

            long total = 0;

            ArrayList<Long> odd = new ArrayList<>();
            ArrayList<Long> even = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
                total += a[i];

                if ((i + 1) % 2 == 1) {
                    odd.add(a[i]);
                } else {
                    even.add(a[i]);
                }
            }

            int oddOperations = 0;
            int evenOperations = 0;

            for (int i = 0; i < m; i++) {
                int x = sc.nextInt();

                if (x % 2 == 1) {
                    oddOperations++;
                } else {
                    evenOperations++;
                }
            }

            long markedOdd = bestMarkedSum(odd, oddOperations);
            long markedEven = bestMarkedSum(even, evenOperations);

            long answer = total - markedOdd - markedEven;

            System.out.println(answer);
        }
    }
}