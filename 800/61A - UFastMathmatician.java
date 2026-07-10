import java.util.*;

class UFastMathmatician {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();

        StringBuilder result = new StringBuilder();

        for(int i = 0; i < a.length(); i++) {
            result.append(a.charAt(i) == b.charAt(i) ? '0' : '1');
        }
        
        System.out.println(result.toString());
    } 
}
