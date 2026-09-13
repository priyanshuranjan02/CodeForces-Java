import java.util.*;

class HugePile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            long n = sc.nextLong();
            long k = sc.nextLong();

            long l = n;
            long r = n;
            int operations = 0;

            while (r != 1) {
                if (l <= k && k <= r) {
                    break;
                }

                l = l / 2;
                r = r / 2 + r % 2;

                operations++;
            }

            if (l <= k && k <= r) {
                System.out.println(operations);
            } else {
                System.out.println(-1);
            }
        }
    }
}