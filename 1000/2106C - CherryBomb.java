import java.util.*;

class CherryBomb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            long k = sc.nextLong();

            long[] a = new long[n];
            long[] b = new long[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }

            boolean hasKnown = false;
            long x = -1;

            for (int i = 0; i < n; i++) {
                b[i] = sc.nextLong();

                if (b[i] != -1 && !hasKnown) {
                    x = a[i] + b[i];
                    hasKnown = true;
                }
            }

            if (hasKnown) {
                boolean possible = true;

                for (int i = 0; i < n; i++) {
                    if (b[i] != -1) {
                        if (a[i] + b[i] != x) {
                            possible = false;
                            break;
                        }
                    } else {
                        long value = x - a[i];

                        if (value < 0 || value > k) {
                            possible = false;
                            break;
                        }
                    }
                }

                System.out.println(possible ? 1 : 0);
            } else {
                long minA = a[0];
                long maxA = a[0];

                for (int i = 1; i < n; i++) {
                    minA = Math.min(minA, a[i]);
                    maxA = Math.max(maxA, a[i]);
                }

                long left = maxA;
                long right = minA + k;

                long answer = Math.max(0, right - left + 1);

                System.out.println(answer);
            }
        }
    }
}