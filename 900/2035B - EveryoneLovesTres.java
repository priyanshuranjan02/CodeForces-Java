import java.util.*;

class EveryoneLovesTres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[][] dp = new String[501][66];

        dp[1][3 % 66] = "3";
        dp[1][6 % 66] = "6";

        for (int len = 1; len < 500; len++) {
            for (int rem = 0; rem < 66; rem++) {

                if (dp[len][rem] == null)
                    continue;

                int r1 = (rem * 10 + 3) % 66;
                String s1 = dp[len][rem] + "3";
                if (dp[len + 1][r1] == null || s1.compareTo(dp[len + 1][r1]) < 0)
                    dp[len + 1][r1] = s1;

                int r2 = (rem * 10 + 6) % 66;
                String s2 = dp[len][rem] + "6";
                if (dp[len + 1][r2] == null || s2.compareTo(dp[len + 1][r2]) < 0)
                    dp[len + 1][r2] = s2;
            }
        }

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            if (dp[n][0] == null)
                System.out.println(-1);
            else
                System.out.println(dp[n][0]);
        }
    }
}