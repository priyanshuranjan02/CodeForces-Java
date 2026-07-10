import java.util.*;
class Watermelon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();

        if(w % 2 == 0 && w >= 4) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
