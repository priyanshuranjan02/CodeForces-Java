import java.util.*;

class ProgressiveSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            long c = sc.nextLong();
            long d = sc.nextLong();

            int total = n * n;

            long[] a = new long[total];

            for (int i = 0; i < total; i++) {
                a[i] = sc.nextLong();
            }

            long min = a[0];

            for (int i = 1; i < total; i++) {
                min = Math.min(min, a[i]);
            }

            HashMap<Long, Integer> freq = new HashMap<>();

            for (long x : a) {
                freq.put(x, freq.getOrDefault(x, 0) + 1);
            }

            boolean possible = true;

            for (int i = 0; i < n && possible; i++) {
                for (int j = 0; j < n; j++) {
                    long expected = min + i * c + j * d;

                    Integer count = freq.get(expected);

                    if (count == null || count == 0) {
                        possible = false;
                        break;
                    }

                    if (count == 1) {
                        freq.remove(expected);
                    } else {
                        freq.put(expected, count - 1);
                    }
                }
            }

            System.out.println(possible ? "YES" : "NO");
        }
    }
}