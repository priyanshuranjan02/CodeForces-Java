import java.util.*;

class OptimalShifts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            int maxZeros = 0;
            int current = 0;

            for (int i = 0; i < n; i++) {

                if (s.charAt(i) == '0') {
                    current++;
                    maxZeros = Math.max(maxZeros, current);
                } else {
                    current = 0;
                }
            }

            int prefixZeros = 0;

            while (prefixZeros < n &&
                   s.charAt(prefixZeros) == '0') {
                prefixZeros++;
            }

            int suffixZeros = 0;

            while (suffixZeros < n &&
                   s.charAt(n - 1 - suffixZeros) == '0') {
                suffixZeros++;
            }

            maxZeros = Math.max(
                    maxZeros,
                    prefixZeros + suffixZeros
            );

            maxZeros = Math.min(maxZeros, n - 1);

            System.out.println(maxZeros);
        }
    }
}