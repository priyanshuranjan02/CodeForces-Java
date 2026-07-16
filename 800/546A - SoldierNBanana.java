import java.util.*;
class SoldierNBanana {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int w = sc.nextInt();

        int totalCost = k * w * (w + 1) / 2;

        int moneyNeeded = Math.max(0, totalCost - n);
        System.out.println(moneyNeeded);
    }
}