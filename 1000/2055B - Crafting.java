import java.util.*;

class Crafting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            long[] a = new long[n];
            long[] b = new long[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }

            for (int i = 0; i < n; i++) {
                b[i] = sc.nextLong();
            }

            int deficitCount = 0;
            int deficitIndex = -1;

            long minSurplus = Long.MAX_VALUE;

            for (int i = 0; i < n; i++) {
                if (a[i] < b[i]) {
                    deficitCount++;
                    deficitIndex = i;

                } else {
                    minSurplus = Math.min(minSurplus, a[i] - b[i]);
                }
            }

            if (deficitCount == 0) {
                System.out.println("YES");
            } else if (deficitCount >= 2) {

                System.out.println("NO");

            } else {
                long need = b[deficitIndex] - a[deficitIndex];

                if (need <= minSurplus) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }
}