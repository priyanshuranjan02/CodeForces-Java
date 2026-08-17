import java.util.*;

class NeedMoreArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            int answer = 0;
            int last = -2;

            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();

                if (x > last + 1) {
                    answer++;
                    last = x;
                }
            }
            System.out.println(answer);
        }
    }
}