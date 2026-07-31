import java.util.*;
import java.io.*;

class PerpendicularSegments {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int X = Integer.parseInt(st.nextToken());
            int Y = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken()); // read but unused

            int M = Math.min(X, Y);

            sb.append(0).append(' ').append(0).append(' ')
              .append(M).append(' ').append(M).append('\n');
            sb.append(0).append(' ').append(M).append(' ')
              .append(M).append(' ').append(0).append('\n');
        }

        System.out.print(sb);
    }
}