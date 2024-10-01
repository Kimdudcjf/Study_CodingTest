## 🌵 문제 정보
Hello World <br>
[🚗 1037](https://www.acmicpc.net/problem/1037)

## 🌵 문제 정의
`input` <br>
- 6
  3 4 2 12 6 8

`output` <br>
- 24

## 🌵 알고리즘 설계
기본적으로 약수들의 집합에서 1과 자기자신이 없어진것이 진짜 약수다
N 값을 구하기위해서 약수들중 최소값과 최대값을 곱하면 N을 구할수있다.
문자열 출력
```java

import java.util.Scanner;

class day2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("a 값 입력");
    int a = sc.nextInt();

    System.out.println("b 값 입력");
    int b = sc.nextInt();

    int total = a * b;

    int last = total % 10;

    if (last == 0) {
      last = 10;
    }

    System.out.println(last);
  }
}
```