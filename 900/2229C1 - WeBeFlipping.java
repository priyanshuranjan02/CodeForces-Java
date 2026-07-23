import java.util.ArrayList;
import java.util.Scanner;

class WeBeFlipping {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();
            long[] a = new long[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }

            ArrayList<Integer> operations = new ArrayList<>();

            boolean flipped = false;

            for (int i = n - 1; i >= 0; i--) {

                long current;

                if (flipped) {
                    current = -a[i];
                } else {
                    current = a[i];
                }

                if (current > 0) {
                    operations.add(i + 1);
                    flipped = !flipped;
                }
            }

            System.out.println(operations.size());

            if (!operations.isEmpty()) {
                for (int index : operations) {
                    System.out.print(index + " ");
                }

                System.out.println();
            }
        }
    }
}