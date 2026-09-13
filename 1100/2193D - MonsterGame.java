import java.util.*;

class MonsterGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            long[] a = new long[n];
            int[] b = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }

            for (int i = 0; i < n; i++) {
                b[i] = sc.nextInt();
            }

            Arrays.sort(a);

            long[] prefix = new long[n + 1];

            for (int i = 0; i < n; i++) {
                prefix[i + 1] = prefix[i] + b[i]; 
            }

            long answer = 0;

            for (int i = 0; i < n; i++) {
                long difficulty = a[i];

                int swords = n - i;

                int low = 0;
                int high = n;

                while (low < high) {
                    int mid = (low + high + 1) / 2;

                    if (prefix[mid] <= swords) {
                        low = mid;
                    } else {
                        high = mid - 1;
                    }
                }

                long score = difficulty * low;

                answer = Math.max(answer, score);
            }

            System.out.println(answer);
        }
    }
}