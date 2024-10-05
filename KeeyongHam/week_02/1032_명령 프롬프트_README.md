## 🌵 문제 정보
명령 프롬프트 <br>
[🚗 1032](https://www.acmicpc.net/problem/1032)

## 🌵 문제 정의

 * 시작 -> 실행 -> cmd를 쳐보자. 검정 화면이 눈에 보인다. 여기서 dir이라고 치면 그 디렉토리에 있는 서브디렉토리와 파일이 모두 나온다. 이때 원하는 파일을 찾으려면 다음과 같이 하면 된다.

   dir *.exe라고 치면 확장자가 exe인 파일이 다 나온다. "dir 패턴"과 같이 치면 그 패턴에 맞는 파일만 검색 결과로 나온다. 예를 들어, dir a?b.exe라고 검색하면 파일명의 첫 번째 글자가 a이고, 세 번째 글자가 b이고, 확장자가 exe인 것이 모두 나온다. 이때 두 번째 문자는 아무거나 나와도 된다. 예를 들어, acb.exe, aab.exe, apb.exe가 나온다.

   이 문제는 검색 결과가 먼저 주어졌을 때, 패턴으로 뭘 쳐야 그 결과가 나오는지를 출력하는 문제이다. 패턴에는 알파벳과 "." 그리고 "?"만 넣을 수 있다. 가능하면 ?을 적게 써야 한다. 그 디렉토리에는 검색 결과에 나온 파일만 있다고 가정하고, 파일 이름의 길이는 모두 같다.



`input` <br>
 * 3 <br>
   config.sys <br>
   config.inf <br>
   configures



`output` <br>

* config????

## 🌵 알고리즘 설계

1. scanner로 입력 받음
2. 입력받은 문자열의 길이만큼 반복
3. 문자가 같으면 해당 문자를 추가 아니면 ? 추가

```java
public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int cnt = sc.nextInt();
      sc.nextLine();

      //입력받은 수 만큼 반복하고, 입력받은 문자를 list로 반환
      List<String> inputArr = IntStream.range(0, cnt)
              .mapToObj(i -> sc.nextLine())
              .collect(Collectors.toList());

      //첫번째 문자열을 문자 하나하나 조깨서 문자열로 반환
      List<String> standardStrings = Arrays.stream(inputArr.get(0).split(""))
              .collect(Collectors.toList());

      StringBuilder builder = new StringBuilder();

      // 문자열 길이 만큼 반복
      for (int i = 0; i < standardStrings.size(); i++) {

         boolean isSame = true;
         String standardStr = standardStrings.get(i);

         //입력받은 문자열 만큼 반벅
         for (int j = 1; j < inputArr.size(); j++) {

            //비교할 문자열을 문자 단위로 쪼게서 반환
            String comparisonTarget = String.valueOf(inputArr.get(j).charAt(i));

            // 같은 값이 아니면 거짓을 반환
            if (!standardStr.equals(comparisonTarget)) {
               isSame = false;
            }
         }

         // isSame이 참이면 해당 글자를 아니면 ?를 결과값에 추가
         if (isSame) {
            builder.append(standardStr);
         } else {
            builder.append("?");
         }
      }
      System.out.println(builder);
   }
}
```

정리
 * 처음에는 String 생성해서 거기다 이어 붙였었는데 StringBuilder를 사용하니 더 편하게 할 수 있는 것 같다.