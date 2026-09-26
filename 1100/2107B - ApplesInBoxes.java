import java.util.*;

class ApplesInBoxes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            long k = sc.nextLong();

            long[] a = new long[n];
            long sum = 0;
            long min = Long.MAX_VALUE;
            long max = Long.MIN_VALUE;

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();

                sum += a[i];
                min = Math.min(min, a[i]);
                max = Math.max(max, a[i]);
            }

            int maxCount = 0;

            for (int i = 0; i < n; i++) {
                if (a[i] == max) {
                    maxCount++;
                }
            }

            long diff = max - min;

            if (diff > k + 1 ||
                (diff == k + 1 && maxCount > 1)) {
                System.out.println("Jerry");
            } else if (sum % 2 == 1) {
                System.out.println("Tom");
            } else {
                System.out.println("Jerry");
            }
        }
    }
}