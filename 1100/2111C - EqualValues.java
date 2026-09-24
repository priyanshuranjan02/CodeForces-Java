import java.util.*;

class EqualValues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            long answer = Long.MAX_VALUE;

            int i = 0;

            while (i < n) {
                int j = i;

                while (j < n && a[j] == a[i]) {
                    j++;
                }

                long cost = (long) (i + n - j) * a[i];
                answer = Math.min(answer, cost);

                i = j;
            }

            System.out.println(answer);
        }
    }
}