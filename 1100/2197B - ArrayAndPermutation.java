import java.util.*;

class ArrayAndPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            int[] pos = new int[n + 1];

            for (int i = 0; i < n; i++) {
                int value = sc.nextInt();
                pos[value] = i;
            }

            int last = -1;
            boolean possible = true;

            for (int i = 0; i < n; i++) {
                int value = sc.nextInt();

                if (pos[value] < last) {
                    possible = false;
                }

                last = pos[value];
            }

            System.out.println(possible ? "YES" : "NO");
        }
    }
}