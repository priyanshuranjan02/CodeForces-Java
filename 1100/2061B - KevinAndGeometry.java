import java.util.*;

class KevinAndGeometry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            long[] a = new long[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }

            Arrays.sort(a);

            long leg = -1;
            int legIndex1 = -1;
            int legIndex2 = -1;

            for (int i = 0; i + 1 < n; i++) {
                if (a[i] == a[i + 1]) {
                    leg = a[i];
                    legIndex1 = i;
                    legIndex2 = i + 1;
                    break;
                }
            }

            if (leg == -1) {
                System.out.println(-1);
                continue;
            }

            long[] remaining = new long[n - 2];
            int idx = 0;

            for (int i = 0; i < n; i++) {
                if (i == legIndex1 || i == legIndex2) {
                    continue;
                }

                remaining[idx++] = a[i];
            }

            boolean found = false;

            for (int i = 0; i + 1 < remaining.length; i++) {
                long x = remaining[i];
                long y = remaining[i + 1];

                if (y - x < 2 * leg) {
                    System.out.println(leg + " " + leg + " " + x + " " + y);

                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println(-1);
            }
        }
    }
}