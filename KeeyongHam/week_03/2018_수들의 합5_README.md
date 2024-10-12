## 🌵 문제 정보
명령 프롬프트 <br>
[🚗 2018](https://www.acmicpc.net/problem/2018)

## 🌵 문제 정의

어떠한 자연수 N은, 몇 개의 연속된 자연수의 합으로 나타낼 수 있다. 당신은 어떤 자연수 N(1 ≤ N ≤ 10,000,000)에 대해서, 이 N을 몇 개의 연속된 자연수의 합으로 나타내는 가지수를 알고 싶어한다. 이때, 사용하는 자연수는 N이하여야 한다.

예를 들어, 15를 나타내는 방법은 15, 7+8, 4+5+6, 1+2+3+4+5의 4가지가 있다. 반면에 10을 나타내는 방법은 10, 1+2+3+4의 2가지가 있다.

N을 입력받아 가지수를 출력하는 프로그램을 작성하시오.



`input` <br>

* 첫 줄에 정수 N이 주어진다.
* 15


`output` <br>

* 입력된 자연수 N을 몇 개의 연속된 자연수의 합으로 나타내는 가지수를 출력하시오
* 4

## 🌵 알고리즘 설계

1. scanner로 입력 받음
2. 입력받은 수 만큼 1씩 증가시키며 더함
3. 입력받은 수와 연속된 합이 같으면 cnt 증가
4. cnt 값을 출력

```java
public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int num = sc.nextInt();
    int cnt = 0;

    // 1부터 입력받은 수까지 반복
    for (int i = 1; i <= num; i++) {
      int sum = 0;

      // i부터 시작하여 num까지 반복
      for (int j = i; j <= num; j++) {

        sum += j; // 연속된 수의 합을 구함

        //더한 합이 입력받은 수외 같으면 cnt 1 증가 후 break
        if (sum == num) {
          cnt++;
          break;
        }

        //연속된 수의 합이 입력받은 수 보다 크면 break
        if (sum > num) {
          break;
        }
      }
    }
    System.out.println(cnt);
  }
}
```