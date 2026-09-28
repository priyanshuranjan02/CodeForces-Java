import java.util.*;

class TungTungSahur {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            String s = sc.next();
            String p = sc.next();

            int i = 0, j = 0;
            boolean valid = true;

            while (i < s.length() && j < p.length()) {
                if (s.charAt(i) != p.charAt(j)) {
                    valid = false;
                    break;
                }

                char c = s.charAt(i);

                int countS = 0;
                while (i < s.length() && s.charAt(i) == c) {
                    countS++;
                    i++;
                }

                int countP = 0;
                while (j < p.length() && p.charAt(j) == c) {
                    countP++;
                    j++;
                }

                if (countP < countS || countP > 2 * countS) {
                    valid = false;
                    break;
                }
            }

            if (i != s.length() || j != p.length()) {
                valid = false;
            }

            System.out.println(valid ? "YES" : "NO");
        }
    }
}