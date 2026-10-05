import java.util.*;
import java.io.*;

class HarderProblem {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = Integer.parseInt(st.nextToken());

            boolean[] used = new boolean[n + 1];
            int[] b = new int[n];

            for (int i = 0; i < n; i++) {
                if (!used[a[i]]) {
                    b[i] = a[i];
                    used[a[i]] = true;
                }
            }

            int ptr = 1;
            for (int i = 0; i < n; i++) {
                if (b[i] == 0) {
                    while (used[ptr]) ptr++;
                    b[i] = ptr;
                    used[ptr] = true;
                }
            }

            for (int i = 0; i < n; i++) {
                sb.append(b[i]);
                sb.append(i == n - 1 ? '\n' : ' ');
            }
        }

        System.out.print(sb);
    }
}