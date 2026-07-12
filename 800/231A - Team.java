import java.util.*;
class Team {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;

        for(int i = 0; i < n; i++) {
            int petya = sc.nextInt();
            int vasya = sc.nextInt();
            int tonya = sc.nextInt();

            int sureCount = petya + vasya + tonya;
            if(sureCount >= 2) {
                count++;
            }
        }
        System.out.println(count);
    }
}