import java.util.*;

class GorillaNPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t= sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt();

            StringBuilder ans = new StringBuilder();

            for (int i = n; i >= k; i--) {
                ans.append(i).append(" ");
            }

            for (int i = m + 1; i < k; i++) {
                ans.append(i).append(" ");
            }

            for (int i = 1; i <= m; i++) {
                ans.append(i).append(" ");
            }
            System.out.println(ans.toString().trim());
        }
    }
}