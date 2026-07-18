import java.util.*;

class NewYearNHurry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int available = 240 - k;
        int count = 0;

        for (int i = 1; i <= n; i++) {
            int required = 5 * i;

            if (available >= required) {
                available -= required;
                count++;
            } else {
                break;
            }
        }
        System.out.println(count);
    }
}