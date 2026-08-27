import java.util.*;

class BalancedShuffle {
    static class Node {
        int balance;
        int position;
        char ch;

        Node(int balance, int position, char ch) {
            this.balance = balance;
            this.position = position;
            this.ch = ch;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int n = s.length();

        Node[] nodes = new Node[n];

        int balance = 0;

        for (int i = 0; i < n; i++) {
            nodes[i] = new Node(balance, i, s.charAt(i));

            if (s.charAt(i) == '(') {
                balance++;
            } else {
                balance--;
            }
        }

        Arrays.sort(nodes, (a, b) -> {
            if (a.balance != b.balance) {
                return Integer.compare(a.balance, b.balance);
            }
            return Integer.compare(b.position, a.position);
        });

        StringBuilder ans = new StringBuilder();

        for (Node node : nodes) {
            ans.append(node.ch);
        }

        System.out.println(ans);
    }
}