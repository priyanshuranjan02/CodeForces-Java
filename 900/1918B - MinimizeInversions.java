import java.util.*;
import java.io.*;

class MinimizeInversions {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            int[] a = new int[n + 1];
            int[] b = new int[n + 1];

            StringTokenizer stA = new StringTokenizer(br.readLine());
            for (int i = 1; i <= n; i++) a[i] = Integer.parseInt(stA.nextToken());

            StringTokenizer stB = new StringTokenizer(br.readLine());
            for (int i = 1; i <= n; i++) b[i] = Integer.parseInt(stB.nextToken());

            // bByA[v] = the b value paired with a-value v
            int[] bByA = new int[n + 1];
            for (int i = 1; i <= n; i++) {
                bByA[a[i]] = b[i];
            }

            // a' is just 1..n (fully sorted)
            for (int i = 1; i <= n; i++) {
                sb.append(i);
                sb.append(i == n ? '\n' : ' ');
            }

            // b' is bByA[1..n]
            for (int i = 1; i <= n; i++) {
                sb.append(bByA[i]);
                sb.append(i == n ? '\n' : ' ');
            }
        }

        System.out.print(sb);
    }
}