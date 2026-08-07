import java.util.*;

public class EmergencyRouteValidation {

    static ArrayList<Integer>[] graph;
    static int[] distance;

    static void bfs(int start) {

        Queue<Integer> queue = new LinkedList<>();

        queue.add(start);
        distance[start] = 0;

        while (!queue.isEmpty()) {

            int current = queue.poll();

            for (int next : graph[current]) {

                if (distance[next] == -1) {
                    distance[next] = distance[current] + 1;
                    queue.add(next);
                }
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int D = sc.nextInt();

        graph = new ArrayList[N + 1];
        distance = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<>();
            distance[i] = -1;
        }

        for (int i = 0; i < M; i++) {

            int u = sc.nextInt();
            int v = sc.nextInt();

            graph[u].add(v);
            graph[v].add(u);
        }

        bfs(1);

        int count = 0;

        for (int i = 1; i <= N; i++) {
            if (distance[i] <= D) {
                count++;
            }
        }

        System.out.println(count);
    }
}