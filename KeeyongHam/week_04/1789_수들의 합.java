package week_04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long S = sc.nextLong();
        long sum = 0;
        long cnt = 0;

        while (S >= sum) {
            cnt++;
            sum += cnt;
        }
        System.out.println(cnt - 1);
    }
}
