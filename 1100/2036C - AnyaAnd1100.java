import java.util.*;

class AnyaAnd1100 {
    static boolean is1100(char[] s, int start) {
        if (start < 0 || start + 3 >= s.length) {
            return false;
        }

        return s[start] == '1'
                && s[start + 1] == '1'
                && s[start + 2] == '0'
                && s[start + 3] == '0';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            char[] s = sc.next().toCharArray();

            int q = sc.nextInt();

            int count = 0;

            for (int i = 0; i + 3 < s.length; i++) {
                if (is1100(s, i)) {
                    count++;
                }
            }

            while (q-- > 0) {
                int pos = sc.nextInt() - 1;
                char value = sc.nextInt() == 1 ? '1' : '0';

                for (int start = pos - 3; start <= pos; start++) {
                    if (is1100(s, start)) {
                        count--;
                    }
                }

                s[pos] = value;

                for (int start = pos - 3; start <= pos; start++) {
                    if (is1100(s, start)) {
                        count++;
                    }
                }

                System.out.println(count > 0 ? "YES" : "NO");
            }
        }
    }
}