import java.util.*;

public class Solution {

    static void miniMaxSum(int[] arr) {
        Arrays.sort(arr);
        Long min = 0L;
        Long max = 0L;
        for (int i = 0; i < arr.length; i++) {
            switch(i) {
                case 0:
                    min += arr[i];
                    break;
                case 4:
                    max += arr[i];
                    break;
                default:
                    min += arr[i];
                    max += arr[i];
            }
        }
        System.out.println(min.toString() + " " + max.toString());
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
}
