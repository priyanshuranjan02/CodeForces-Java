import java.util.*;

class VasyaTheHipster {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int fashionable = Math.min(a, b);
        int ordinary = Math.abs(a - b) / 2;

        System.out.println(fashionable + " " + ordinary);
    }
}