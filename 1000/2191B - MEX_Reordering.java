import java.util.*;

class MEX_Reordering {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] freq = new int[n + 2];

            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                freq[x]++;
            }

            int mex = 0;

            while (freq[mex] > 0) {
                mex++;
            }

            boolean possible;

            if (mex == 0) {
                possible = false;
            } else if (mex == 1) {
                possible = (freq[0] == 1);
            } else {
                possible = true;
            }
            System.out.println(possible ? "YES" : "NO");
        }
    }
}