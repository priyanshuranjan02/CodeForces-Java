import java.util.*;

class ImpostOrSus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            String str = sc.next();
            char[] s = str.toCharArray();

            int n = s.length;
            int operations = 0;
            
            if (s[0] == 'u') {
                s[0] = 's';
                operations++;
            }

            for (int i = 1; i < n; i++) {
                if (s[i] == 'u' && s[i - 1] == 'u') {
                    s[i] = 's';
                    operations++;
                }
            }

            if (s[n - 1] == 'u') {
                s[n - 1] = 's';
                operations++;
            }
            System.out.println(operations);
        }
    }
}