import java.io.*;
import java.util.*;

class MinAbsoSum {
    public static void main(String[] args) throws IOException {
        FastScanner fs = new FastScanner();
        int t = fs.nextInt();

        StringBuilder sb = new StringBuilder();
        while(t-- > 0) {
            int n = fs.nextInt();
            int[] a = new int[n];

            for(int i = 0; i < n; i++) {
                a[i] = fs.nextInt();
            }

            if(a[0] == -1 && a[n - 1] == -1) {
                a[0] = 0;
                a[n - 1] = 0;
            } else if(a[0] == -1) {
                a[0] = a[n - 1];
            } else if (a[n - 1] == -1) {
                a[n - 1] = a[0];
            }

            for(int i = 0; i < n; i++) {
                if(a[i] == -1) {
                    a[i] = 0;
                }
            }

            sb.append(Math.abs(a[n - 1] - a[0])).append('\n');
            for(int i = 0; i < n; i++) {
                sb.append(a[i]).append(' ');
            }
            sb.append('\n');
        }
        System.out.print(sb.toString());
    }    
    static class FastScanner {
        BufferedReader br ;
        StringTokenizer st;
        FastScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        String next() throws IOException {
            while(st == null || !st.hasMoreElements()) {
                String line = br.readLine();
                if(line == null) return null;
                st = new StringTokenizer(line);
            }
            return st.nextToken();
        }
        int nextInt() throws IOException {
            String token = next();
            return token == null ? -1 : Integer.parseInt(token);
        }
    }
}