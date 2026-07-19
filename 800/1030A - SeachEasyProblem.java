import java.util.*;
class SeachEasyProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean hard = false;

        while(n-- > 0) {
            if(sc.nextInt() == 1) {
                hard = true;
            } 
        }
        System.out.println(hard ? "HARD" : "EASY");
    }
}
