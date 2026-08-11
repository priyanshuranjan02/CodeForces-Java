import java.util.*;
import java.io.*;

class EvenModuloPair {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            long[] a = new long[n];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) a[i] = Long.parseLong(st.nextToken());

            long ansX = -1, ansY = -1;

            if (a[0] == 1) {
                ansX = a[0];
                ansY = a[1];
            } else if (n > 60) {
                // Bucket by highest set bit; track first element seen per (bucket, parity).
                long[] slot = new long[64]; // index = bucket*2 + parity
                Arrays.fill(slot, -1);
                for (int i = 0; i < n && ansX == -1; i++) {
                    long v = a[i];
                    int bucket = 63 - Long.numberOfLeadingZeros(v); // floor(log2(v))
                    int parity = (int) (v % 2);
                    int idx = bucket * 2 + parity;
                    if (slot[idx] != -1) {
                        ansX = slot[idx];
                        ansY = v;
                    } else {
                        slot[idx] = v;
                    }
                }
            } else {
                // n <= 60: brute force all pairs
                outer:
                for (int i = 0; i < n; i++) {
                    for (int j = i + 1; j < n; j++) {
                        if ((a[j] % a[i]) % 2 == 0) {
                            ansX = a[i];
                            ansY = a[j];
                            break outer;
                        }
                    }
                }
            }

            if (ansX == -1) {
                sb.append(-1).append('\n');
            } else {
                sb.append(ansX).append(' ').append(ansY).append('\n');
            }
        }

        System.out.print(sb);
    }
}