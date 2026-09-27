import java.util.*;

class CardGames {
    static boolean beats(int n, int x, int y) {
        if (x == 1) {
            return y == n;
        }

        if (x == n) {
            return y != 1;
        }

        return x > y;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            boolean aliceWins = false;

            for (int i = 0; i < n; i++) {

                // Alice must own this card
                if (s.charAt(i) != 'A') {
                    continue;
                }

                boolean canWin = true;

                for (int j = 0; j < n; j++) {

                    // Bob owns this card
                    if (s.charAt(j) == 'B') {

                        // Card j+1 beats Alice's card i+1
                        if (beats(n, j + 1, i + 1)) {
                            canWin = false;
                            break;
                        }
                    }
                }

                if (canWin) {
                    aliceWins = true;
                    break;
                }
            }

            System.out.println(aliceWins ? "Alice" : "Bob");
        }
    }
}