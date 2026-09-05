import java.util.*;

class ChooseTheDifferentOnes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt();

            boolean[] inA = new boolean[k + 1];
            boolean[] inB = new boolean[k + 1];

            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();

                if (x <= k) {
                    inA[x] = true;
                }
            }

            for (int i = 0; i < m; i++) {
                int x = sc.nextInt();

                if (x <= k) {
                    inB[x] = true;
                }
            }

            int onlyA = 0;
            int onlyB = 0;
            int both = 0;

            for (int x = 1; x <= k; x++) {
                if (!inA[x] && !inB[x]) {
                    onlyA = k + 1;
                    break;
                }

                if (inA[x] && inB[x]) {
                    both++;
                } else if (inA[x]) {
                    onlyA++;
                } else {
                    onlyB++;
                }
            }

            
            if (onlyA <= k / 2 && onlyB <= k / 2) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}