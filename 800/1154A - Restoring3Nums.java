import java.util.Arrays;
import java.util.Scanner;

class Restoring3Nums {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[4];

        for (int i = 0; i < 4; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int sum = arr[3];

        System.out.println((sum - arr[2]) + " " +
                           (sum - arr[1]) + " " +
                           (sum - arr[0]));

        sc.close();
    }
}