## 🌵 문제 정보
명령 프롬프트 <br>
[🚗 1417](https://www.acmicpc.net/problem/1417)

## 🌵 문제 정의

 다솜이는 사람의 마음을 읽을 수 있는 기계를 가지고 있다. 다솜이는 이 기계를 이용해서 2008년 4월 9일 국회의원 선거를 조작하려고 한다. 
   
   다솜이의 기계는 각 사람들이 누구를 찍을 지 미리 읽을 수 있다. 어떤 사람이 누구를 찍을 지 정했으면, 반드시 선거때 그 사람을 찍는다.

   현재 형택구에 나온 국회의원 후보는 N명이다. 다솜이는 이 기계를 이용해서 그 마을의 주민 M명의 마음을 모두 읽었다.

   다솜이는 기호 1번이다. 다솜이는 사람들의 마음을 읽어서 자신을 찍지 않으려는 사람을 돈으로 매수해서 국회의원에 당선이 되게 하려고 한다. 다른 모든 사람의 득표수 보다 많은 득표수를 가질 때, 그 사람이 국회의원에 당선된다.

   예를 들어서, 마음을 읽은 결과 기호 1번이 5표, 기호 2번이 7표, 기호 3번이 7표 라고 한다면, 다솜이는 2번 후보를 찍으려고 하던 사람 1명과, 3번 후보를 찍으려고 하던 사람 1명을 돈으로 매수하면, 국회의원에 당선이 된다.

   돈으로 매수한 사람은 반드시 다솜이를 찍는다고 가정한다.

   다솜이가 매수해야하는 사람의 최솟값을 출력하는 프로그램을 작성하시오.



`input` <br>
 * 3 <br>
   5 <br>
   7 <br>
   7



`output` <br>

* 2

## 🌵 알고리즘 설계

1. scanner로 입력 받음
2. 다솜이를 제외한 나머지 후보의 득표수를 list로 묶음
3. list를 큰 수부터 정렬
4. list 0번 숫자를 1 차감
5. 다솜이의 득표수를 1 증가
6. 리스트를 다시 큰 수부터 정렬

```java
public class Main {
   public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);

      int N = sc.nextInt();
      int dasomNum = sc.nextInt();

      int result = 0;

      List<Integer> voteNumbers = IntStream.range(0, N - 1)
              .mapToObj(i -> sc.nextInt())
              .collect(Collectors.toList());

      voteNumbers.sort(Collections.reverseOrder()); // list를 크기 순서대로 정렬

      if (voteNumbers.size() > 0) {
         while (dasomNum <= voteNumbers.get(0)) { // 다솜의 숫자가 voteNumbers의 가장 큰 수보다 작거나 같으면 반복
            voteNumbers.set(0, voteNumbers.get(0) - 1); // 가장 큰 수를 -1 하고 다시 저장
            dasomNum++; // 다솜의 표를 1 증가
            result++; // 반복 횟수 증가
            voteNumbers.sort(Collections.reverseOrder()); // list를 크기 순서대로 정렬
         }
      }

      System.out.println(result);
   }
}
```