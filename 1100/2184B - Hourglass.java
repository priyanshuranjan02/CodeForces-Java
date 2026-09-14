import java.util.*;

class Hourglass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            long s = sc.nextLong();
            long k = sc.nextLong();
            long m = sc.nextLong();

            long answer;

            if (s <= k) {
                answer = Math.max(0, s - (m % k));
            } else {
                long rem = m % (2 * k);

                if (rem < k) {
                    answer = s - (m % k);
                } else {
                    answer = k - (m % k);
                }
            }
            System.out.println(answer);
        }
    }
}