import java.util.*;

class TreasurerInPast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            long dash = 0;
            long under = 0;

            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '-') {
                    dash++;
                } else {
                    under++;
                }
            }

            long left = dash / 2;
            long right = dash - left;

            System.out.println(under * left * right);
        }
    }
}