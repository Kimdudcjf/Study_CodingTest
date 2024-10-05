package week_02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cnt = sc.nextInt();
        sc.nextLine();

        List<String> result = new ArrayList<>(); //입력 받은 값을 저장할 list 생성

        IntStream.range(0, cnt) //cnt만큼 반복하고, list에 중복된 값이 있으면 저장하지 않는다
                .forEach(i -> {
                    String string = sc.nextLine();
                    if (!result.contains(string)) {
                        result.add(string);
                    }
                });

        result.sort((o1, o2) -> {
            // 길이가 같으면 사전 순 아니면 길이 순으로 정렬
            if (o1.length() == o2.length()) {
                return o1.compareTo(o2);
            } else {
                return Integer.compare(o1.length(), o2.length());
            }
        });

        //결과값 출력
        for (String string : result) {
            System.out.println(string);
        }
    }
}
