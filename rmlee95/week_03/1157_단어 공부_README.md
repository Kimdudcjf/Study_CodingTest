[👉 1157번: 단어 공부](https://www.acmicpc.net/problem/1157)

## 문제 정의
<details><summary> 문제
</summary>

#### 알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오. 단, 대문자와 소문자를 구분하지 않는다.
</details>

`input`
- 첫째 줄에 알파벳 대소문자로 이루어진 단어가 주어진다. 주어지는 단어의 길이는 1,000,000을 넘지 않는다.

`output`
- 첫째 줄에 이 단어에서 가장 많이 사용된 알파벳을 대문자로 출력한다. 단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력한다.

## 코드

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        // 알파벳 별 개수 카운팅을 위해 배열 생성
        int[] alphabet = new int[26];

        for (int i = 0; i <str.length(); i++) {
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                alphabet[str.charAt(i) - 'A']++;
            } else {
                alphabet[str.charAt(i) - 'a']++;
            }
        }

        int max = -1;
        char result = ' ';

        for (int i = 0; i < alphabet.length; i++) {
            if (alphabet[i] > max) {
                max = alphabet[i];
                result = (char) (i + 65);
            } else if (alphabet[i] == max) {
                result = '?';
            }
        }
        System.out.println(result);
    }
}
```

## 메모
초기 max 값으로 alphabet 배열의 0번째 값 이나 0으로 초기화했을 때는 계속해서 틀렸다. 
