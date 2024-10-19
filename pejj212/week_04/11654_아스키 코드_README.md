## 🌵 문제 정보
아스키 코드 (브론즈5) <br>
[🚗 11654](https://www.acmicpc.net/problem/11654)

## 🌵 문제 정의
`input` <br>
알파벳 소문자, 대문자, 숫자 0-9 중 하나가 첫째 줄에 주어진다.
-  A

`output` <br>
입력으로 주어진 글자의 아스키 코드 값을 출력한다.
- 65

## 🌵 알고리즘 설계

```java
public class Main {
    public static void main(String[] args) {
        /*
         * 알파벳 소문자, 대문자, 숫자 0-9중 하나가 주어졌을 때, 주어진 글자의 아스키 코드값을 출력하는 프로그램을 작성하시오.
         */

        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();

        int b = a.charAt(0);

        System.out.println(b);
    }
}
```

## 🌵 추가