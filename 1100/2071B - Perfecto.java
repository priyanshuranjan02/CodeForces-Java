import java.util.*;

class Perfecto {
    static boolean isPerfectSquare(long x) {
        long r = (long) Math.sqrt(x);
        return r * r == x;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            long total = (long) n * (n + 1) / 2;

            if (isPerfectSquare(total)) {
                System.out.println(-1);
                continue;
            }

            int[] p =new int[n];

            for (int i = 0; i < n; i++) {
                p[i] = i + 1;
            }

            long sum = 0;

            for (int i = 0; i < n; i++) {
                sum += p[i];

                if (isPerfectSquare(sum)) {
                    int temp = p[i];
                    p[i] = p[i + 1];
                    p[i + 1] = temp;
                    
                    sum++;
                }
            }

            for (int i = 0; i < n; i++) {
                System.out.print(p[i] + " ");
            }

            System.out.println();
        }
    }
}