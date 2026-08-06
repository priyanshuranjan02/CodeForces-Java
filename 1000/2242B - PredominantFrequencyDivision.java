import java.util.Scanner;

class PredominantFrequencyDivision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();

            int[] pref1 = new int[n];
            int[] pref2 = new int[n];

            int b1 = 0;
            int b2 = 0;

            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();

                if (x == 1)
                    b1++;
                else
                    b1--;

                if (x == 3)
                    b2--;
                else
                    b2++;

                pref1[i] = b1;
                pref2[i] = b2;
            }

            int NEG = -1000000000;
            int[] sufMax = new int[n];

            sufMax[n - 1] = NEG;

            if (n >= 2)
                sufMax[n - 2] = pref2[n - 2];

            for (int i = n - 3; i >= 0; i--) {
                sufMax[i] = Math.max(pref2[i], sufMax[i + 1]);
            }

            boolean ok = false;

            for (int i = 0; i <= n - 3; i++) {
                if (pref1[i] >= 0 && sufMax[i + 1] >= pref2[i]) {
                    ok = true;
                    break;
                }
            }

            System.out.println(ok ? "YES" : "NO");
        }
    }
}