import java.util.*;

class CoinGames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            int cnt = 0;
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == 'U') {
                    cnt++;
                }
            }
            System.out.println((cnt % 2 == 1) ? "YES" : "NO");
        }
    }
}