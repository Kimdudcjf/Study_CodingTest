## 🌵 문제 정보
그대로 출력하기 <br>
[🚗 11718](https://www.acmicpc.net/problem/11718)

## 🌵 문제 정의
입력 받은 대로 출력하는 프로그램을 작성하시오.
`input`  입력이 주어진다. 입력은 최대 100줄로 이루어져 있고, 알파벳 소문자, 대문자, 공백, 숫자로만 이루어져 있다. 각 줄은 100글자를 넘지 않으며, 빈 줄은 주어지지 않는다. 또, 각 줄은 공백으로 시작하지 않고, 공백으로 끝나지 않는다.<br>
- Hello
  Baekjoon
  Online Judge
`output` 입력받은 그대로 출력한다.<br>
- Hello
  Baekjoon
  Online Judge

## 🌵 알고리즘 설계
입력을 끝마칠때까지 입력을받아 그대로 출력.
```java

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    StringBuilder sb = new StringBuilder();

    while (scanner.hasNextLine()) {
      String line = scanner.nextLine();
      sb.append(line).append("\n");
    }

    System.out.print(sb.toString());
    scanner.close();
  }
}

```