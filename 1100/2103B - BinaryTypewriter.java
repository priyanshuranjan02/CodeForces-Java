import java.util.*;

class BinaryTypewriter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            int transitions = 0;
            char prev = '0';

            for (int i = 0; i < n; i++) {
                if (s.charAt(i) != prev) {
                    transitions++;
                }
                prev = s.charAt(i);
            } 

            int ans;

            if (transitions == 0) {
                ans = n;
            } else if (transitions <= 2) {
                ans = n + 1;
            } else {
                ans = n + transitions - 2;
            }

            System.out.println(ans);
        }
    }
}