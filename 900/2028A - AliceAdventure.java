import java.util.*;

class AliceAdventure {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();

            String s = sc.next();

            int x = 0;
            int y = 0;

            boolean ok = (x == a && y == b);

            for (int rep = 0; rep < 100 && !ok; rep++) {
                for (int i = 0; i < n; i++) {

                    char c = s.charAt(i);

                    if (c == 'N') y++;
                    else if (c == 'S') y--;
                    else if (c == 'E') x++;
                    else x--;

                    if (x == a && y == b) {
                        ok = true;
                        break;
                    }
                }
            }
            System.out.println(ok ? "YES" : "NO");
        }
    }
}