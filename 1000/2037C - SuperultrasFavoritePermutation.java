import java.util.*;

class SuperultrasFavoritePermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            if (n < 5) {
                System.out.println(-1);
                continue;
            }

            StringBuilder ans = new StringBuilder();

            for (int i = 2; i <= n; i += 2) {
                if (i != 4) {
                    ans.append(i).append(" ");
                }
            }

            ans.append(4).append(" ");
            ans.append(5).append(" ");

            for (int i = 1; i <= n; i += 2) {
                if (i != 5) {
                    ans.append(i).append(" ");
                }
            }
            System.out.println(ans.toString().trim());
        }
    }
}