## 🌵 문제 정보
피시방 알바 <br>
[🚗 1453](https://www.acmicpc.net/problem/1453)

## 🌵 문제 정의

 * 세준이는 피시방에서 아르바이트를 한다. 세준이의 피시방에는 1번부터 100번까지 컴퓨터가 있다.

   들어오는 손님은 모두 자기가 앉고 싶은 자리에만 앉고싶어한다. 따라서 들어오면서 번호를 말한다. 만약에 그 자리에 사람이 없으면 그 손님은 그 자리에 앉아서 컴퓨터를 할 수 있고, 사람이 있다면 거절당한다.

   거절당하는 사람의 수를 출력하는 프로그램을 작성하시오. 자리는 맨 처음에 모두 비어있고, 어떤 사람이 자리에 앉으면 자리를 비우는 일은 없다.



`input` <br>
 * 첫째 줄에 손님의 수 N이 주어진다. N은 100보다 작거나 같다. 둘째 줄에 손님이 들어오는 순서대로 각 손님이 앉고 싶어하는 자리가 입력으로 주어진다.


 * 3
   1 2 3



`output` <br>

* 0

## 🌵 알고리즘 설계

1. scanner로 입력 받음
2. 입력받은 값이 list에 있으면 cnt증가, 없으면 list에 추가한다

```java
public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int N = sc.nextInt();
      List<Integer> customer = new ArrayList<>();

      int cnt = 0;

      //N만큼 반복한다
      for (int i = 0; i < N; i++) {
         int inputNum = sc.nextInt();

         // 입력값이 list에 있으면 cnt 증가, 없으면 list에 추가
         if (customer.contains(inputNum)) {
            cnt++;
         } else {
            customer.add(inputNum);
         }
      }
      System.out.println(cnt);
   }
}
```