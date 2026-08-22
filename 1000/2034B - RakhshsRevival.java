import java.util.Scanner;

class RakhshsRevival {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt();

            String s = sc.next();

            int answer = 0;
            int zeroCount = 0;

            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '0') {
                    zeroCount++;
                } else {
                    zeroCount = 0;
                }

                if (zeroCount == m) {
                    answer++;
                    i += k - 1;

                    zeroCount = 0;
                }
            }
            System.out.println(answer);
        }
    }
}