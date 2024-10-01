

## 🌵 문제 정보
공 넣기 <br>
[🚗 10810](https://www.acmicpc.net/problem/10810)

## 🌵 문제 정의

도현이는 바구니를 총 N개 가지고 있고, <br>
각각의 바구니에는 1번부터 N번까지 번호가 매겨져 있다 <br>
가장 처음 바구니에는 공이 들어있지 않으며, 바구니에는 공을 1개만 넣을 수 있다

도현이는 앞으로 M번 공을 넣으려고 한다 <br>
도현이는 한 번 공을 넣을 때, 공을 넣을 바구니 범위를 정하고, <br>
정한 바구니에 모두 같은 번호가 적혀있는 공을 넣는다 <br>
만약, 바구니에 공이 이미 있는 경우에는 들어있는 공을 빼고, 새로 공을 넣는다 <br>
공을 넣을 바구니는 연속되어 있어야 한다

공을 어떻게 넣을지가 주어졌을 때, <br>
M번 공을 넣은 이후에 각 바구니에 어떤 공이 들어 있는지 구하는 프로그램을 작성하시오


`input` <br>
- 첫째 줄에 N (1 ≤ N ≤ 100)과 M (1 ≤ M ≤ 100)이 주어진다
- 둘째 줄부터 M개의 줄에 걸쳐서 공을 넣는 방법이 주어진다
- 각 방법은 세 정수 i j k로 이루어져 있으며, <br>
  i번 바구니부터 j번 바구니까지에 k번 번호가 적혀져 있는 공을 넣는다는 뜻이다 <br>
  예를 들어, 2 5 6은 2번 바구니부터 5번 바구니까지에 6번 공을 넣는다는 뜻이다 <br>
  (1 ≤ i ≤ j ≤ N, 1 ≤ k ≤ N)
- 도현이는 입력으로 주어진 순서대로 공을 넣는다
  <br><br>

- 5 4 <br>
  1 2 3 <br>
  3 4 4 <br>
  1 4 1 <br>
  2 2 2

`output` <br>
- 1번 바구니부터 N번 바구니에 들어있는 공의 번호를 공백으로 구분해 출력 <br>
- 공이 들어있지 않은 바구니는 0을 출력
  <br><br>
- 1 2 1 1 0

## 🌵 알고리즘 설계

1차원 배열 문제 <br>

Scanner를 사용하여 입력받고 출력

```java
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
  
    //바구니의 수
    int N = sc.nextInt();
    int[] arr = new int[N];
    
    //넣을 공의 수
    int M = sc.nextInt();
    
    for(int i = 0; i < M; i++) {
      int I = sc.nextInt();
      int J = sc.nextInt();
      int K = sc.nextInt();
  
      //배열의 Index는 0부터 시작하기 때문에 -1
      for(int j = I - 1; j < J; j++) {
        arr[j] = K;
      }
    }
  
    for (int i : arr) {
        System.out.print(i + " ");
    }
    /* 아래와 같음
    for(int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    */
  }
}
```

<br>

## 🌵 보충 자료 (다른 사람의 풀이)

Stream을 사용하여 입력받고 출력 <br>

Scanner와 System.out.println 대신 BufferedReader와 BufferedWriter 를 사용하는 이유? <br>

⚡️입출력 방식이 느리면 여러 줄을 입력받거나 출력할 때 시간초과가 날 수 있기때문 (성능) <br>

```java
import java.io.*;
import java.util.StringTokenizer;

public class Main {
    
    //readLine() 시 예외처리가 반드시 필요
    public static void main(String[] args) throws IOException{

      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
  
      // StringTokenizer로 N과 M을 공백으로 구분
      StringTokenizer st = new StringTokenizer(br.readLine()); 
      /*
      입력은 readLine()를 사용, 리턴 값이 String으로 고정
      ⚡️다른 타입으로 입력을 받고자 한다면 반드시 형변환이 필요하다.
      */
      
      //바구니의 수
      int N = Integer.parseInt(st.nextToken());
      int[] arr = new int[N];
       //넣을 공의 수
      int M = Integer.parseInt(st.nextToken());
      /*
      nextToken()를 쓰면 readLine()을 통해 입력 받은 값을 
      공백 단위로 구분하여 순서대로 호출
      */
  
      for(int i = 0; i < M; i++) {
          // StringTokenizer로 공백으로 구분
          st = new StringTokenizer(br.readLine());			 
          
          int I = Integer.parseInt(st.nextToken());
          int J = Integer.parseInt(st.nextToken());
          int K = Integer.parseInt(st.nextToken());
  
          //배열의 Index는 0부터 시작하기 때문에 -1
          for(int j = I - 1; j < J; j++) {
              arr[j] = K;
          }
      }
      
      for(int i = 0; i < arr.length; i++) {
          bw.write(arr[i] + " ");
      }

      br.close();
      bw.flush();
      bw.close();
    }
}
```
