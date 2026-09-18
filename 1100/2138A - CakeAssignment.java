import java.util.*;

class CakeAssignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0 ) {
            int k = sc.nextInt();
            long x = sc.nextLong();

            long half = 1L << k;
            long total = 1L << (k + 1);

            ArrayList<Integer> operations = new ArrayList<>();

            while (x != half) {
                if (x < half) {
                    operations.add(1);
                    x = x * 2;
                } else {
                    operations.add(2);
                    x = 2 * x - total;
                }
            }

            Collections.reverse(operations);

            System.out.println(operations.size());

            for (int op : operations) {
                System.out.print(op + " ");
            }
            System.out.println();
        }
    }
}