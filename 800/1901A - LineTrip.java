import java.util.*;

class LineTrip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();

            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            int answer = a[0];

            for (int i = 1; i < n; i++) {
                answer = Math.max(answer, a[i] - a[i - 1]);
            }

            answer = Math.max(answer, 2 * (x - a[n - 1]));

            System.out.println(answer);
        }
    }
}