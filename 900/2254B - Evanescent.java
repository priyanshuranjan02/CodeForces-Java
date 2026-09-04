import java.util.*;

class Evanescent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            int compressed = 1;

            for (int i = 1; i < n; i++) {
                if (s.charAt(i) != s.charAt(i - 1)) {
                    compressed++;
                }
            }
            
            int bestReduction = 0;

            for (int i = 1; i < n - 1; i++) {
                char left = s.charAt(i - 1);
                char mid = s.charAt(i);
                char right = s.charAt(i + 1);

                if (left == right && left != mid) {
                    bestReduction = 2;
                    break;
                }

                if (left != mid && mid != right) {
                    bestReduction = Math.max(bestReduction, 1);
                }
            }
            System.out.println(compressed - bestReduction);
        }
    }
}