## 🌵 문제 정보
최소, 최대 <br>
[🚗 10818](https://www.acmicpc.net/problem/10818)

## 🌵 문제 정의
N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.
`input`첫째 줄에 정수의 개수 N (1 ≤ N ≤ 1,000,000)이 주어진다. 둘째 줄에는 N개의 정수를 공백으로 구분해서 주어진다. 모든 정수는 -1,000,000보다 크거나 같고, 1,000,000보다 작거나 같은 정수이다.<br>
- 5
  20 10 35 30 7
`output` 첫째 줄에 주어진 정수 N개의 최솟값과 최댓값을 공백으로 구분해 출력한다.<br>
- 7 35

## 🌵 알고리즘 설계
최대 최소 구하기
```java
import java.util.Scanner;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();

    int[] numbers = new int[N];
    for (int i = 0; i < N; i++) {
      numbers[i] = sc.nextInt();
    }

    int min = Arrays.stream(numbers).min().getAsInt();
    int max = Arrays.stream(numbers).max().getAsInt();

    System.out.println(min + " " + max);
  }
}

```

