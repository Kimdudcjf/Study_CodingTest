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