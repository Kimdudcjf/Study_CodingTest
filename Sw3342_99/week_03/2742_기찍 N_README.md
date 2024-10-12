## 🌵 문제 정보
기찍 N <br>
[🚗 2742](https://www.acmicpc.net/problem/2742)

## 🌵 문제 정의
자연수 N이 주어졌을 때, N부터 1까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.
`input` 첫째 줄에 100,000보다 작거나 같은 자연수 N이 주어진다.<br>
- 5

`output` 첫째 줄부터 N번째 줄 까지 차례대로 출력한다.<br>
- 5
  4
  3
  2
  1

## 🌵 알고리즘 설계
반복문을 이용한 단순한 N부터 1까지 출력
```java
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    for (int i = n; 0 < i; i--) {
      System.out.println(i);
    }
    sc.close();

  }
}
```