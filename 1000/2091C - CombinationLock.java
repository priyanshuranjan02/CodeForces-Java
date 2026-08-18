import java.util.*;

class CombinationLock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            if (n % 2 == 0) {
                System.out.println(-1);
                continue;
            }

            StringBuilder sb = new StringBuilder();

            for (int i = n; i >= 1; i--) {
                sb.append(i);

                if (i > 1) {
                    sb.append(" ");
                }
            }

            System.out.println(sb);
        }
    }
}