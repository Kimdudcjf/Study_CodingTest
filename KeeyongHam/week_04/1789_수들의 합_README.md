## 🌵 문제 정보
수들의 합 <br>
[🚗 1789](https://www.acmicpc.net/problem/1789)

## 🌵 문제 정의

* 서로 다른 N개의 자연수의 합이 S라고 한다. S를 알 때, 자연수 N의 최댓값은 얼마일까?


`input` <br>

* 첫째 줄에 자연수 S(1 ≤ S ≤ 4,294,967,295)가 주어진다.
* 200


`output` <br>
* 19

## 🌵 알고리즘 설계

*  작은 수 부터 S을 초과할 때 까지 더하고 -1을 하면 된다.
1. S를 입력받고, 숫자를 합한 숫자를 저장할 sum과 횟수를 카운트 할 cnt 선언
2. 반복하며 sum은 cnt만큼 더한다
3. S보다 커지면 cnt에서 -1을 한다.

```java
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    long S = sc.nextLong();
    long sum = 0;
    long cnt = 0;

    while (S >= sum) {
      cnt++;
      sum += cnt;
    }
    System.out.println(cnt - 1);
  }
}
```