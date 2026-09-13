import java.util.*;

class DiceRollSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            int answer = 0;

            for (int i = 1; i < n; i++) {
                if (a[i] == a[i - 1] || a[i] + a[i - 1] == 7) {
                    answer++;
                    i++;
                }
            }
            System.out.println(answer);
        }
    }
}