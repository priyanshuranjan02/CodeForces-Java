import java.util.*;

class StChroma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();

            if (x == n) {
                for (int i = 0; i < n; i++) {
                    System.out.print(i + " ");
                }
                System.out.println();
            } else {
                for (int i = 0; i < x; i++) {
                    System.out.print(i + " ");
                }

                for (int i = x + 1; i < n; i++) {
                    System.out.print(i + " ");
                }
                System.out.println(x);
            }
        }
    }
}