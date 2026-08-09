import java.util.*;

class Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int k = sc.nextInt();

            int a1 = sc.nextInt();
            int b1 = sc.nextInt();

            int a2 = sc.nextInt();
            int b2 = sc.nextInt();

            boolean bobCanWin = false;

            for (int a3 = 0; a3 <= k && !bobCanWin; a3++) {
                for (int b3 = 0; b3 <= k; b3++) {
                    if (a3 == b3) {
                        continue;
                    }

                    int aliceScore = a1 + a2 + a3;
                    int bobScore = b1 + b2 + b3;

                    if (aliceScore < bobScore) {
                        bobCanWin = true;
                        break;
                    }

                    if (aliceScore == bobScore) {
                        int aliceWins = 0;
                        int bobWins = 0;

                        if (a1 > b1) {
                            aliceWins++;
                        } else {
                            bobWins++;
                        }

                        if (a2 > b2) {
                            aliceWins++;
                        } else {
                            bobWins++;
                        }

                        if (a3 > b3) {
                            aliceWins++;
                        } else {
                            bobWins++;
                        }

                        if (bobWins > aliceWins) {
                            bobCanWin = true;
                            break;
                        }
                    }
                }
            }
            System.out.println(bobCanWin ? "YES" : "NO");
        }
    }
}