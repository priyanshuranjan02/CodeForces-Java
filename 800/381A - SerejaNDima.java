import java.util.*;

class SerejaNDima {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int left = 0;
        int right = n - 1;

        int sereja = 0;
        int dima = 0;
        
        boolean serejaTurn = true;

        while (left <= right) {
            int picked;

            if (arr[left] > arr[right]) {
                picked = arr[left];
                left++;
            } else {
                picked = arr[right];
                right--;
            }

            if (serejaTurn) {
                sereja += picked;
            } else {
                dima += picked;
            }
            serejaTurn = !serejaTurn;
        }
        System.out.println(sereja + " " + dima);
    }    
}