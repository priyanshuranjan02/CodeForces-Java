import java.util.*;

class Heapify1 {
    static ArrayList<Integer>[] graph;
    static boolean[] visited;
    static int[] a;

    static ArrayList<Integer> nodes;
    static ArrayList<Integer> values;

    static void dfs(int u) {
        visited[u] = true;
        nodes.add(u);
        values.add(a[u]);

        for (int v : graph[u]) {
            if (!visited[v]) {
                dfs(v);
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {

            int n = sc.nextInt();

            a = new int[n + 1];

            for (int i = 1; i <= n; i++) {
                a[i] = sc.nextInt();
            }

            graph = new ArrayList[n + 1];

            for (int i = 1; i <= n; i++) {
                graph[i] = new ArrayList<>();
            }

            for (int i = 1; i * 2 <= n; i++) {
                graph[i].add(2 * i);
                graph[2 * i].add(i);
            }

            visited = new boolean[n + 1];

            boolean ok = true;

            for (int i = 1; i <= n && ok; i++) {

                if (!visited[i]) {

                    nodes = new ArrayList<>();
                    values = new ArrayList<>();

                    dfs(i);

                    Collections.sort(nodes);
                    Collections.sort(values);

                    for (int j = 0; j < nodes.size(); j++) {
                        if (!nodes.get(j).equals(values.get(j))) {
                            ok = false;
                            break;
                        }
                    }
                }
            }

            System.out.println(ok ? "YES" : "NO");
        }

        sc.close();
    }
}