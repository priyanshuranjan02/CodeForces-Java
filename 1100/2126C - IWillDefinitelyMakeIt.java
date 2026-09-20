import java.util.*;

class IWillDefinitelyMakeIt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            int[] h = new int[n];

            for (int i = 0; i < n; i++) {
                h[i] = sc.nextInt();
            }

            int start = h[k - 1];

            Arrays.sort(h);

            int current = start;
            boolean possible = true;

            for (int i = 0; i < n; i++) {
                if (h[i] < start) {
                    continue;
                }

                if (h[i] - current > start) {
                    possible = false;
                    break;
                }

                current = h[i];
            }

            System.out.println(possible ? "YES" : "NO");
        }
    }
}