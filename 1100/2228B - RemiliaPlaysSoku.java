import java.util.*;

class RemiliaPlaysSoku {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            long n = sc.nextLong();
            long x = sc.nextLong();
            long y = sc.nextLong();
            long k = sc.nextLong();

            if (n <= 3) {
                System.out.println(1);
            } else {
                long diff = Math.abs(x - y);
                long distance = Math.min(diff, n - diff);

                System.out.println(distance + k);
            }
        }
    }
}