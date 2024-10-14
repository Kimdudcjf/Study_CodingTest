# 문제 정보

[👉 2444번: 그대로 출력하기](https://www.acmicpc.net/problem/2444)

## 문제 정의
<details><summary> 문제
</summary>

#### 예제를 보고 규칙을 유추한 뒤에 별을 찍어 보세요.
</details>

`input`
- 첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.

`output`
- 첫째 줄부터 2×N-1번째 줄까지 차례대로 별을 출력한다.

## 코드

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = N - 1; i >= 1; i--) {
            for (int j = 1; j <= N - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
```

## 메모
