package week_03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cnt = sc.nextInt();

        List<Integer> result = new ArrayList<>();

        //cnt 만큼 반복
        for (int i = 0; i < cnt; i++) {
            List<Integer> numbers = new ArrayList<>();

            //숫자 5개를 입력받음
            for (int j = 0; j < 5; j++) {
                numbers.add(sc.nextInt());
            }

            //최대값을 저장
            int maxSum = 0;

            //모든 경우의수 숫자를 더함
            for (int j = 0; j < 5; j++) {
                for (int k = j + 1; k < 5; k++) {
                    for (int l = k + 1; l < 5; l++) {
                        int sum = (numbers.get(j) + numbers.get(k) + numbers.get(l)) % 10; // 숫자의 합을 중 1의 자리 숫자를 sum에 저장
                        maxSum = Math.max(maxSum, sum); // maxSum 값과 sum 값을 비교 후 큰 값을 다시 MaxSum에 저장
                    }
                }
            }
            result.add(maxSum); //모든 경우의 수 중에 가장 큰 값을 저장
        }
        Integer maxResult = Collections.max(result); //result에 저장되어있는 값 중 가장 큰 값을 찾아옴

        // 1씩 감소하며 순회
        for (int i = result.size() - 1; i >= 0; i--) {

            //가장 큰 값과 result 저장되어있는 값이 같으면 해당 인덱스를 출력
            if (result.get(i) == maxResult) {
                System.out.println(i + 1);
                break;
            }
        }
    }
}
