import java.util.*;
class AntonNDanik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String games = sc.next();

        int AntonWins = 0;
        int DanikWins = 0;

        for(int i = 0; i < n; i++) {
            if(games.charAt(i) == 'A') {
                AntonWins++;
            } else if(games.charAt(i) == 'D') {
                DanikWins++;
            }
        }
        if(AntonWins > DanikWins) {
            System.out.println("Anton");
        } else if(DanikWins > AntonWins) {
            System.out.println("Danik");
        } else {
            System.out.println("Friendship");
        }
    }
}