package week_02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int cnt = 0;

        for (int i = 1; i <= 8; i++) {
            String[] inputStr = sc.nextLine().split(""); // 입력받은 글자를 한글자씩 분리
            for (int j = 1; j <= 8; j++) {
                if ((i % 2 != 0) && (j % 2 != 0) && (inputStr[j - 1].equals("F"))) { // i,j 가 홀수이면서 F가 있으면 참
                    cnt++;
                }
                if ((i % 2 == 0) && (j % 2 == 0) && (inputStr[j - 1].equals("F"))) { // i,j 가 짝수이면서 F가 있으면 참
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}
