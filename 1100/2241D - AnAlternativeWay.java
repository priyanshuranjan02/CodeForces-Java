import java.util.*;

class AnAlternativeWay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            long prefixA = 0;
            long prefixB = 0;

            long[] a = new long[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }

            boolean possible = true;

            for (int i = 0; i < n; i++) {
                prefixA += a[i];
                prefixB += sc.nextLong();

                if (prefixA > prefixB) {
                    possible = false;
                }
            }

            System.out.println(possible ? "YES" : "NO");
        }
    }
}