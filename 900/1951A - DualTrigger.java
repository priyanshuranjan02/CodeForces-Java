import java.util.*;

class DualTrigger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            int ones = 0;
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '1') {
                    ones++;
                }
            }

            if ((ones & 1) == 1) {
                System.out.println("NO");
            } else if (ones == 2) {
                boolean adjacent = false;
                for (int i = 0; i < n - 1; i++) {
                    if (s.charAt(i) == '1' && s.charAt(i + 1) == '1') {
                        adjacent = true;
                        break;
                    }
                }
                System.out.println(adjacent ? "NO" : "YES");
            } else {
                System.out.println("YES");
            }
        }
    }
}