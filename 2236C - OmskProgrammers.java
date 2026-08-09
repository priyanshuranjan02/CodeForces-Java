import java.util.*;

class OmskProgrammers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long x = sc.nextLong();

            long ans = Long.MAX_VALUE;
            long divisions = 0;

            while (a != b) {
                if (b > a) {
                    long temp = a;
                    a = b;
                    b = temp;
                }

                ans = Math.min(ans, divisions + Math.abs(a - b));

                a /= x;
                divisions++;
            }
            
            ans = Math.min(ans, divisions);
            System.out.println(ans);
        }
    }
}