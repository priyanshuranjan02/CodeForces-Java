import java.util.*;

class BuyAShovel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();
        int r = sc.nextInt();
        int i = 1;

        while (true) {
            int total = k * i;

            if (total % 10 == 0 || total % 10 == r) {
                System.out.println(i);
                break;
            }
            i++;
        }
    }
}