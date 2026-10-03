import java.util.*;

class SubsequenceUpdate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int l = sc.nextInt() - 1;
            int r = sc.nextInt() - 1;

            long[] a = new long[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }

            int k = r - l + 1;

            long[] left = new long[r + 1];

            for (int i = 0; i <= r; i++) {
                left[i] = a[i];
            }

            Arrays.sort(left);

            long sumLeft = 0;

            for (int i = 0; i < k; i++) {
                sumLeft += left[i];
            }

            long[] right = new long[n - l];

            for (int i = l; i < n; i++) {
                right[i - l] = a[i];
            }

            Arrays.sort(right);

            long sumRight = 0;

            for (int i = 0; i < k; i++) {
                sumRight += right[i];
            }
            System.out.println(Math.min(sumLeft, sumRight));
        }
    }
}