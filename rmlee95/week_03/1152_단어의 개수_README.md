[👉 1157번: 단어의 개수](https://www.acmicpc.net/problem/1152)

## 문제 정의
<details><summary> 문제
</summary>

#### 영어 대소문자와 공백으로 이루어진 문자열이 주어진다. 이 문자열에는 몇 개의 단어가 있을까? 이를 구하는 프로그램을 작성하시오. 
단, 한 단어가 여러 번 등장하면 등장한 횟수만큼 모두 세어야 한다.
</details>

`input`
- 첫 줄에 영어 대소문자와 공백으로 이루어진 문자열이 주어진다. 이 문자열의 길이는 1,000,000을 넘지 않는다.
- 단어는 공백 한 개로 구분되며, 공백이 연속해서 나오는 경우는 없다. 또한 문자열은 공백으로 시작하거나 끝날 수 있다.

`output`
- 첫째 줄에 단어의 개수를 출력한다.

## 코드

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        // 입력으로 공백만 입력될 경우를 고려
        if (str.equals(" ")) {
            System.out.println(0);
        } else {
            // 일력받은 문자열 앞뒤 공백제거
            str = str.trim();

            // split 매서드 활용해서 배열에 담기
            String[] words = str.split(" ");

            // 배열의 길이 출력으로 단어의 개수 출력
            System.out.println(words.length);
        }
    }
}
```

## 메모
공백만 입력 받았을 경우를 고려하지 못했다........