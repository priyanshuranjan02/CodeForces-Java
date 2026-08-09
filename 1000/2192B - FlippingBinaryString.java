import java.util.*;

class FlippingBinaryString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            ArrayList<Integer> ones = new ArrayList<>();
            ArrayList<Integer> zeros = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '1') {
                    ones.add(i + 1);
                } else {
                    zeros.add(i + 1);
                }
            }

            if (ones.size() % 2 == 0) {

                System.out.println(ones.size());

                for (int i = 0; i < ones.size(); i++) {
                    if (i > 0) System.out.print(" ");
                    System.out.print(ones.get(i));
                }

                System.out.println();

            } else if (zeros.size() % 2 == 1) {

                System.out.println(zeros.size());

                for (int i = 0; i < zeros.size(); i++) {
                    if (i > 0) System.out.print(" ");
                    System.out.print(zeros.get(i));
                }

                System.out.println();

            } else {
                System.out.println(-1);
            }
        }
    }
}