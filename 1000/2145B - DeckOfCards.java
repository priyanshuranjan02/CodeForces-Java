import java.util.*;

class DeckOfCards {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            String s = sc.next();

            int zero = 0;
            int one = 0;
            int two = 0;

            for (int i = 0; i < k; i++) {
                char c = s.charAt(i);

                if (c == '0') {
                    zero++;
                } else if (c == '1') {
                    one++;
                } else {
                    two++;
                }
            }

            StringBuilder ans = new StringBuilder();

            for (int i = 0; i < n; i++) {
                char result = '+';

                if (i < zero + two || i >= n - one - two) {
                    result = '?';
                }

                if (i < zero || i >= n - one || k == n) {
                    result = '-';
                }
                ans.append(result);
            }
            System.out.println(ans);
        }
    }    
}