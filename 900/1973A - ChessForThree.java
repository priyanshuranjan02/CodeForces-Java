import java.util.*;

class ChessForThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int p1 = sc.nextInt();
            int p2 = sc.nextInt();
            int p3 = sc.nextInt();

            int sum = p1 + p2 + p3;

            if ((sum & 1) == 1) {
                System.out.println(-1);
            } else {
                System.out.println(Math.min(sum / 2, p1 + p2));
            }
        }
    }
}