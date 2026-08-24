import java.util.*;

class CardGame {
    static boolean suneetWins(int a1, int a2, int b1, int b2) {
        return (a1 > b1 && a2 >= b2) || (a1 >= b1 && a2 > b2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int a1 = sc.nextInt();
            int a2 = sc.nextInt();
            int b1 = sc.nextInt();
            int b2 = sc.nextInt();

            int answer = 0;

            if (suneetWins(a1, a2, b1, b2)) {
                answer += 2;
            }

            if (suneetWins(a1, a2, b2, b1)) {
                answer += 2;
            }

            System.out.println(answer);
        }
    }
}