import java.util.*;

class RenakoAmaoriAndXORGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            int[] a = new int[n];
            int[] b = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            for (int i = 0; i < n; i++) {
                b[i] = sc.nextInt();
            }

            int xorA = 0;
            int xorB = 0;

            for (int i = 0; i < n; i++) {
                xorA ^= a[i];
                xorB ^= b[i];
            }

            int lastDifferent = -1;

            for (int i = 0; i < n; i++) {
                if (a[i] != b[i]) {
                    lastDifferent = i;
                }
            }

            if (lastDifferent == -1) {
                System.out.println("Tie");
            } else {
                if (lastDifferent % 2 == 0) {
                    System.out.println(xorA != xorB ? "Ajisai" : "Tie");
                } else {
                    System.out.println(xorA != xorB ? "Mai" : "Tie");
                }
            }
        }
    }
}