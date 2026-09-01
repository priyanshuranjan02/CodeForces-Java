import java.util.*;

class PermutationPrinting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        StringBuilder out = new StringBuilder();

        while (t-- > 0) {
            int n = sc.nextInt();

            int left = 1;
            int right = n;

            for (int i = 0; i < n; i++) {
                if (i % 2 == 0) {
                    out.append(left++);
                } else {
                    out.append(right--);
                }

                if (i + 1 < n) {
                    out.append(' ');
                }
            }
            out.append('\n');
        }

        System.out.print(out);
    }
}