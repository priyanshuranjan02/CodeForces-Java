import java.util.*;

class OutOfMemoryError {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            long h = sc.nextLong();

            long[] original = new long[n];

            for (int i = 0; i < n; i++) {
                original[i] = sc.nextLong();
            }

            HashMap<Integer, Long> added = new HashMap<>();

            for (int i = 0; i < m; i++) {
                int b = sc.nextInt() - 1;
                long c = sc.nextLong();

                long extra = added.getOrDefault(b, 0L);

                long newValue = original[b] + extra + c;

                if (newValue > h) {
                    added.clear();
                } else {
                    added.put(b, extra + c);
                }
            }

            for (int i = 0; i < n; i++) {
                long value = original[i] + added.getOrDefault(i, 0L);

                if (i > 0) {
                    System.out.print(" ");
                }

                System.out.print(value);
            }

            System.out.println();
        }
    }
}