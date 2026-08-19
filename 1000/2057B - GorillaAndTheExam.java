import java.util.*;

class GorillaAndTheExam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            HashMap<Integer, Integer> freq = new HashMap<>();

            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();

                freq.put(x, freq.getOrDefault(x, 0) + 1);
            }

            int distinct = freq.size();

            if (distinct == 1) {
                System.out.println(1);
                continue;
            }

            ArrayList<Integer> counts = new ArrayList<>(freq.values());
            Collections.sort(counts);

            for (int count : counts) {
                if (k >= count && distinct > 1) {
                    k -= count;
                    distinct--;
                } else {
                    break;
                }
            }
            System.out.println(distinct);
        }
    }
}