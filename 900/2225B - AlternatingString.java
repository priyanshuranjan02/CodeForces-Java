import java.util.*;

class AlternatingString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            String s = sc.next();

            int count = 0;

            for (int i = 0; i < s.length() - 1; i++) {

                if (s.charAt(i) == s.charAt(i + 1)) {
                    count++;
                }
            }

            if (count <= 2) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}