import java.util.*;

class ABFlipping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            int firstA = -1;
            int lastB = -1;

            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == 'A' && firstA == -1) {
                    firstA = i;
                }

                if (s.charAt(i) == 'B') {
                    lastB = i;
                }
            }

            if (firstA == -1 || lastB == -1 || firstA > lastB) {
                System.out.println(0);
            } else {
                System.out.println(lastB - firstA);
            }
        }
    }
}