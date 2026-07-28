import java.util.Scanner;

class LikeTheBitset {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();
            int k = sc.nextInt();
            String s = sc.next();

            int maxRun = 0;
            int run = 0;

            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '1') {
                    run++;
                    maxRun = Math.max(maxRun, run);
                } else {
                    run = 0;
                }
            }

            if (maxRun >= k) {
                System.out.println("NO");
                continue;
            }

            System.out.println("YES");

            int[] ans = new int[n];

            int large = n;
            int small = 1;

            // Give largest values to '0'
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '0') {
                    ans[i] = large--;
                }
            }

            // Give smallest values to '1'
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '1') {
                    ans[i] = small++;
                }
            }

            for (int x : ans) {
                System.out.print(x + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}