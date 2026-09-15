import java.util.*;

class BlackslexAndNumberTheory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            long min1 = Long.MAX_VALUE;
            long min2 = Long.MAX_VALUE;

            for (int i = 0; i < n; i++) {
                long x = sc.nextLong();

                if (x < min1) {
                    min2 = min1;
                    min1 = x;
                } else if (x < min2) {
                    min2 = x;
                }
            }

            long answer = Math.max(min1, min2 - min1);
            System.out.println(answer);
        }
    }
}