import java.util.*;

class GoodTimesGoodTimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            long x = sc.nextLong();
            long power = 1;

            while (x > 0) {
                power *= 10;
                x /= 10;
            }

            System.out.println(power + 1);
        }
    }
}