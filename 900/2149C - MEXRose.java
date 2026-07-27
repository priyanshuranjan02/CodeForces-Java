import java.util.*;

class MEXRose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            int[] freq = new int[n + 1];

            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                freq[x]++;
            }
            
            int missing = 0;

            for (int i = 0; i < k; i++) {
                if (freq[i] == 0) {
                    missing++;
                }
            }
            System.out.println(Math.max(missing, freq[k]));
        }
    }
}