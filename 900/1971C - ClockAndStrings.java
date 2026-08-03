import java.util.Scanner;

class ClockAndStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();

            if (a > b) {
                int temp = a;
                a = b;
                b = temp;
            }

            boolean insideC = (a < c && c < b);
            boolean insideD = (a < d && d < b);

            System.out.println(insideC != insideD ? "YES" : "NO");
        }
    }
}