import java.util.*;

class SimpleRepetition {
    static boolean isPrime(long x) {
        if (x < 2) {
            return false;
        } 

        if (x == 2) {
            return true;
        }

        if (x % 2 == 0) {
            return false;
        }

        for (long i = 3; i * i <= x; i += 2) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            long x = sc.nextLong();
            int k = sc.nextInt();

            if (k == 1) {
                System.out.println(isPrime(x) ? "YES" : "NO");
            } else if (x == 1 && k == 2) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}