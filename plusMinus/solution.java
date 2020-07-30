import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        double total = arr.length;
        double zeroCount = 0;
        double plusCount = 0;
        for (int el : arr){
            if(el == 0){
                zeroCount++;
            } else if(el > 0) {
                plusCount++;
            }
        }
        double zeroProp = zeroCount / total;
        double plusProp = plusCount / total;
        double minusProp = 1.0d - zeroProp - plusProp;
        System.out.printf("%.6f %n", plusProp);
        System.out.printf("%.6f %n", minusProp);
        System.out.printf("%.6f %n", zeroProp);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}
