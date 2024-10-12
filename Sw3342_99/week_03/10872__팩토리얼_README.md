## 🌵 문제 정보
팩토리얼 <br>
[🚗 10872](https://www.acmicpc.net/problem/10872)

## 🌵 문제 정의
0보다 크거나 같은 정수 N이 주어진다. 이때, N!을 출력하는 프로그램을 작성하시오.
`input` 첫째 줄에 정수 N(0 ≤ N ≤ 12)이 주어진다.<br>
- 10

`output` 첫째 줄에 N!을 출력한다.<br>
- 3628800

## 🌵 알고리즘 설계
팩토리얼을 구하는 문제 (계속 팩토리얼 함수를 보른다)
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(factorial(N));
        sc.close();
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}

```