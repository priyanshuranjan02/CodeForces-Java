import java.util.*;

class FunPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] q = new int[n];

            for (int i = 0; i < n; i++) {
                int p = sc.nextInt();
                q[i] = n - p + 1;
            }

            for (int i = 0; i < n; i++) {
                System.out.print(q[i] + " ");
            }
            System.out.println();
        }
    }
}