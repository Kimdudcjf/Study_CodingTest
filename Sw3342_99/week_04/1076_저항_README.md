## 🌵 문제 정보
저항 <br>
[🚗 1076](https://www.acmicpc.net/problem/1076)

## 🌵 문제 정의
전자 제품에는 저항이 들어간다. 저항은 색 3개를 이용해서 그 저항이 몇 옴인지 나타낸다. 처음 색 2개는 저항의 값이고, 마지막 색은 곱해야 하는 값이다. 저항의 값은 다음 표를 이용해서 구한다.

색	값	곱
black	0	1
brown	1	10
red	2	100
orange	3	1,000
yellow	4	10,000
green	5	100,000
blue	6	1,000,000
violet	7	10,000,000
grey	8	100,000,000
white	9	1,000,000,000
예를 들어, 저항의 색이 yellow, violet, red였다면 저항의 값은 4,700이 된다.
`input` 첫째 줄에 첫 번째 색, 둘째 줄에 두 번째 색, 셋째 줄에 세 번째 색이 주어진다. 위의 표에 있는 색만 입력으로 주어진다.<br>
- yellow
  violet
  red
`output` 입력으로 주어진 저항의 저항값을 계산하여 첫째 줄에 출력한다.<br>
- 4700

## 🌵 알고리즘 설계
맵을 이용한 옴 계산법
```java
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    HashMap<String, Integer> CTV = new HashMap<>();
    CTV.put("black", 0);
    CTV.put("brown", 1);
    CTV.put("red", 2);
    CTV.put("orange", 3);
    CTV.put("yellow", 4);
    CTV.put("green", 5);
    CTV.put("blue", 6);
    CTV.put("violet", 7);
    CTV.put("grey", 8);
    CTV.put("white", 9);

    HashMap<String, Integer> CTM = new HashMap<>();
    CTM.put("black", 1);
    CTM.put("brown", 10);
    CTM.put("red", 100);
    CTM.put("orange", 1000);
    CTM.put("yellow", 10000);
    CTM.put("green", 100000);
    CTM.put("blue", 1000000);
    CTM.put("violet", 10000000);
    CTM.put("grey", 100000000);
    CTM.put("white", 1000000000);

    Scanner scanner = new Scanner(System.in);

    String first = scanner.nextLine().toLowerCase();
    String second = scanner.nextLine().toLowerCase();
    String third = scanner.nextLine().toLowerCase();

    int value = CTV.get(first) * 10 + CTV.get(second);
    int multiplier = CTM.get(third);
    long res = value * (long)multiplier;

    System.out.println(res);

    scanner.close();
  }
}

```