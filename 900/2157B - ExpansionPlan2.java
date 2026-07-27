import java.util.*;

class ExpansionPlan2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            long x = sc.nextLong();
            long y = sc.nextLong();

            String s = sc.next();

            long cnt4 = 0;
            long cnt8 = 0;

            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '4') {
                    cnt4++;
                } else {
                    cnt8++;
                }
            }

            long u = x + y;
            long v = x - y;

            long excessU = Math.max(0L, Math.abs(u) - cnt4);
            long excessV = Math.max(0L, Math.abs(v) - cnt4);

            if (excessU + excessV <= 2L * cnt8) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}