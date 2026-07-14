import java.util.*;
import java.io.*;

class Games {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] home = new int[n];
        int[] away = new int[n];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            home[i] = Integer.parseInt(st.nextToken());
            away[i] = Integer.parseInt(st.nextToken());
        }

        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (home[i] == away[j]) {
                    count++;
                }
            }
        }
        System.out.println(count);

    }
}