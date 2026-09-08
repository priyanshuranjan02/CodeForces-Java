import java.util.*;

class DeleteAndConcatenate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            long c = sc.nextLong();

            long[] a = new long[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }

            Arrays.sort(a);
            long answer = 0;

            for (int i = 0; i < n; i++) {
                long value = a[i] - c;

                if (i < n / 2) {
                    value = Math.max(value, 0);
                }

                answer += value;
            }
            System.out.println(answer);
        }
    }
}