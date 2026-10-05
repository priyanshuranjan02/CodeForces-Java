import java.util.*;
import java.math.BigInteger;

class Digits {
    static long factorial(int n) {
        long fact = 1;

        for (int i = 2; i <= n; i++) {
            fact *= i;
        }

        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int d = sc.nextInt();

            n = Math.min(n, 7);

            long count = factorial(n);

            StringBuilder sb = new StringBuilder();

            for (long i = 0; i < count; i++) {
                sb.append(d);
            }

            BigInteger number = new BigInteger(sb.toString());

            for (int x = 1; x <= 9; x += 2) {
                if (number.mod(BigInteger.valueOf(x)).equals(BigInteger.ZERO)) {
                    System.out.print(x + " ");
                }
            }

            System.out.println();
        }
    }
}