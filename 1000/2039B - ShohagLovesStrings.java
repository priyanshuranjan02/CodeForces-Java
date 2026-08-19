import java.util.*;

class ShohagLovesStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            String s = sc.next();
            boolean found = false;

            for (int i = 0; i + 1 < s.length(); i++) {
                if (s.charAt(i) == s.charAt(i + 1)) {
                    System.out.println(s.substring(i, i + 2));
                    found = true;
                    break;
                }
            }

            if (found) {
                continue;
            }

            for (int i = 0; i + 2 < s.length(); i++) {
                char a = s.charAt(i);
                char b = s.charAt(i + 1);
                char c = s.charAt(i + 2);

                if (a != b && b != c && a != c) {
                    System.out.println(s.substring(i, i + 3));
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("-1");
            }
        }
    }
}