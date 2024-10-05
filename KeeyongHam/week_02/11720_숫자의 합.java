package week_02;

import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        String inputStr = sc.next();

        int result = 0;

        int[] intArr = Stream.of(inputStr.split(""))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int i = 0; i < cnt; i++) {
            result += intArr[i];
        }

        System.out.println(result);
    }
}