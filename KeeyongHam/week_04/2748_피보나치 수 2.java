package week_04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        long[] intArr = new long[N + 1];
        intArr[0] = 0;
        if (N > 0) {
            intArr[1] = 1;
        }
        for (int i = 2; i <= N; i++) {

            long firstNum = intArr[i - 2];
            long secondNum = intArr[i - 1];

            long resultNum = firstNum + secondNum;

            intArr[i] = resultNum;

        }
        System.out.println(intArr[N]);
    }
}