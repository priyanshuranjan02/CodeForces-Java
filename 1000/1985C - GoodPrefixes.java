import java.util.*;

class GoodPrefixes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            long sum = 0;
            long max = 0;
            int answer = 0;

            for (int i = 0; i < n; i++) {
                long x = sc.nextLong();

                sum += x;
                max = Math.max(max, x);

                if (2 * max == sum) {
                    answer++;
                }
            }
            
            System.out.println(answer);
        }
    }
}