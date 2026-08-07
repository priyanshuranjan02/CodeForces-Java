import java.util.*;

class AnnoyingTheGhost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t= sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            long[] a = new long[n];
            long[] b = new long[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }

            for (int i = 0; i < n; i++) {
                b[i] = sc.nextLong();
            }

            boolean[] used = new boolean[n];
            long ans = 0;
            boolean ok = true;
            
            for (int i = 0; i < n && ok; i++) {
                int pos = -1;

                for (int j = 0; j < n; j++) {
                    if (!used[j] && a[j] <= b[i]) {
                        pos = j;
                        break;
                    }
                }

                if (pos == -1) {
                    ok = false;
                    break;
                }

                int moves = 0;
                for (int j = 0; j < pos; j++) {
                    if (!used[j]) {
                        moves++;
                    }
                }

                ans += moves;
                used[pos] = true;
            }
            
            if (!ok) {
                System.out.println(-1);
            } else {
                System.out.println(ans);
            }
        }
    }
}