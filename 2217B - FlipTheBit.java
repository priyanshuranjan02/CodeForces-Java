import java.util.Scanner;

class FlipTheBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            sc.nextInt(); // k = 1

            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            int p = sc.nextInt() - 1;

            int x = a[p];

            int left = 0;
            int prev = 0;

            for (int i = 0; i <= p; i++) {
                int cur = (i == p) ? 0 : (a[i] ^ x);
                if (cur != prev) left++;
                prev = cur;
            }

            int right = 0;
            prev = 0;

            for (int i = n - 1; i >= p; i--) {
                int cur = (i == p) ? 0 : (a[i] ^ x);
                if (cur != prev) right++;
                prev = cur;
            }

            System.out.println(Math.max(left, right));
        }
    }
}