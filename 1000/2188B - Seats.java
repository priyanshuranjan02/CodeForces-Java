import java.util.Scanner;

class Seats {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            int ans = 0;

            int i = 0;

            while (i < n) {
                if (s.charAt(i) == '1') {
                    ans++;
                    i++;
                    continue;
                }

                int start = i;

                while (i < n && s.charAt(i) == '0') {
                    i++;
                }

                int end = i - 1;
                int len = end - start + 1;

                int extra = 0;

                if (start == 0) {
                    extra++;
                }

                if (end == n - 1) {
                    extra++;
                }

                ans += (len + extra) / 3;
            }
            System.out.println(ans);
        }
    }
}