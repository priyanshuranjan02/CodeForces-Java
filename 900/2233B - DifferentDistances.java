import java.util.Scanner;

class DifferentDistances {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();

            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = i + 1;
            }

            StringBuilder ans = new StringBuilder();

            for (int round = 1; round <= 4; round++) {

                for (int num : arr) {
                    ans.append(num).append(" ");
                }

                if (round < 4) {
                    rotateLeft(arr, round);
                }
            }

            System.out.println(ans);
        }

        sc.close();
    }

    public static void rotateLeft(int[] arr, int k) {

        int n = arr.length;
        k %= n;

        int[] temp = new int[n];

        for (int i = 0; i < n; i++) {
            temp[i] = arr[(i + k) % n];
        }

        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }
    }
}