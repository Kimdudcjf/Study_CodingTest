## 🌵 문제 정보
Hello World <br>
[🚗 1934](https://www.acmicpc.net/problem/1934)

## 🌵 문제 정의
두 자연수 A와 B에 대해서, A의 배수이면서 B의 배수인 자연수를 A와 B의 공배수라고 한다. 이런 공배수 중에서 가장 작은 수를 최소공배수라고 한다. 예를 들어, 6과 15의 공배수는 30, 60, 90등이 있으며, 최소 공배수는 30이다.

두 자연수 A와 B가 주어졌을 때, A와 B의 최소공배수를 구하는 프로그램을 작성하시오.
`input` 첫째 줄에 테스트 케이스의 개수 T(1 ≤ T ≤ 1,000)가 주어진다. 둘째 줄부터 T개의 줄에 걸쳐서 A와 B가 주어진다. (1 ≤ A, B ≤ 45,000)<br>
- 3
  1 45000
  6 10
  13 17
`output` 첫째 줄부터 T개의 줄에 A와 B의 최소공배수를 입력받은 순서대로 한 줄에 하나씩 출력한다.<br>
- 45000
  30
  221

## 🌵 알고리즘 설계
최대 공약수를 이용한 최소 공배수 구하는 수학공식을 사용하여 문제를 해결
```java
import java.util.Scanner;

class day4 {
  //최대 공약수
  public static int gcd(int a, int b) {
    while (b != 0) {
      int temp = b;
      b = a % b;
      a = temp;
    }
    return a;
  }
  //최소 공배수
  public static int lcm(int a, int b) {
    return a * (b / gcd(a, b));
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt();

    for (int i = 0; i < T; i++) {
      int A = sc.nextInt();
      int B = sc.nextInt();

      System.out.println(lcm(A, B));
    }

    sc.close();
  }
}

```