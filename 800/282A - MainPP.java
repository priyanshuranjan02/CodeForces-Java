import java.util.Scanner;
class MainPP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 0;
        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            String statement = sc.next();

            if(statement.contains("++")) {
                x++;
            } else {
                x--;
            }
        }
        System.out.println(x);
    }
}