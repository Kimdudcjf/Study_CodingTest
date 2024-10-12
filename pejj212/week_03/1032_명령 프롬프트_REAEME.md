## 🌵 문제 정보
명령 프롬프트 (브론즈1) <br>
[🚗 1032](https://www.acmicpc.net/problem/1032)

## 🌵 문제 정의
`input` <br>
첫째 줄에 파일 이름의 개수 N이 주어진다. 둘째 줄부터 N개의 줄에는 파일 이름이 주어진다. N은 50보다 작거나 같은 자연수이고 파일 이름의 길이는 모두 같고 길이는 최대 50이다. 파일이름은 알파벳 소문자와 '.' 로만 이루어져 있다.
-  3 <br>
   config.sys <br>
   config.inf <br>
   configures <br>

`output` <br>
첫째 줄에 패턴을 출력하면 된다.
- config????

## 🌵 알고리즘 설계

```java
public class Main {
    public static void main(String[] args) {
        /*
         * 시작 -> 실행 -> cmd를 쳐보자. 검정 화면이 눈에 보인다. 여기서 dir이라고 치면 그 디렉토리에 있는 서브디렉토리와 파일이 모두 나온다.
         * 이때 원하는 파일을 찾으려면 다음과 같이 하면 된다.
         * dir *.exe라고 치면 확장자가 exe인 파일이 다 나온다.
         * "dir 패턴"과 같이 치면 그 패턴에 맞는 파일만 검색 결과로 나온다.
         * 예를 들어, dir a?b.exe라고 검색하면 파일명의 첫 번째 글자가 a이고, 세 번째 글자가 b이고, 확장자가 exe인 것이 모두 나온다.
         * 이때 두 번째 문자는 아무거나 나와도 된다. 예를 들어, acb.exe, aab.exe, apb.exe가 나온다.
         * 이 문제는 검색 결과가 먼저 주어졌을 때, 패턴으로 뭘 쳐야 그 결과가 나오는지를 출력하는 문제이다.
         * 패턴에는 알파벳과 "." 그리고 "?"만 넣을 수 있다. 가능하면 ?을 적게 써야 한다.
         * 그 디렉토리에는 검색 결과에 나온 파일만 있다고 가정하고, 파일 이름의 길이는 모두 같다.
         */

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String str = sc.next();
        char chArr[] = str.toCharArray();

        for(int i=0; i<N-1; i++) {
            String str2 = sc.next();
            for(int j=0; j<str.length(); j++) {
                if(chArr[j] != str2.charAt(j)) {
                    chArr[j]='?';
                }

            }
        }
        System.out.println(chArr);
    }
}

```
처음 입력받은 문자열을 char배열에 넣고,
그 후로 입력받은 문자열들과 비교하여 다르면 char배열의 요소에 ?를 다시 입력

## 🌵 추가
nextLine()->문자열이 제대로 입력되지 않음 개행문자를 포함하므로 \n만 남게되어서 그런 것 같다