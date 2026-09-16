import java.util.*;

class DriftingAway {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            String s = sc.next();

            boolean infinite = false;

            for (int i = 0; i < s.length() - 1; i++) {
                if (s.charAt(i) != '<' && s.charAt(i + 1) != '>') {
                    infinite = true;
                    break;
                }
            }

            if (infinite) {
                System.out.println(-1);
            } else {
                int left = 0;
                int right = 0;

                for (char ch : s.toCharArray()) {
                    if (ch == '<') {
                        left++;
                    } else if (ch == '>') {
                        right++;
                    }
                }

                System.out.println(s.length() - Math.min(left, right));
            }
        }
    }
}