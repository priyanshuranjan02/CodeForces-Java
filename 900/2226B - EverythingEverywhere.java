import java.util.Scanner;

class EverythingEverywhere {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();
            int[] p = new int[n];

            for (int i = 0; i < n; i++) {
                p[i] = sc.nextInt();
            }

            int count = 0;

            for (int i = 0; i < n - 1; i++) {

                int difference = Math.abs(p[i] - p[i + 1]);
                int gcd = gcd(p[i], p[i + 1]);

                if (difference == gcd) {
                    count++;
                }
            }

            System.out.println(count);
        }

        sc.close();
    }

    public static int gcd(int a, int b) {

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }
}