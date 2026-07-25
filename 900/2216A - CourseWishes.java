import java.util.*;

class CourseWishes {
    static int n, k;
    static int[] cap;
    static int[] level;
    static int[] cnt;
    static ArrayList<Integer> ans;

    static void move(int idx) {

        while (level[idx] <= k) {

            int cur = level[idx];
            int next = cur + 1;

            if (next <= k && cnt[next] == cap[next]) {

                for (int j = 0; j < n; j++) {
                    if (level[j] == next) {
                        move(j);
                        break;
                    }
                }
            }

            cnt[cur]--;

            if (next <= k) {
                cnt[next]++;
            }

            level[idx]++;
            ans.add(idx + 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {

            n = sc.nextInt();
            k = sc.nextInt();

            cap = new int[k + 1];
            cnt = new int[k + 1];
            level = new int[n];
            ans = new ArrayList<>();

            for (int i = 1; i <= k; i++) {
                cap[i] = sc.nextInt();
            }

            for (int i = 0; i < n; i++) {
                level[i] = sc.nextInt();
                if (level[i] <= k) {
                    cnt[level[i]]++;
                }
            }

            for (int i = 0; i < n; i++) {
                move(i);
            }

            System.out.println(ans.size());

            for (int x : ans) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}