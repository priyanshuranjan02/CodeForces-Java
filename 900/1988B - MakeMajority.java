import java.util.*;

class MakeMajority {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            int ones = 0;
            int zeroBlocks = 0;

            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '1') {
                    ones++;
                } else {
                    if (i == 0 || s.charAt(i - 1) == '1') {
                        zeroBlocks++;
                    }
                }
            }
            System.out.println(ones > zeroBlocks ? "YES" : "NO");
        }
    }
}