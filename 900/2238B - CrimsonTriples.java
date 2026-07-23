import java.util.*;

class CrimsonTriples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            long answer = 0;

            for (int b = 1; b <= n; b++) {
                long count = n / b;

                answer += count * count;
            }
            System.out.println(answer);
        }
    }
}