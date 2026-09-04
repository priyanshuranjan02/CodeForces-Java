import java.util.*;

class ThreeThreadlets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            long[] a = new long[3];

            a[0] = sc.nextLong();
            a[1] = sc.nextLong();
            a[2] = sc.nextLong();

            Arrays.sort(a);

            long x = a[0];
            long y = a[1];
            long z = a[2];

            if (x == y && y == z) {
                System.out.println("YES");
            } else if (y % x == 0 && z % x == 0 && (y / x - 1) + (z / x - 1) <= 3) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}