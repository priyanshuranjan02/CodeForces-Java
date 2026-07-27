import java.util.*;

class TabClosing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();

            if (a <= n && n <= b) {
                System.out.println(1);
            } else {
                System.out.println(2);
            }
        }
    }
}