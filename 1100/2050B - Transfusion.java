import java.util.*;

class Transfusion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            long totalSum = 0;
            long evenSum = 0;
            long oddSum = 0;

            int evenCount = 0;
            int oddCount = 0;

            for (int i = 0; i < n; i++) {
                long x = sc.nextLong();

                totalSum += x;

                if (i % 2 == 0) {
                    evenSum += x;
                    evenCount++;
                } else {
                    oddSum += x;
                    oddCount++;
                }
            }

            if (totalSum % n != 0) {
                System.out.println("NO");
                continue;
            }

            long target = totalSum / n;

            if (evenSum == target * evenCount &&
                oddSum == target * oddCount) {

                System.out.println("YES");

            } else {
                System.out.println("NO");
            }
        }
    }
}