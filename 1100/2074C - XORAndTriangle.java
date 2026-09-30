import java.util.*;

class XORAndTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int x = sc.nextInt();
            int ans = -1;

            for (int i = 0; i < 30; i++) {
                for (int j = 0; j < 30; j++) {

                    int y = (1 << i) | (1 << j);

                    if (y < x &&
                        x + y > (x ^ y) &&
                        y + (x ^ y) > x) {

                        ans = y;
                    }
                }
            }

            System.out.println(ans);
        }
    }
}