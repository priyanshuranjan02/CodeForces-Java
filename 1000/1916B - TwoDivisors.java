import java.util.*;

class TwoDivisors {
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
            long a = sc.nextLong();
            long b = sc.nextLong();

            long g = gcd(a, b);

            long lcm = (a / g) * b;

            if (lcm == b) {
                long answer = b * (b / a);
                System.out.println(answer);
            } else {
                System.out.println(lcm);
            }
        }
    }
}