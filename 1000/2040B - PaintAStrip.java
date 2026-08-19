import java.util.*;

class PaintAStrip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            int ans = 1;
            long cur = 1;

            while (cur < n) {
                cur = cur * 2 + 2;
                ans++;
            }
            System.out.println(ans);
        }
    }
}