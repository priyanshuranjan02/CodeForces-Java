import java.util.*;

class DequeProcess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            int left = 0;
            int right = n - 1;

            StringBuilder answer = new StringBuilder();

            for (int i = 0; i < n; i++) {
                if (i % 2 == 0) {
                    if (a[left] < a[right]) {
                        answer.append('L');
                        left++;
                    } else {
                        answer.append('R');
                        right--;
                    }
                } else {
                    if (a[left] > a[right]) {
                        answer.append('L');
                        left++;
                    } else {
                        answer.append('R');
                        right--;
                    }
                }
            }

            System.out.println(answer);
        }
    }
}