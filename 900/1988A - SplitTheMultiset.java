import java.util.*;

class SplitTheMultiset {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            if (n == 1) {
                System.out.println(0);
            } else {
                int ans = (n + k - 3) / (k - 1);
                System.out.println(ans);
            }
        }
    }
}