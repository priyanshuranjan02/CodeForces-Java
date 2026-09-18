import java.util.*;

class MaximumEvenSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();

            if (a % 2 == 0) {
                if (b % 2 == 1) {
                    System.out.println(-1);
                } else {
                    System.out.println((a * b) / 2 + 2);
                }
            } else {
                if (b % 2 == 1) {
                    System.out.println(a * b + 1);
                } else if (b % 4 == 0) {
                    System.out.println((a * b) / 2 + 2);
                } else {
                    System.out.println(-1);
                }
            }
        }
    }
}