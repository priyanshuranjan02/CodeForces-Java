import java.util.*;

class Replacement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            String s = sc.next();
            String r = sc.next();

            int cnt0 = 0;
            int cnt1 = 0;

            for (char c : s.toCharArray()) {
                if (c == '0') {
                    cnt0++;
                } else {
                    cnt1++;
                }
            }

            boolean possible = true;

            for (int i = 0; i < n - 1; i++) {
                if (cnt0 == 0 || cnt1 == 0) {
                    possible = false;
                    break;
                }

                if (r.charAt(i) == '0') {
                    cnt1--;
                } else {
                    cnt0--;
                }
            }

            System.out.println(possible ? "YES" : "NO");
        }
    }
}