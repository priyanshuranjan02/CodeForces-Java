import java.util.*;
import java.io.*;

class BeautifulXOR {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            String line;
            while ((line = br.readLine()) != null && line.trim().isEmpty());
            StringTokenizer st = new StringTokenizer(line);
            long a = Long.parseLong(st.nextToken());
            long b = Long.parseLong(st.nextToken());

            int msbA = 63 - Long.numberOfLeadingZeros(a);
            int msbB = 63 - Long.numberOfLeadingZeros(b);

            if (msbB > msbA) {
                sb.append(-1).append("\n");
                continue;
            }

            if (a == b) {
                sb.append(0).append("\n").append("\n");
                continue;
            }

            List<Long> ops = new ArrayList<>();
            long cur = a;

            // Step 1: set all bits up to msbA to 1
            for (int i = 0; i <= msbA; i++) {
                long bit = 1L << i;
                if ((cur & bit) == 0 && bit <= cur) {
                    ops.add(bit);
                    cur |= bit;
                }
            }

            // Step 2: turn off bits that should be 0 in b
            long x2 = cur ^ b;
            if (x2 != 0) {
                ops.add(x2);
            }

            sb.append(ops.size()).append("\n");
            for (int i = 0; i < ops.size(); i++) {
                sb.append(ops.get(i));
                if (i < ops.size() - 1) sb.append(" ");
            }
            sb.append("\n");
        }

        System.out.print(sb);
    }
}