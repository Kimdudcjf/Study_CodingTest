## 🌵 문제 정보
단어 정렬 <br>
[🚗 1181](https://www.acmicpc.net/problem/1181)

## 🌵 문제 정의

 * 알파벳 소문자로 이루어진 N개의 단어가 들어오면 아래와 같은 조건에 따라 정렬하는 프로그램을 작성하시오.

   1. 길이가 짧은 것부터
   2. 길이가 같으면 사전 순으로 
   3. 단, 중복된 단어는 하나만 남기고 제거해야 한다.



`input` <br>
 * 13 <br>
   but <br>
   i <br>
   wont <br>
   hesitate <br>
   no <br>
   more <br>
   no <br>
   more <br>
   it <br>
   cannot <br>
   wait <br>
   im <br>
   yours



`output` <br>

* i <br>
  im <br>
  it <br>
  no <br>
  but <br>
  more <br>
  wait <br>
  wont <br>
  yours <br>
  cannot <br>
  hesitate <br>

## 🌵 알고리즘 설계

1. 입력받아 저장할 리스트 생성
2. cnt 만큼 입력 받아 저장하는데 중복된 값은 저장하지 않음
3. sort메소드를 사용하여 

```java
public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int cnt = sc.nextInt();
      sc.nextLine();

      List<String> result = new ArrayList<>(); //입력 받은 값을 저장할 list 생성

      IntStream.range(0, cnt) //cnt만큼 반복하고, list에 중복된 값이 있으면 저장하지 않는다
              .forEach(i -> {
                 String string = sc.nextLine();
                 if (!result.contains(string)) {
                    result.add(string);
                 }
              });

      result.sort((o1, o2) -> {
         // 길이가 같으면 사전 순 아니면 길이 순으로 정렬
         if (o1.length() == o2.length()) {
            return o1.compareTo(o2);
         } else {
            return Integer.compare(o1.length(), o2.length());
         }
      });

      //결과값 출력
      for (String string : result) {
         System.out.println(string);
      }
   }
}
```