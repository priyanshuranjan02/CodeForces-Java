import java.util.*;

class HitLottery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] notes = {100, 20, 10, 5, 1};
        int count = 0;

        for (int note : notes) {
            count += n / note;
            n %= note;
        }

        System.out.println(count);
    }
}