import java.util.*;

class TheStrictTeacher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int q = sc.nextInt();

            int b1 = sc.nextInt();
            int b2 = sc.nextInt();

            if (b1 > b2) {
                int temp = b1;
                b1 = b2;
                b2 = temp;
            }

            int x = sc.nextInt();

            int answer;


            if (x < b1) {
                answer = b1 - 1;
            } else if (x > b2) {
                answer = n - b2;
            } else {
                answer = (b2 - b1) / 2;
            }
            System.out.println(answer);
        }
    }
}