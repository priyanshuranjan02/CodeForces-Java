import java.util.*;
class LeftNDown {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long k = sc.nextLong();
            long g = gcd(a, b);
            long A = a / g;
            long B = b / g;
            
            if(A <= k && B <= k) {
                System.out.println(1);
            } else {
                System.out.println(2);
            } 
        }
    }
    private static long gcd(long x, long y) {
        while(y != 0) {
            long r = x % y;
            x = y;
            y = r;
        }
        return x;
    }
}
