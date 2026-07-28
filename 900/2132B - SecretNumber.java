import java.util.*;
class SecretNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder out = new StringBuilder();
        int t = sc.nextInt();

        while (t-- > 0) {
            long n = sc.nextLong();
            ArrayList<Long> ans = new ArrayList<>();
            long pow = 10L;

            for (int k = 1; k <= 18; k++) {
                long denom = 1L + pow; 
                if (denom > n) break;
                if (n % denom == 0) {
                    ans.add(n / denom);
                }
                pow *= 10L;
            }

            if (ans.isEmpty()) {
                out.append("0\n");
            } else {
                Collections.sort(ans);
                out.append(ans.size()).append("\n");
                for (int i = 0; i < ans.size(); i++) {
                    if (i > 0) out.append(" ");
                    out.append(ans.get(i));
                }
                out.append("\n");
            }
        }
        System.out.print(out.toString());
    }
}
