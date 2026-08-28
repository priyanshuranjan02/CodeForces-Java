import java.io.*;
import java.util.*;

class AssemblyViaRemainders {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            String line;
            while ((line = br.readLine()) != null && line.trim().isEmpty());
            int n = Integer.parseInt(line.trim());

            StringTokenizer st = new StringTokenizer(br.readLine());
            long[] a = new long[n + 1];
            a[1] = 1000; 

            for (int i = 2; i <= n; i++) {
                int x = Integer.parseInt(st.nextToken());
                a[i] = a[i - 1] + x;
            }

            for (int i = 1; i <= n; i++) {
                sb.append(a[i]);
                sb.append(i == n ? '\n' : ' ');
            }
        }

        System.out.print(sb);
    }
}