import java.util.*;

class OEISProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            for (int i = 1; i <= n; i++) {
                long a = (2L * i - 1) * (2L * i + 1);

                if (i > 1) {
                    System.out.print(" ");
                }

                System.out.print(a);
            }

            System.out.println();
        }
    }
}