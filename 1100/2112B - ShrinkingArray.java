import java.util.*;

class ShrinkingArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            boolean beautiful = false;
            boolean increasing = true;
            boolean decreasing = true;

            for (int i = 1; i < n; i++) {
                if (Math.abs(a[i] - a[i - 1]) <= 1) {
                    beautiful = true;
                }

                if (a[i] <= a[i - 1]) {
                    increasing = false;
                }

                if (a[i] >= a[i - 1]) {
                    decreasing = false;
                }
            }

            if (beautiful) {
                System.out.println(0);
            } else if (increasing || decreasing) {
                System.out.println(-1);
            } else {
                System.out.println(1);
            }
        }
    }
}