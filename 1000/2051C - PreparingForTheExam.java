import java.util.*;

class PreparingForTheExam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt();

            int[] a = new int[m];

            for (int i = 0; i < m; i++) {
                a[i] = sc.nextInt();
            }

            boolean[] known = new boolean[n + 1];

            for (int i = 0; i < k; i++) {
                int q = sc.nextInt();
                known[q] = true;
            }

            StringBuilder ans = new StringBuilder();

            if (k < n - 1) {
                for (int i = 0; i < m; i++) {
                    ans.append('0');
                }
            } else if (k == n) {
                for (int i = 0; i < m; i++) {
                    ans.append('1');
                }
            } else {
                int missing = -1;

                for (int i = 1; i <= n; i++) {
                    if (!known[i]) {
                        missing = i;
                        break;
                    }
                }

                for (int i = 0; i < m; i++) {
                    if (a[i] == missing) {
                        ans.append('1');
                    } else {
                        ans.append('0');
                    }
                }
            }
            System.out.println(ans);
        }
    }
}