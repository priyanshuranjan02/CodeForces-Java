import java.util.Scanner;

class YetAnotherArrayProblem {
    static long gcd(long a, long b) {
        while (b != 0) {
            long temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            long[] a = new long[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }

            long answer = -1;

            for (long x = 2; x <= 100; x++) {
                boolean possible = false;

                for (int i = 0; i < n; i++) {
                    if (gcd(a[i], x) == 1) {
                        possible = true;
                        break;
                    }
                }

                if (possible) {
                    answer = x;
                    break;
                }
            }

            System.out.println(answer);
        }
    }
}