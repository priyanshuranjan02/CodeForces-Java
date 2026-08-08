import java.util.*;

class Spring {
    static long gcd (long a, long b) {
        while (b != 0) {
            long t = a % b;
            a = b;
            b = t;
        }
        return a;
    }

    static long lcm (long a, long b) {
        return a / gcd(a, b) * b;
    }

    static long get (long a, long b, long c, long m) {
        long A = m / a;
        long AB = m / lcm (a, b);
        long AC = m / lcm (a, c);
        long ABC = m / lcm (lcm(a, b), c);

        long alone = A - AB - AC + ABC;
        long two = AB + AC - 2 * ABC;
        long three = ABC;

        return alone * 6 + two * 3 + three * 2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();
            long m = sc.nextLong();

            System.out.println(
                get(a, b, c, m) + " "
              + get(b, a, c, m) + " "
              + get(c, a, b, m)
            );
        }
    }
}