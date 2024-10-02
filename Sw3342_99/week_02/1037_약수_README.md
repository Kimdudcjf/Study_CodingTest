## 🌵 문제 정보
Hello World <br>
[🚗 1037](https://www.acmicpc.net/problem/1037)

## 🌵 문제 정의
양수 A가 N의 진짜 약수가 되려면, N이 A의 배수이고, A가 1과 N이 아니어야 한다. 어떤 수 N의 진짜 약수가 모두 주어질 때, N을 구하는 프로그램을 작성하시오.
`input` 첫째 줄에 N의 진짜 약수의 개수가 주어진다. 이 개수는 50보다 작거나 같은 자연수이다. 둘째 줄에는 N의 진짜 약수가 주어진다. 1,000,000보다 작거나 같고, 2보다 크거나 같은 자연수이고, 중복되지 않는다.<br>
- 2
  4 2

`output` 첫째 줄에 N을 출력한다. N은 항상 32비트 부호있는 정수로 표현할 수 있다.<br>
- 8

## 🌵 알고리즘 설계
기본적으로 약수들의 집합에서 1과 자기자신이 없어진것이 진짜 약수다
N 값을 구하기위해서 약수들중 최소값과 최대값을 곱하면 N을 구할수있다.
문자열 출력
```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int first = sc.nextInt();
        List<Integer> divisors = new ArrayList<>();
        for (int i = 0; i < first; i++) {
            divisors.add(sc.nextInt());
        }

        int min = Collections.min(divisors);
        int max = Collections.max(divisors);

        int N = min * max;

        System.out.println(N);

        sc.close();
    }
}
```