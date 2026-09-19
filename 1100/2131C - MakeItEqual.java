import java.util.*;

class MakeItEqual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            long k = sc.nextLong();

            HashMap<Long, Integer> map = new HashMap<>();

            for (int i = 0; i < n; i++) {
                long x = sc.nextLong();

                long remainder = x % k;
                long canonical = Math.min(remainder, k - remainder);

                map.put(canonical, map.getOrDefault(canonical, 0) + 1);
            }

            boolean possible = true;

            for (int i = 0; i < n; i++) {
                long x = sc.nextLong();

                long remainder = x % k;
                long canonical = Math.min(remainder, k - remainder);

                if (!map.containsKey(canonical) || map.get(canonical) == 0) {
                    possible = false;
                } else {
                    map.put(canonical, map.get(canonical) - 1);
                }
            }

            System.out.println(possible ? "YES" : "NO");
        }
    }
}