import java.util.*;
class VanyaNFence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h = sc.nextInt();

        int totalWidth = 0;

        for(int i = 0; i < n; i++) {
            int friendHeight = sc.nextInt();

            if(friendHeight > h) {
                totalWidth += 2;
            } else {
                totalWidth += 1;
            }
        }
        System.out.println(totalWidth);
    }
}
