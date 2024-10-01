## 🌵 문제 정보
최댓값 (브론즈3) <br>
[🚗 1152](https://www.acmicpc.net/problem/1152)

## 🌵 문제 정의
`input` <br>
-  The first character is a blank
- " "(공백)

`output` <br>
- 6
- 0

## 🌵 알고리즘 설계

```java
public class Main {
    public static void main(String[] args) {
        /*
         * 영어 대소문자와 공백으로 이루어진 문자열이 주어진다.
         * 이 문자열에는 몇 개의 단어가 있을까? 이를 구하는 프로그램을 작성하시오.
         * 단, 한 단어가 여러 번 등장하면 등장한 횟수만큼 모두 세어야 한다.
         */
        Scanner sc = new Scanner(System.in);
        
        /*
        StringTokenizer st = new StringTokenizer(s);
		System.out.println(st.countTokens());
         */

        String s = sc.nextLine().trim(); //앞 뒤 공백 제거

        if(s.equals("")) {
            System.out.println(0);
        }
        else {
            String sArr[] = s.split(" ");
            System.out.println(sArr.length);
        }

    }
}
```
1. 문자열을 입력받은 후 trim()을 이용해 앞 뒤 공백을 제거
2. " ", ""를 입력받으면 빈 문자열 취급되어 배열의 길이가 1이 되므로 if문을 이용해서 나눴다
3. split(" ")을 이용해 공백을 기준으로 쪼개기

## 🌵 추가
계속 오류가 나서 찾아봤더니 <br>
만약 문자열로 공백을 입력하면 trim()으로 인해 공백이 빈 문자열로 바뀌고, 빈 문자열 역시 문자열로 취급되기 때문에 길이가 1로 취급이 되어서 올바른 출력값이 나오지 않는 것 같다. 
그래서 if문을 이용해 s가 빈 문자열인 경우 / 아닌 경우로 나눠줬다. <br>
StringTokenizer를 사용하면 더 간단하게 할 수 있을 듯.