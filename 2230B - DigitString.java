import java.util.*;

class DigitString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            String s = sc.next();

            int pref2 = 0;
            int suf13 = 0;

            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (c == '1' || c == '3') {
                    suf13++;
                }
            }

            int best = pref2 + suf13;

            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);

                if (c == '2') {
                    pref2++;
                } 
                if (c == '1' || c == '3') {
                    suf13--;
                }

                best = Math.max(best, pref2 + suf13);
            }
            
            System.out.println(s.length() - best);
        }
    }
}