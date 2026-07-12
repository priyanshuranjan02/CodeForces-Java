import java.util.*;
class QueueSchool {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        char[] queue = sc.next().toCharArray();

        for(int time = 0; time < t; time++) {
            for(int i = 0; i < n - 1; i++) {
                if(queue[i] == 'B' && queue[i + 1] == 'G') {
                    queue[i] = 'G';
                    queue[i + 1] = 'B';
                    i++;
                }
            }
        }
        System.out.println(new String(queue));
    }
}