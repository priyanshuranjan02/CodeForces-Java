import java.util.*;

class MaximumCostPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            int[] p = new int[n];
            boolean[] used = new boolean[n + 1];

            int zeroCount = 0;
            int firstZero = -1;
            int lastZero = -1;

            for (int i = 0; i < n; i++) {
                p[i] = sc.nextInt();

                if (p[i] == 0) {
                    zeroCount++;

                    if (firstZero == -1) {
                        firstZero = i;
                    }

                    lastZero = i;
                } else {
                    used[p[i]] = true;
                }
            }

            if (zeroCount == 1) {
                int missing = -1;

                for (int x = 1; x <= n; x++) {
                    if (!used[x]) {
                        missing = x;
                        break;
                    }
                }

                p[firstZero] = missing;
            }

            int left = -1;
            int right = -1;

            for (int i = 0; i < n; i++) {
                if (p[i] != i + 1) {
                    if (left == -1) {
                        left = i;
                    }

                    right = i;
                }
            }

            if (left == -1) {
                System.out.println(0);
                continue;
            }

            if (zeroCount >= 2) {
                left = Math.min(left, firstZero);
                right = Math.max(right, lastZero);
            }

            System.out.println(right - left + 1);
        }
    }
}