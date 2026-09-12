import java.util.*;

class MickeyMouseConstructive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            int diff = Math.abs(x - y);

            int answer;

            if (diff == 0) {
                answer = 1;
            } else {
                answer = 0;

                for (int i = 1; i * i <= diff; i++) {
                    if (diff % i == 0) {
                        answer++;

                        if (i != diff / i) {
                            answer++;
                        }
                    }
                }
            }

            System.out.println(answer);

            for (int i = 0; i < x; i++) {
                System.out.print("1 ");
            }

            for (int i = 0; i < y; i++) {
                System.out.print("-1");

                if (i + 1 < y) {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}