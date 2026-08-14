import java.util.*;

class Discounts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            long[] a = new long[n];

            long total = 0;

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
                total += a[i];
            }

            int[] b = new int[k];

            for (int i = 0; i < k; i++) {
                b[i] = sc.nextInt();
            }

            Arrays.sort(a);
            Arrays.sort(b);

            long discount = 0;
            int used = 0;

            for (int i = 0; i < k; i++) {
                if (used + b[i] > n) {
                    break;
                }

                int index = n - used - b[i];

                discount += a[index];

                used += b[i];
            }
            System.out.println(total - discount);
        }
    }
}