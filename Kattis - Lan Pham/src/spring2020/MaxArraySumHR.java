package spring2020;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MaxArraySumHR {

    // Complete the maxSubsetSum function below.
    static int maxSubsetSum(int[] arr) {
        int[] memo = new int[arr.length * arr.length];
        memo[0] = arr[0];
        memo[1] = arr[1];
        helper(arr, memo, 2);
        int max = memo[0];
        for (int index =0; index < memo.length; index++) {
            if (memo[index] > max){
                max = memo[index];
            }
        }

        return max;

    }

    static int[] helper(int[] arr, int[] memo, int count) {
        if (count == arr.length){
            return memo;
        }
        else {
            memo[count] = arr[count] + memo[count-2];
            helper(arr, memo, count+1);
        }
        return memo;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int res = maxSubsetSum(arr);

        bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
