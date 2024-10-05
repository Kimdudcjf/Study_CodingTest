## 🌵 문제 정보
숫자의 합 <br>
[🚗 1100](https://www.acmicpc.net/problem/1100)

## 🌵 문제 정의

 * 체스판은 8×8크기이고, 검정 칸과 하얀 칸이 번갈아가면서 색칠되어 있다. 가장 왼쪽 위칸 (0,0)은 하얀색이다. 체스판의 상태가 주어졌을 때, 하얀 칸 위에 말이 몇 개 있는지 출력하는 프로그램을 작성하시오.



`input` <br>
 * 첫째 줄부터 8개의 줄에 체스판의 상태가 주어진다. ‘.’은 빈 칸이고, ‘F’는 위에 말이 있는 칸이다.
 * .F.F...F <br>
   F...F.F. <br>
   ...F.F.F <br>
   F.F...F. <br>
   .F...F.. <br>
   F...F.F. <br>
   .F.F.F.F <br>
   ..FF..F.



`output` <br>

* 1

## 🌵 알고리즘 설계

1. scanner로 입력 받음
2. 홀수칸 or 짝수칸에 F가 있는 값을 출력

### 1. 메소드 분리 전
```java
public class Main {
   public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);

      int cnt = 0;

      for (int i = 1; i <= 8; i++) {
         String[] inputStr = sc.nextLine().split(""); // 입력받은 글자를 한글자씩 분리
         for (int j = 1; j <= 8; j++) {
            if ((i % 2 != 0) && (j % 2 != 0) && (inputStr[j - 1].equals("F"))) { // i,j 가 홀수이면서 F가 있으면 cnt 증가
               cnt++;
            }
            if ((i % 2 == 0) && (j % 2 == 0) && (inputStr[j - 1].equals("F"))) { // i,j 가 짝수이면서 F가 있으면 cnt 증가
               cnt++;
            }
         }
      }
      System.out.println(cnt);
   }
}
```

### 2. 메소드 분리 후

```java
public class Main {
   public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);

      int cnt = 0;

      for (int i = 1; i <= 8; i++) {
         String[] inputStr = sc.nextLine().split(""); // 입력받은 글자를 한글자씩 분리
         for (int j = 1; j <= 8; j++) {
            cnt = getCnt(i, j, inputStr, cnt);
         }
      }
      System.out.println(cnt);
   }

   private static int getCnt(int i, int j, String[] inputStr, int cnt) {
      if ((i % 2 != 0) && (j % 2 != 0) && (inputStr[j - 1].equals("F"))) { // i,j 가 홀수이면서 F가 있으면 cnt 증가
         cnt++;
      }
      if ((i % 2 == 0) && (j % 2 == 0) && (inputStr[j - 1].equals("F"))) { // i,j 가 짝수이면서 F가 있으면 cnt 증가
         cnt++;
      }
      return cnt;
   }
}
```

# 정리
 * 들여쓰기의 depth 와 if문의 가독성을 위해 메소드를 분리해봤다
 * 메소드 분리를 하니 if문 가독성이 좋아진 것 같다.