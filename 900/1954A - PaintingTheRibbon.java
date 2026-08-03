import java.util.*;

class PaintingTheRibbon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt();

            int mx = (n + m - 1) / m;

            if (n - mx <= k) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }
}