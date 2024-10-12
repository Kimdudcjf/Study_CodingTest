## 🌵 문제 정보
명령 프롬프트 <br>
[🚗 2303](https://www.acmicpc.net/problem/2303)

## 🌵 문제 정의

N명이 모여 숫자 게임을 하고자 한다. 각 사람에게는 1부터 10사이의 수가 적혀진 다섯 장의 카드가 주어진다. 그 중 세 장의 카드를 골라 합을 구한 후 일의 자리 수가 가장 큰 사람이 게임을 이기게 된다. 세 장의 카드가 (7, 8, 10)인 경우에는 합은 7+8+10 = 25가 되고 일의 자리 수는 5가 된다. 어떤 사람이 받은 카드가 (7, 5, 5, 4, 9)인 경우 (7, 4, 9)를 선택하면 합이 20이 되어 일의 자리 수는 0이 되고, (5, 5, 9)를 선택하면 합이 19가 되어 일의 자리 수는 9가 된다. 게임을 이기기 위해서는 세 장의 카드를 선택할 때 그 합의 일의 자리 수가 가장 크게 되도록 선택하여야 한다.

예를 들어, N=3일 때

1번 사람이 (7, 5, 5, 4, 9),
2번 사람이 (1, 1, 1, 1, 1),
3번 사람이 (2, 3, 3, 2, 10)의
카드들을 받았을 경우, 세 수의 합에서 일의 자리 수가 가장 크게 되도록 세 수를 선택하면

1번 사람은 (5, 5, 9)에서 9,
2번 사람은 (1, 1, 1)에서 3,
3번 사람은 (2, 3, 3)에서 8의
결과를 각각 얻을 수 있으므로 첫 번째 사람이 이 게임을 이기게 된다.

N명에게 각각 다섯 장의 카드가 주어졌을 때, 세 장의 카드를 골라 합을 구한 후 일의 자리 수가 가장 큰 사람을 찾는 프로그램을 작성하시오. 가장 큰 수를 갖는 사람이 두 명 이상일 경우에는 번호가 가장 큰 사람의 번호를 출력한다.


`input` <br>

 * 첫 줄에는 사람의 수를 나타내는 정수 N이 주어진다. N은 2이상 1,000이하이다. 그 다음 N 줄에는 1번부터 N번까지 각 사람이 가진 카드가 주어지는 데, 각 줄에는 1부터 10사이의 정수가 다섯 개씩 주어진다. 각 정수 사이에는 한 개의 빈칸이 있다.


 * 3 <br>
7 5 5 4 9 <br>
1 1 1 1 1 <br>
2 3 3 2 10 


`output` <br>

* 1

## 🌵 알고리즘 설계

1. scanner로 입력 받음
2. 한 사람 당 숫자 5개를 입력받음
3. 한 사람의 숫자 중 3자리 숫자를 더한 후 일의 자리값이 가장 클 수 있는 모든 경우의 수를 탐색
4. 사람 수(cnt) 중 가장 큰 값을 찾음
5. 사람의 수(cnt) 만큼 3번 ~ 5번을 반복
6. 거꾸로 순회하며 가장 큰 사람의 인덱스 번호를 출력

```java
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int cnt = sc.nextInt();

    List<Integer> result = new ArrayList<>();

    //cnt 만큼 반복
    for (int i = 0; i < cnt; i++) {
      List<Integer> numbers = new ArrayList<>();

      //숫자 5개를 입력받음
      for (int j = 0; j < 5; j++) {
        numbers.add(sc.nextInt());
      }

      //최대값을 저장
      int maxSum = 0;

      //모든 경우의수 숫자를 더함
      for (int j = 0; j < 5; j++) {
        for (int k = j + 1; k < 5; k++) {
          for (int l = k + 1; l < 5; l++) {
            int sum = (numbers.get(j) + numbers.get(k) + numbers.get(l)) % 10; // 숫자의 합을 중 1의 자리 숫자를 sum에 저장
            maxSum = Math.max(maxSum, sum); // maxSum 값과 sum 값을 비교 후 큰 값을 다시 MaxSum에 저장
          }
        }
      }
      result.add(maxSum); //모든 경우의 수 중에 가장 큰 값을 저장
    }
    Integer maxResult = Collections.max(result); //result에 저장되어있는 값 중 가장 큰 값을 찾아옴

    // 1씩 감소하며 순회
    for (int i = result.size() - 1; i >= 0; i--) {

      //가장 큰 값과 result 저장되어있는 값이 같으면 해당 인덱스를 출력
      if (result.get(i) == maxResult) {
        System.out.println(i + 1);
        break;
      }
    }
  }
}
```