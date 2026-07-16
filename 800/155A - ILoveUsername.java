import java.util.*;

class ILoveUsername {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int firstScore = sc.nextInt();
        int maxScore = firstScore;
        int minScore = firstScore;

        int count = 0;

        for (int i = 1; i < n; i++) {
            int score = sc.nextInt();
            
            if (score > maxScore) {
                count++;
                maxScore = score;
            } else if (score < minScore) {
                count++;
                minScore = score;
            }
        }
        System.out.println(count);
    }
}