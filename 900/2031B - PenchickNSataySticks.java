import java.util.*;

class PenchickNSataySticks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();
            boolean ok = true;

            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                if (Math.abs(x - (i + 1)) > 1) {
                    ok = false;
                }
            }

            System.out.println(ok ? "YES" : "NO");
        }
    }
}