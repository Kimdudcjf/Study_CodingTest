## 🌵 문제 정보
피보나치 수 2 <br>
[🚗 2748](https://www.acmicpc.net/problem/2748)

## 🌵 문제 정의

피보나치 수는 0과 1로 시작한다. 0번째 피보나치 수는 0이고, 1번째 피보나치 수는 1이다. 그 다음 2번째 부터는 바로 앞 두 피보나치 수의 합이 된다.

이를 식으로 써보면 Fn = Fn-1 + Fn-2 (n ≥ 2)가 된다.

n=17일때 까지 피보나치 수를 써보면 다음과 같다.

0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597

n이 주어졌을 때, n번째 피보나치 수를 구하는 프로그램을 작성하시오.


`input` <br>

* 첫째 줄에 n이 주어진다. n은 90보다 작거나 같은 자연수이다.
* 10


`output` <br>
* 첫째 줄에 n번째 피보나치 수를 출력한다.
* 55

## 🌵 알고리즘 설계

1. 배열의 크기를 입력받음
2. 배열의 0,1번 인텍스에 0, 1 주입
3. 순회하며 N - 2 인덱스값과 N - 1 인덱스값을 더하고 저장
4. N 번째 인덱스 값을 출력

```java
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();

    long[] intArr = new long[N + 1];
    
    intArr[0] = 0;
    if (N > 0) {
      intArr[1] = 1;
    }
    for (int i = 2; i <= N; i++) {

      long firstNum = intArr[i - 2];
      long secondNum = intArr[i - 1];

      long resultNum = firstNum + secondNum;

      intArr[i] = resultNum;

    }
    System.out.println(intArr[N]);
  }
}
```