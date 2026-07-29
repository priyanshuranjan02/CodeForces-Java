import java.util.*;

class DownWithBrackets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            String s = sc.next();

            int balance = 0;
            boolean possible = false;

            for (int i = 0; i < s.length() - 1; i++) {
                if (s.charAt(i) == '(') {
                    balance++;
                } else {
                    balance--;
                }

                if (balance == 0) {
                    possible = true;
                    break;
                }
            }
            System.out.println(possible ? "YES" : "NO");
        }
    }
}