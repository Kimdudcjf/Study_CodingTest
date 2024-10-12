package week_02;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        sc.nextLine();

        //입력받은 수 만큼 반복하고, 입력받은 문자를 list로 반환
        List<String> inputArr = IntStream.range(0, cnt)
                .mapToObj(i -> sc.nextLine())
                .collect(Collectors.toList());

        //첫번째 문자열을 문자 하나하나 조깨서 문자열로 반환
        List<String> standardStrings = Arrays.stream(inputArr.get(0).split(""))
                .collect(Collectors.toList());

        StringBuilder builder = new StringBuilder();

        // 문자열 길이 만큼 반복
        for (int i = 0; i < standardStrings.size(); i++) {

            boolean isSame = true;
            String standardStr = standardStrings.get(i);

            //입력받은 문자열 만큼 반벅
            for (int j = 1; j < inputArr.size(); j++) {

                //비교할 문자열을 문자 단위로 쪼게서 반환
                String comparisonTarget = String.valueOf(inputArr.get(j).charAt(i));

                // 같은 값이 아니면 거짓을 반환
                if (!standardStr.equals(comparisonTarget)) {
                    isSame = false;
                }
            }

            // isSame이 참이면 해당 글자를 아니면 ?를 결과값에 추가
            if (isSame) {
                builder.append(standardStr);
            } else {
                builder.append("?");
            }
        }
        System.out.println(builder);
    }
}
