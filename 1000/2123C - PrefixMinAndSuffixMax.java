import java.util.*;

class PrefixMinAndSuffixMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            int[] prefixMin = new int[n];
            int[] suffixMax = new int[n];

            prefixMin[0] = a[0];

            for (int i = 1; i < n; i++) {
                prefixMin[i] = Math.min(prefixMin[i - 1], a[i]);
            }

            suffixMax[n - 1] = a[n - 1];

            for (int i = n - 2; i >= 0; i--) {
                suffixMax[i] = Math.max(suffixMax[i + 1], a[i]);
            }

            StringBuilder ans = new StringBuilder();

            for (int i = 0; i < n; i++) {
                if (a[i] == prefixMin[i] || a[i] == suffixMax[i]) {
                    ans.append('1');
                } else {
                    ans.append('0');
                }
            }
            System.out.println(ans);
        }
    }
}