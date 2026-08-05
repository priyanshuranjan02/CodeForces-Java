import java.util.HashSet;
import java.util.Scanner;

class Forked {
    static class Pair {
        int x, y;

        Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (!(obj instanceof Pair)) return false;
            Pair p = (Pair) obj;
            return x == p.x && y == p.y;
        }

        @Override
        public int hashCode() {
            return 31 * x + y;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            int xa = sc.nextInt();
            int ya = sc.nextInt();

            int xb = sc.nextInt();
            int yb = sc.nextInt();

            int[] dx = { a, a, -a, -a, b, b, -b, -b };
            int[] dy = { b, -b, b, -b, a, -a, a, -a };

            HashSet<Pair> alice = new HashSet<>();

            for (int i = 0; i < 8; i++) {
                alice.add(new Pair(xa + dx[i], ya + dy[i]));
            }

            HashSet<Pair> bob = new HashSet<>();

            for (int i = 0; i < 8; i++) {
                bob.add(new Pair(xb + dx[i], yb + dy[i]));
            }

            int ans = 0;

            for (Pair p : bob) {
                if (alice.contains(p))
                    ans++;
            }
            System.out.println(ans);
        }
    }
}