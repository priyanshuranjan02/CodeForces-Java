import java.util.*;
import java.io.*;

class Array {
    static int[] bit;
    static int m;

    static void update(int pos) {
        for (++pos; pos <= m; pos += pos & (-pos)) bit[pos]++;
    }

    static int query(int pos) {
        int s = 0;
        for (++pos; pos > 0; pos -= pos & (-pos)) s += bit[pos];
        return s;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StreamTokenizer st = new StreamTokenizer(br);
        st.nextToken();
        int t = (int) st.nval;
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            st.nextToken();
            int n = (int) st.nval;
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                st.nextToken();
                a[i] = (long) st.nval;
            }

            long[] sortedA = a.clone();
            Arrays.sort(sortedA);
            int uniqueCount = 0;
            for (int i = 0; i < n; i++) {
                if (i == 0 || sortedA[i] != sortedA[i - 1]) {
                    sortedA[uniqueCount++] = sortedA[i];
                }
            }
            m = uniqueCount;
            bit = new int[m + 1];

            int[] ans = new int[n];
            int total = 0;
            for (int i = n - 1; i >= 0; i--) {
                int rank = lowerBound(sortedA, uniqueCount, a[i]);
                int countLess = query(rank - 1);
                int countLessOrEqual = query(rank);
                int countGreater = total - countLessOrEqual;
                ans[i] = Math.max(countLess, countGreater);
                update(rank);
                total++;
            }

            for (int i = 0; i < n; i++) {
                sb.append(ans[i]);
                sb.append(i == n - 1 ? '\n' : ' ');
            }
        }

        System.out.print(sb);
    }

    static int lowerBound(long[] arr, int len, long val) {
        int lo = 0, hi = len;
        while (lo < hi) {
            int mid = (lo + hi) >>> 1;
            if (arr[mid] < val) lo = mid + 1;
            else hi = mid;
        }
        return lo;
    }
}