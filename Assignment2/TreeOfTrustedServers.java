import java.util.*;

public class TreeOfTrustedServers {

    static ArrayList<Integer>[] tree;
    static int[] key;
    static int K;
    static int count = 0;

    static void dfs(int curr, int parent, int xorvalue) {

        xorvalue = xorvalue ^ key[curr];

        if (xorvalue >= K) {
            count++;
        }

        for (int child : tree[curr]) {
            if (child != parent) {
                dfs(child, curr, xorvalue);
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        K = sc.nextInt();

        key = new int[N + 1];
        tree = new ArrayList[N + 1];

        for (int i = 1; i <= N; i++) {
            tree[i] = new ArrayList<>();
        }

        for (int i = 1; i <= N; i++) {
            key[i] = sc.nextInt();
        }

        for (int i = 0; i < N - 1; i++) {

            int u = sc.nextInt();
            int v = sc.nextInt();

            tree[u].add(v);
            tree[v].add(u);
        }

        dfs(1, 0, 0);
        System.out.println(count);
    }
    
}