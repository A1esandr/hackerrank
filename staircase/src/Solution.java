import java.util.*;

public class Solution {

    // Complete the staircase function below.
    static void staircase(int n) {
        for(int i = 1; i <= n; i++) {
            StringBuilder sb = new StringBuilder();
            while (sb.length() < n - i) {
                sb.append(' ');
            }
            while (sb.length() < n) {
                sb.append('#');
            }
            System.out.println(sb.toString());
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        staircase(n);

        scanner.close();
    }
}
