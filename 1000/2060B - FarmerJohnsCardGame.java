import java.util.*;

class FarmerJohnsCardGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            int[] owner = new int[n];

            for (int i = 0; i < n; i++) {
                owner[i] = -1;
            }

            boolean possible = true;

            for (int cow = 0; cow < n; cow++) {
                for (int j = 0; j < m; j++) {
                    int card = sc.nextInt();
                    int remainder = card % n;

                    if (owner[remainder] == -1) {
                        owner[remainder] = cow;
                    } else if (owner[remainder] != cow) {
                        possible = false;
                    }
                }
            }

            if (!possible) {
                System.out.println(-1);
                continue;
            }

            for (int i = 0; i < n; i++) {
                if (i > 0) {
                    System.out.print(" ");
                }
                System.out.print(owner[i] + 1);
            }
            System.out.println();
        }
    }
}