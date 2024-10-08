package week_03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int cnt = 0;

        for (int i = 1; i <= num; i++) {
            int sum = 0;
            for (int j = i; j <= num; j++) {

                sum += j;

                if (sum == num) {
                    cnt++;
                    break;
                }

                if (sum > num) {
                    break;
                }
            }
        }
        System.out.println(cnt);
    }
}