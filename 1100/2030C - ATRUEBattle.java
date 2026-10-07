import java.util.*;

class ATRUEBattle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t--> 0) {
            int n = sc.nextInt();
            String s = sc.next();

            boolean win = false;

            if (s.charAt(0) == '1') {
                win = true;
            } 

            if (s.charAt(n - 1) == '1') {
                win = true;
            }

            for (int i = 0; i < n - 1; i++) {
                if (s.charAt(i) == '1' && s.charAt(i + 1) == '1') {
                    win = true;
                    break;
                }
            }

            System.out.println(win ? "YES" : "NO");
        }
    }
}