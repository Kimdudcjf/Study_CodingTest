## 🌵 문제 정보
별 찍기 - 4 <br>
[🚗 2441](https://www.acmicpc.net/problem/2441)

## 🌵 문제 정의

첫째 줄에는 별 N개, 둘째 줄에는 별 N-1개, ..., N번째 줄에는 별 1개를 찍는 문제  
하지만, 오른쪽을 기준으로 정렬한 별(예제 참고)을 출력하시오.


`input` <br>

* 첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
* 5



`output` <br>
```
*****
 ****
  ***
   **
    *
```

## 🌵 알고리즘 설계

1. 입력값 만큼 순회
2. 내부에 중첩 for문을 사용하여 i 만큼 공백 추가
3. 내부에 또 다른 중첩 for문을 사용하여 N - i 만큼 "*" 출력
```java
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();

    for (int i = 0; i < N; i++) {
      for (int j = 0; j < i; j++) {
        System.out.print(" ");
      }
      for (int j = 0; j < N - i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
```