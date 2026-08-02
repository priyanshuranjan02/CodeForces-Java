import java.util.Scanner;

class SubmissionBait {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            int[] freq = new int[n + 1];

            for (int i = 0; i < n; i++) {
                freq[sc.nextInt()]++;
            }

            boolean ok = false;

            for (int i = 1; i <= n; i++) {
                if ((freq[i] & 1) == 1) {
                    ok = true;
                    break;
                }
            }

            System.out.println(ok ? "YES" : "NO");
        }

        sc.close();
    }
}