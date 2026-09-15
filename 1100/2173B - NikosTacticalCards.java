import java.util.*;

class NikosTacticalCards {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            long[] a = new long[n];
            long[] b = new long[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }

            for (int i = 0; i < n; i++) {
                b[i] = sc.nextLong();
            }

            long max = 0;
            long min = 0;

            for (int i = 0; i < n; i++) {
                long newMax = Math.max(
                    max - a[i],
                    b[i] - min
                );

                long newMin = Math.min(
                    min - a[i],
                    b[i] - max
                );

                max = newMax;
                min = newMin;
            }

            System.out.println(max);
        }
    }
}