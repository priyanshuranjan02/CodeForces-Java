import java.util.*;

class RudolfAndTheUglyString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            int ans = 0;

            for (int i = 0; i < n; i++) {
                if (i + 4 < n && s.substring(i, i + 5).equals("mapie")) {
                    ans++;
                    i += 4;
                } else if (i + 2 < n) {
                    String cur = s.substring(i, i + 3);
                    if (cur.equals("map") || cur.equals("pie")) {
                        ans++;
                        i += 2;
                    }
                }
            }
            System.out.println(ans);
        }
    }
}