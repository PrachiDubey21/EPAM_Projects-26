import java.util.*;

public class MaximumLearningPoints {

    static int findMaximumPoints(int[] points) {

        int n = points.length;
        if (n == 1) {
            return points[0];
        }

        int[] dp = new int[n];
        dp[0] = points[0];
        dp[1] = Math.max(points[0], points[1]);

        for (int i = 2; i < n; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + points[i]);
        }

        return dp[n - 1];
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] points = new int[N];

        for (int i = 0; i < N; i++) {
            points[i] = sc.nextInt();
        }

        int answer = findMaximumPoints(points);
        System.out.println(answer);
        
    }
}