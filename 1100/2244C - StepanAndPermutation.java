import java.util.*;

class StepanAndPermutation {
    static int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();

            int g = gcd(x, y);

            boolean possible = true;

            for (int i = 1; i <= n; i++) {
                int value = sc.nextInt();

                if (i % g != value % g) {
                    possible = false;
                }
            }
            System.out.println(possible ? "YES" : "NO");
        }
    }
}