import java.util.*;

class Marenol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            String a = sc.next();
            String b = sc.next();

            int aOdd = 0;
            int aEven = 0;

            int bOdd = 0;
            int bEven = 0;

            for (int i = 0; i < n; i++) {

                if (a.charAt(i) == '1') {
                    if (i % 2 == 0) {
                        aOdd++;
                    } else {
                        aEven++;
                    }
                }
                if (b.charAt(i) == '1') {
                    if (i % 2 == 0) {
                        bOdd++;
                    } else {
                        bEven++;
                    }
                }
            }

            if (aOdd == bOdd && aEven == bEven) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}