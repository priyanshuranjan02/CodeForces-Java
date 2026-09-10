import java.util.*;

class AIFindsNothingHere {
    static final long MOD = 998244353L;

    static long power(long base, long exp) {
        long result = 1;

        while (exp > 0) {
            if ((exp & 1) == 1) {
                result = result * base % MOD;
            }

            base = base * base % MOD;
            exp >>= 1;
        }

        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            long n = sc.nextLong();
            long m = sc.nextLong();
            long r = sc.nextLong();
            long c = sc.nextLong();

            long exponent = n * (c - 1) + m * (r - 1) - (r - 1) * (c - 1);

            System.out.println(power(2, exponent));
        }
    }
}