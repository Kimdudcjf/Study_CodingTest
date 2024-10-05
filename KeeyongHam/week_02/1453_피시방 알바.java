package week_02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        List<Integer> customer = new ArrayList<>();

        int cnt = 0;

        //N만큼 반복한다
        for (int i = 0; i < N; i++) {
            int inputNum = sc.nextInt();

            // 입력값이 list에 있으면 cnt 증가, 없으면 list에 추가
            if (customer.contains(inputNum)) {
                cnt++;
            } else {
                customer.add(inputNum);
            }
        }
        System.out.println(cnt);
    }
}