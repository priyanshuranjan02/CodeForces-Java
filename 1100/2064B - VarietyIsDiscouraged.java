import java.util.*;

class VarietyIsDiscouraged {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            int[] a = new int[n];
            int[] freq = new int[n + 1];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                freq[a[i]]++;
            }

            int bestL = -1;
            int bestR = -1;

            int currentL = -1;

            for (int i = 0; i < n; i++) {
                if (freq[a[i]] == 1) {
                    if (currentL == -1) {
                        currentL = i;
                    }
                } else {
                    if (currentL != -1) {
                        if (bestL == -1 ||
                            i - currentL > bestR - bestL + 1) {

                            bestL = currentL;
                            bestR = i - 1;
                        }

                        currentL = -1;
                    }
                }
            }

            if (currentL != -1) {
                if (bestL == -1 ||
                    n - currentL > bestR - bestL + 1) {

                    bestL = currentL;
                    bestR = n - 1;
                }
            }

            if (bestL == -1) {
                System.out.println(0);
            } else {
                System.out.println((bestL + 1) + " " + (bestR + 1));
            }
        }
    }
}