## 🌵 문제 정보
N 번째 큰 수 <br>
[🚗 2693](https://www.acmicpc.net/problem/2693)

## 🌵 문제 정의

배열 A가 주어졌을 때, N번째 큰 값을 출력하는 프로그램을 작성하시오.

배열 A의 크기는 항상 10이고, 자연수만 가지고 있다. N은 항상 3이다.


`input` <br>

* 첫째 줄에 테스트 케이스의 개수 T(1 ≤ T ≤ 1,000)가 주어진다. 각 테스트 케이스는 한 줄로 이루어져 있고, 배열 A의 원소 10개가 공백으로 구분되어 주어진다. 이 원소는 1보다 크거나 같고, 1,000보다 작거나 같은 자연수이다.
* 4 <br>
  1 2 3 4 5 6 7 8 9 1000 <br>
  338 30 4 619 95 343 496 489 116 98 127 <br>
  931 240 986 894 826 640 965 833 136 138 <br>
  940 955 364 188 133 254 501 122 768 408 <br>


`output` <br>
* 각 테스트 케이스에 대해 한 줄에 하나씩 배열 A에서 3번째 큰 값을 출력한다.
* 8 <br>
  489 <br>
  931 <br>
  768

## 🌵 알고리즘 설계

1. T 값을 입력 받음
2. T 만큼 테스트 케이스 실행
3. 10개의 수를 입력받아 list에 저장
4. 오름차순으로 정렬 후 3번째 큰 수를 출력
```java
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt();

    List<Integer> intList = new ArrayList<>();
    for (int i = 0; i < T; i++) {
      for (int j = 0; j < 10; j++) {
        intList.add(sc.nextInt());
      }
      intList.sort((o1, o2) -> o1.compareTo(o2));
      System.out.println(intList.get(7));
      intList.clear();
    }

  }
}
```