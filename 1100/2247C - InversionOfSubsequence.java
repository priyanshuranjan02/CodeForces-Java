import java.util.*;

class InversionOfSubsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];

            boolean allAZero = true;

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();

                if (a[i] == 1) {
                    allAZero = false;
                }
            }

            int cnt = 0;
            boolean same = true;
            boolean allBOne = true;

            for (int i = 0; i < n; i++) {
                int b = sc.nextInt();

                if (b == 0) {
                    allBOne = false;
                }

                if (a[i] != b) {
                    same = false;

                    if (a[i] == 1) {
                        cnt++;
                    }
                }
            }

            if (same) {
                System.out.println(0);
            } else if (allAZero || allBOne) {
                System.out.println(-1);
            } else if (cnt % 2 == 1) {
                System.out.println(1);
            } else {
                System.out.println(2);
            }
        }
    }
}