import java.util.*;

class LauraAndOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            int ans1 = ((b - c) % 2 == 0) ? 1 : 0;
            int ans2 = ((a - c) % 2 == 0) ? 1 : 0;
            int ans3 = ((a - b) % 2 == 0) ? 1 : 0;

            System.out.println(ans1 + " " + ans2 + " " + ans3);
        }
    }
}