import java.util.Scanner;

class YetAnotherConstructive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();
            int k = sc.nextInt();
            int m = sc.nextInt();

            if (k > m) {
                System.out.println("NO");
                continue;
            }

            System.out.println("YES");

            int prev = 0;

            for (int i = 1; i <= n; i++) {

                int curr = i % k;

                long diff = (curr - prev + m) % m;
                if (diff == 0) diff = m;

                System.out.print(diff);
                if (i != n) System.out.print(" ");

                prev = curr;
            }

            System.out.println();
        }
    }
}