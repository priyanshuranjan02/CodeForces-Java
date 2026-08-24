import java.util.*;

class MinimizeEqualSumSubarrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        StringBuilder out = new StringBuilder();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] p = new int[n];

            for (int i = 0; i < n; i++) {
                p[i] = sc.nextInt();
            }

            for (int i = 1; i < n; i++) {
                out.append(p[i]).append(' ');
            }

            out.append(p[0]).append('\n');
        }
        System.out.print(out);
    }
}