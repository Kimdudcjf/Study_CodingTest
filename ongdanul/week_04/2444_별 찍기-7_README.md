## 🌵 문제 정보
별 찍기 - 7 <br>
[🚗 2444](https://www.acmicpc.net/problem/2444)

## 🌵 문제 정의

`input` <br>
- 첫째 줄에 N (1 ≤ N ≤ 100)이 주어진다


- 5

`output` <br>
- 첫째 줄부터 2 × N-1번째 줄까지 차례대로 별을 출력


```
     * 
    ***
   *****
  *******
 *********
  *******
   *****
    ***
     *
```

## 🌵 알고리즘 설계

```java
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = 0;

    N = sc.nextInt();
    for(int i = 1; i <= N; i++) {

      for(int j = 1; j <= N - i; j++ ) {
        System.out.print(" ");
      }
      for(int j = 1; j <= i*2 -1; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
    
    for(int i = 1; i <= N - 1 ; i++) {
      for(int j = 1; j <= i; j++) {
        System.out.print(" ");
      }
      for(int j = 1; j <= ((N - i) * 2 - 1); j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
```