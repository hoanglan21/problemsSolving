package spring2020;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class TwodArrayHR {

    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {
        int[] sum = new int[64];
        int star =0; 
        while (star < sum.length) {
        for (int index =0; index < 4; index++){
            for (int j=0; j<4; j++) {
                sum[star] = arr[index][j] + arr[index+1][j] + arr[index+2][j]
                + arr[index+1][j+1] + arr[index][j+2] + 
                arr[index+1][j+2] + arr[index+2][j+2];
                star++;
            }
        }
        }
        int max = sum[0];
        for (int index =1; index< sum.length; index++){
            if (sum[index] > max) {
                max = sum[index];
            }
        }

        return max;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = hourglassSum(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

