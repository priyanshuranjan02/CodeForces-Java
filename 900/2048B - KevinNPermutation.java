import java.util.*;

class KevinNPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            int[] ans = new int[n + 1];

            int small = 1;

            for (int pos = k; pos <= n; pos += k) {
                ans[pos] = small++;
            }

            for (int i = 1; i <= n; i++) {
                if (ans[i] == 0) {
                    ans[i] = small++;
                }
            }

            for (int i = 1; i <= n; i++) {
                System.out.print(ans[i] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}