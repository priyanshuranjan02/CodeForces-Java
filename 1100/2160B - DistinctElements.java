import java.util.*;

class DistinctElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            long[] b = new long[n + 1];
            for (int i = 1; i <= n; i++) {
                b[i] = sc.nextLong();
            }

            int[] a = new int[n + 1];
            boolean[] used = new boolean[n + 1];

            int nextUnused = 1;

            a[1] = 1;
            used[1] = true;

            for (int i = 2; i <= n; i++) {
                long diff = b[i] - b[i - 1];

                if (diff == i) {
                    while (used[nextUnused]) {
                        nextUnused++;
                    }

                    a[i] = nextUnused;
                    used[nextUnused] = true;
                } else {
                    int previousIndex = (int) (i - diff);
                    a[i] = a[previousIndex];
                }
            }

            for (int i = 1; i <= n; i++) {
                System.out.print(a[i] + " ");
            }

            System.out.println();
        }
    }
}