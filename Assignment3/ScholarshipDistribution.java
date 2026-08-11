import java.util.*;

public class ScholarshipDistribution {

    static int findMaxStudents(int[] scholarship, long budget) {

        Arrays.sort(scholarship);

        int count = 0;
        long total = 0;

        for (int amount : scholarship) {

            if (total + amount <= budget) {
                total += amount;
                count++;
            } else {
                break;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        long B = sc.nextLong();

        int[] scholarship = new int[N];

        for (int i = 0; i < N; i++) {
            scholarship[i] = sc.nextInt();
        }

        int answer = findMaximumStudents(scholarship, B);
        System.out.println(answer);

    }
}