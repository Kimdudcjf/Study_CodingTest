## 🌵 문제 정보
알파벳 찾기 (브론즈2) <br>
[🚗 10809](https://www.acmicpc.net/problem/10809)

## 🌵 문제 정의
`input` <br>
- baekjoon

`output` <br>
- 1 0 -1 -1 2 -1 -1 -1 -1 4 3 -1 -1 7 5 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1

## 🌵 알고리즘 설계

```java
public class Main {
    public static void main(String[] args) {
        /*
         * 알파벳 소문자로만 이루어진 단어 S가 주어진다.
         * 각각의 알파벳에 대해서, 단어에 포함되어 있는 경우에는 처음 등장하는 위치를, 포함되어 있지 않은 경우에는 -1을 출력하는 프로그램을 작성하시오.
         */
        Scanner sc = new Scanner(System.in);

        String s=sc.nextLine();

        for(int i=97; i<=122; i++) {
            System.out.print(s.indexOf(i)+" ");
        }
    }
}
```
1. 알파벳 소문자의 아스키코드 값을 이용해 문자열의 알파벳 위치를 찾아 반환한다 


## 🌵 추가
