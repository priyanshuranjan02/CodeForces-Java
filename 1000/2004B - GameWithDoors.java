import java.util.*;

class GameWithDoors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            int L = sc.nextInt();
            int R = sc.nextInt();

            int left = Math.max(l, L);
            int right = Math.min(r, R);

            int answer;

            if (left > right) {
                answer = 1;
            } else {
                int intersection = right - left + 1;
                answer = intersection - 1;

                if (l != L) {
                    answer++;
                }

                if (r != R) {
                    answer++;
                }
            }

            System.out.println(answer);
        }
    }
}