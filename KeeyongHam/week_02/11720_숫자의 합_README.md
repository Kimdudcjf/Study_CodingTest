## 🌵 문제 정보
숫자의 합 <br>
[🚗 11720](https://www.acmicpc.net/problem/11720)

## 🌵 문제 정의

 * N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.

`input` <br>
 * 첫째 줄에 숫자의 개수 N (1 ≤ N ≤ 100)이 주어진다. 둘째 줄에 숫자 N개가 공백없이 주어진다.
 * 11
   10987654321



`output` <br>

* 46

## 🌵 알고리즘 설계

1. scanner로 입력 받음
2. 각 index별 숫자의 합을 출력

```java
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        String inputStr = sc.next();

        int result = 0;

        int[] intArr = Stream.of(inputStr.split(""))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int i = 0; i < cnt; i++) {
            result += intArr[i];
        }

        System.out.println(result);
    }
}
```
# 정리
 * int형 자료를 항상 0을 빼 아스키 코드로 값을 가져오다가 스트림으로는 처음 가져와 봤는데 코드를 더 깔끔하게 작성할 수 있는 것 같다.