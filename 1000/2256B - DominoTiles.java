import java.util.*;

class DominoTiles {
    static final long MOD = 998244353;

    static long countWays(String s, int start) {
        long dp0 = 1;
        long dp1 = 1;

        boolean first = true;

        for (int i = start; i < s.length(); i += 2) {
            char c = s.charAt(i);

            if (first) {
                if (c == '0') {
                    dp0 = 1;
                    dp1 = 0;
                } else if (c == '1') {
                    dp0 = 0;
                    dp1 = 1;
                } else {
                    dp0 = 1;
                    dp1 = 1;
                }

                first = false;
            } else {
                long newDp0 = 0;
                long newDp1 = 0;

                if (c == '0' || c == '?') {
                    newDp0 = dp1;
                }

                if (c == '1' || c == '?') {
                    newDp1 = dp0;
                }

                dp0 = newDp0 % MOD;
                dp1 = newDp1 % MOD;
            }
        }
        return (dp0 + dp1) % MOD;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            long oddWays = countWays(s, 0);
            long evenWays = countWays(s, 1);

            long answer = (oddWays * evenWays) % MOD;

            System.out.println(answer);
        }
    }
}