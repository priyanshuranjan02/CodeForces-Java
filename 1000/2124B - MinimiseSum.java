import java.util.*;

class MinimiseSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            long a1 = sc.nextLong();
            long a2 = sc.nextLong();

            for (int i = 2; i < n; i++) {
                sc.nextLong();
            }

            long answer = Math.min(2 * a1, a1 + a2);

            System.out.println(answer);
        }
    }
}