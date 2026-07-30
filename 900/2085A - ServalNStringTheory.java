import java.util.*;

class ServalNStringTheory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            String s = sc.next();

            String rev = new StringBuilder(s).reverse().toString();

            if (s.compareTo(rev) < 0) {
                System.out.println("YES");
                continue;
            }

            if (k == 0) {
                System.out.println("NO");
                continue;
            }

            boolean allSame = true;
            for (int i = 1; i < n; i++) {
                if (s.charAt(i) != s.charAt(0)) {
                    allSame = false;
                    break;
                }
            }

            if (allSame)
                System.out.println("NO");
            else
                System.out.println("YES");
        }
    }
}