## 🌵 문제 정보
소수 찾기 <br>
[🚗 1978](https://www.acmicpc.net/problem/1978)

## 🌵 문제 정의
주어진 수 N개 중에서 소수가 몇 개인지 찾아서 출력하는 프로그램을 작성하시오.
`input`첫 줄에 수의 개수 N이 주어진다. N은 100이하이다. 다음으로 N개의 수가 주어지는데 수는 1,000 이하의 자연수이다.<br>
- 4
  1 3 5 7
`output`주어진 수들 중 소수의 개수를 출력한다<br>
- 3

## 🌵 알고리즘 설계

```java
import java.util.Scanner;

public class Main {
  public static boolean isPrime(int num) {
    if (num < 2) {
      return false;
    }
    for (int i = 2; i <= Math.sqrt(num); i++) {
      if (num % i == 0) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int count = 0;

    for (int i = 0; i < N; i++) {
      int num = scanner.nextInt();
      if (isPrime(num)) {
        count++;
      }
    }

    System.out.println(count);

    scanner.close();
  }
}

```

