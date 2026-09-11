import java.util.*;

class RedBlackPairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            String top = sc.next();
            String bottom = sc.next();

            int[] dp = new int[n + 1];

            dp[1] = (top.charAt(0) == bottom.charAt(0)) ? 0 : 1;

            for (int i = 2; i <= n; i++) {
                int verticalCost = (top.charAt(i - 1) == bottom.charAt(i - 1)) ? 0 : 1;

                int option1 = dp[i - 1] + verticalCost;

                int horizontalCost = 0;

                if (top.charAt(i - 2) != top.charAt(i - 1)) {
                    horizontalCost++;
                }

                if (bottom.charAt(i - 2) != bottom.charAt(i - 1)) {
                    horizontalCost++;
                }

                int option2 = dp[i - 2] + horizontalCost;

                dp[i] = Math.min(option1, option2);
            }

            System.out.println(dp[n]);
        }
    }
}