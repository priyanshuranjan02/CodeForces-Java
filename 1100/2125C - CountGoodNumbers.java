import java.util.*;

class CountGoodNumbers {
    static long countGood(long x) {
        if (x <= 0) {
            return 0;
        }

        int[] primes = {2, 3, 5, 7};
        long result = 0;

        for (int mask = 0; mask < 16; mask++) {
            long product = 1;
            int bits = 0;

            for (int i = 0; i < 4; i++) {
                if ((mask & (1 << i)) != 0) {
                    product *= primes[i];
                    bits++;
                }
            }

            long count = x / product;

            if (bits % 2 == 0) {
                result += count;
            } else {
                result -= count;
            }
        }

        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            long l = sc.nextLong();
            long r = sc.nextLong();

            long answer = countGood(r) - countGood(l - 1);

            System.out.println(answer);
        }
    }
}