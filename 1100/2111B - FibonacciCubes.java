import java.util.*;

class FibonacciCubes {   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] f = new int[12];
        f[1] = 1;
        f[2] = 2;

        for (int i = 3; i < 12; i++) {
            f[i] = f[i - 1] + f[i - 2];
        }

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            StringBuilder ans = new StringBuilder();

            for (int i = 0; i < m; i++) {
                int w = sc.nextInt();
                int l = sc.nextInt();
                int h = sc.nextInt();

                int min = Math.min(w, Math.min(l, h));
                int max = Math.max(w, Math.max(l, h));

                if (min >= f[n] && max >= f[n] + f[n - 1]) {
                    ans.append('1');
                } else {
                    ans.append('0');
                }
            }

            System.out.println(ans);
        }
    }
}