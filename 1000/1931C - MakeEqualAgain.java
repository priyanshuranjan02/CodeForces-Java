import java.util.*;

class MakeEqualAgain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int left = 0;

            while (left < n && arr[left] == arr[0]) {
                left++;
            }

            int right = 0;

            while (right < n && arr[n - 1 - right] == arr[n - 1]) {
                right++;
            }

            int answer;

            if (arr[0] == arr[n - 1]) {
                answer = n - left - right;
            } else {
                answer = n - Math.max(left, right);
            }
            answer = Math.max(0, answer);
            System.out.println(answer);
        }
    }
}