import java.util.*;
import java.io.*;

class BattleForSurvive {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            StringTokenizer st = new StringTokenizer(br.readLine());

            long sum = 0;
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(st.nextToken());
                sum += a[i];
            }

            long answer = sum - 2 * a[n - 2];

            sb.append(answer).append('\n');
        }

        System.out.print(sb);
    }
}