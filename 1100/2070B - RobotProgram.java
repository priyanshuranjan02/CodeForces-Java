import java.util.*;

class RobotProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            long x = sc.nextLong();
            long k = sc.nextLong();

            String s = sc.next();

            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == 'L') {
                    x--;
                } else {
                    x++;
                }

                k--;

                if (x == 0) {
                    break;
                }
            }

            long ans = 0;

            if (x != 0) {
                System.out.println(0);
                continue;
            }

            ans = 1;
            x = 0;

            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == 'L') {
                    x--;
                } else {
                    x++;
                }

                if (x == 0) {
                    ans += k / (i + 1);
                    break;
                }
            }

            System.out.println(ans);
        }
    }
}