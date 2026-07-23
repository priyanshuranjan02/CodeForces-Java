import java.util.*;

class CakeLeveling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            long sum = 0;
            long minHeight = Long.MAX_VALUE;

            for (int i = 0; i < n; i++) {
                long height = sc.nextLong();

                sum += height;

                long average = sum / (i + 1);

                minHeight = Math.min(minHeight, average);
                System.out.print(minHeight + " ");
            }
            System.out.println();
        }
    }
}