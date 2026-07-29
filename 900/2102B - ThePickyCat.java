import java.util.*;

public class ThePickyCat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            int x = Math.abs(a[0]);

            int small = 0;

            for (int i = 1; i < n; i++) {
                if (Math.abs(a[i]) < x) {
                    small++;
                }
            }

            int need = (n - 1) / 2;
            int large = (n - 1) - small;

            if (small <= need || large >= need) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}