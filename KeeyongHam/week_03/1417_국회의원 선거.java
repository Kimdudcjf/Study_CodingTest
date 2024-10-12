package week_03;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int dasomNum = sc.nextInt();

        int result = 0;

        List<Integer> voteNumbers = IntStream.range(0, N - 1)
                .mapToObj(i -> sc.nextInt())
                .collect(Collectors.toList());

        voteNumbers.sort(Collections.reverseOrder()); // list를 크기 순서대로 정렬

        if (voteNumbers.size() > 0) {
            while (dasomNum <= voteNumbers.get(0)) { // 다솜의 숫자가 voteNumbers의 가장 큰 수보다 작거나 같으면 반복
                voteNumbers.set(0, voteNumbers.get(0) - 1); // 가장 큰 수를 -1 하고 다시 저장
                dasomNum++; // 다솜의 표를 1 증가
                result++; // 반복 횟수 증가
                voteNumbers.sort(Collections.reverseOrder()); // list를 크기 순서대로 정렬
            }
        }

        System.out.println(result);
    }
}
