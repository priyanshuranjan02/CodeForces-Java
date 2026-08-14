import java.util.*;

class TheCunningSeller {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long[] cost = new long[21];
        cost[0] = 3;

        long watermelons = 1;

        for (int i = 1; i < 21; i++) {
            cost[i] = 3 * cost[i - 1] + watermelons;
            watermelons *= 3;
        }

        int t = sc.nextInt();

        while (t-- > 0) {
            long n = sc.nextLong();

            long answer = 0;
            int power = 0;

            while (n > 0) {
                long digit = n % 3;

                answer += digit * cost[power];

                n /= 3;
                power++;
            }
            System.out.println(answer);
        }
    }
}