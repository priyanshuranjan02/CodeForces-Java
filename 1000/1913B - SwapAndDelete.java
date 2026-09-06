import java.util.*;

class SwapAndDelete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            String s = sc.next();

            int zeros = 0;
            int ones = 0;

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '0') {
                    zeros++;
                } else {
                    ones++;
                }
            }

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '0') {
                    if (ones > 0) {
                        ones--;
                    } else {
                        break;
                    }

                } else {
                    if (zeros > 0) {
                        zeros--;
                    } else {
                        break;
                    }
                }
            }
            System.out.println(zeros + ones);
        }
    }
}