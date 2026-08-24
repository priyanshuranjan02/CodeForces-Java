import java.util.*;

class KSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            long max = 0;
            long total = 0;
            long maxNeed = 0;

            for (int i = 0; i < n; i++) {
                long x = sc.nextLong();

                if (x == 0) {
                    max = x;
                    continue;
                }

                if (x < max) {
                    long need = max - x;

                    total += need;
                    maxNeed = Math.max(maxNeed, need);
                } else {
                    max = x;
                }
            }
            System.out.println(total + maxNeed);
        }
    }
}