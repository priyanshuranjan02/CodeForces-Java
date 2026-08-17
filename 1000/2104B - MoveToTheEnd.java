import java.util.*;

class MoveToTheEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            long[] a = new long[n];
            long[] prefixMax = new long[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();

                if (i == 0) {
                    prefixMax[i] = a[i];
                } else {
                    prefixMax[i] = Math.max(prefixMax[i - 1], a[i]);
                }
            }

            long suffixSum = 0;

            for (int k = 1; k <= n; k++) {
                int index = n - k;

                long answer = suffixSum + prefixMax[index];
                System.out.print(answer);

                if (k < n) {
                    System.out.print(" ");
                }
                suffixSum += a[index];
            }

            System.out.println();
        }
    }
}