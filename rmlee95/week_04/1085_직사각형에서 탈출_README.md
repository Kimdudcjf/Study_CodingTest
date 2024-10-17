# 문제 정보

[👉 1085번: 직사각형에서 탈출](https://www.acmicpc.net/problem/1085)

## 문제 정의
<details><summary> 문제
</summary>

#### 한수는 지금 (x, y)에 있다. 직사각형은 각 변이 좌표축에 평행하고, 왼쪽 아래 꼭짓점은 (0, 0), 오른쪽 위 꼭짓점은 (w, h)에 있다. 직사각형의 경계선까지 가는 거리의 최솟값을 구하는 프로그램을 작성하시오.
</details>

`input`
- 첫째 줄에 x, y, w, h가 주어진다.

`output`
- 첫째 줄에 문제의 정답을 출력한다.

`제한`
- 1 ≤ w, h ≤ 1,000
- 1 ≤ x ≤ w-1
- 1 ≤ y ≤ h-1
- x, y, w, h는 정수

## 코드

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y, w, h;
        int result = 0;
        x = sc.nextInt();
        y = sc.nextInt();
        w = sc.nextInt();
        h = sc.nextInt();
        // x축 최단거리
        if (x > w - x) {
            x = w - x;
        }
        // y축 최단거리
        if (y > h - y) {
            y = h - y;
        }

        System.out.println(x < y ? x : y);
    }
}
```

## 메모