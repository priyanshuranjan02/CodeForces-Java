import java.util.*;
class HelpfulMath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        StringBuilder numbers = new StringBuilder();
        for(int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if(ch == '1' || ch == '2' || ch == '3') {
                numbers.append(ch);
            }
        } 
        char[] numArray = numbers.toString().toCharArray();
        Arrays.sort(numArray);

        StringBuilder result = new StringBuilder();
        for(int i = 0; i < numArray.length; i++) {
            if(i > 0) {
                result.append("+");
            }
            result.append(numArray[i]);
        }
        System.out.println(result.toString());
    }
}