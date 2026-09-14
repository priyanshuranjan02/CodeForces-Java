import java.util.*;

class YetAnotherMEXProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            boolean[] present = new boolean[k - 1];

            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();

                if (x < k - 1) {
                    present[x] = true;
                }
            }

            int mex = 0;

            while (mex < k - 1 && present[mex]) {
                mex++;
            }

            System.out.println(mex);
        }
    }
}