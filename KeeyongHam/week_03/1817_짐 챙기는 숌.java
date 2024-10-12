package week_03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();


        if (N == 0) {
            System.out.println(0);
            return;
        }

        int cnt = 1;
        int sum = 0;

        for (int i = 0; i < N; i++) {
            int weight = sc.nextInt();

            if (sum + weight <= M) {
                sum += weight;
            } else {
                cnt++;
                sum = weight;
            }
        }
        System.out.println(cnt);
    }
}
