import java.util.*;

class HypercarpAndTheControlPanel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int TestsNumT = sc.nextInt();

        while (TestsNumT-- > 0) {
            int n = sc.nextInt();

            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            ArrayList<int[]> runs = new ArrayList<>();

            for (int i = 0; i < n; ) {
                int j = i;

                while (j < n && a[j] == a[i]) {
                    j++;
                }

                runs.add(new int[]{a[i], j - i});
                i = j;
            }

            int m = runs.size();
            int answer = m;

            for (int i = 0; i < m - 1; i++) {
                if (runs.get(i)[1] > 1 && runs.get(i + 1)[1] > 1) {
                    answer = m + 2;
                    break;
                }
            }

            if (answer == m) {
                for (int i = 0; i < m; i++) {
                    int value = runs.get(i)[0];

                    if (i < m - 1 &&
                        runs.get(i)[1] > 1 &&
                        (i + 2 >= m || runs.get(i + 2)[0] != value)) {

                        answer = m + 1;
                        break;
                    }

                    if (i > 0 &&
                        runs.get(i)[1] > 1 &&
                        (i - 2 < 0 || runs.get(i - 2)[0] != value)) {

                        answer = m + 1;
                        break;
                    }
                }
            }

            System.out.println(answer);
        }
    }
}