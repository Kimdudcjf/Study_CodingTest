## 🌵 문제 정보
짐 챙기는 숌 <br>
[🚗 1817](https://www.acmicpc.net/problem/1817)

## 🌵 문제 정의

숌은 짐을 챙겨서 겨울캠프에서 집으로 가려고 한다

근데 숌은 공부를 많이 하러 캠프에 온 것이기 때문에 책을 엄청나게 많이 가지고 왔다

숌은 이 책을 방에 탑처럼 쌓아 놨다

숌은 책을 박스에 차곡차곡 넣어서 택배로 미리 보내려고 한다

책은 탑처럼 차곡차곡 쌓여있기 때문에, 차례대로 박스에 넣을 수밖에 없다

각각의 책은 무게가 있고 박스는 최대 넣을수 있는 무게가 있다

숌이 필요한 박스의 개수의 최솟값을 구하는 프로그램을 작성하라

`input` <br>
- 첫째 줄에 책의 개수 N과 박스에 넣을 수 있는 최대 무게 M이 주어진다
  N은 0보다 크거나 같고 50보다 작거나 같은 정수이고, M은 1,000보다 작거나 같은 자연수이다 <br>
  N이 0보다 큰 경우 둘째 줄에 책의 무게가 공백을 사이에 두고 주어진다 <br>
  책의 무게는 M보다 작거나 같은 자연수


- 6 10 <br>
  5 5 5 5 5 5

`output` <br>
- 필요한 박스의 개수의 최솟값을 출력


- 3

## 🌵 알고리즘 설계

1. Scanner 사용
```java
import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String input = sc.nextLine();
    String[] parts = input.split(" ");
    //책 개수
    int N = Integer.parseInt(parts[0]);
    //박스 최대 무게
    int M = Integer.parseInt(parts[1]);
    
    /*
    int N = sc.nextInt();
    int M = sc.nextInt();
    sc.nextLine();
    */
    
    if (N == 0) {
      System.out.println("0");
      sc.close();
      return;
    }

    int[] books = new int[N];

    //초기 박스
    int box = 1;
    //박스에 담긴 책 무게
    int booksWeight = 0;
    
    //책 무게
    for (int i = 0; i < N; i++) {
      books[i] = sc.nextInt();
    }

    //박스 개수
    for(int i = 0 ; i < N; i++){
      booksWeight += books[i];

      //박스의 무게가 최대 무게를 초과하면 박스++
      if(booksWeight > M){
        box++;
        booksWeight = books[i];
      }
    }

    System.out.println(box);

    sc.close();
  }
}
```

<br>

2.Stream 사용
```java
import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    StringTokenizer str = new StringTokenizer(br.readLine());
    //책 개수
    int N = Integer.parseInt(str.nextToken());
    //박스 최대 무게
    int M = Integer.parseInt(str.nextToken());

    if (N == 0) {
      bw.write("0\n");
      bw.flush();
      bw.close();
      br.close();
      return;
    }

    int[] books = new int[N];

    //초기 박스
    int box = 1;
    //박스에 담긴 책 무게
    int booksWeight = 0;

    str = new StringTokenizer(br.readLine());
    //책 무게
    for (int i = 0; i < N; i++) {
      books[i] = Integer.parseInt(str.nextToken());
    }

    //박스 개수
    for(int i = 0 ; i < N; i++){
      booksWeight += books[i];

      //박스의 무게가 최대 무게를 초과하면 박스++
      if(booksWeight > M){
        box++;
        booksWeight = books[i];
      }
    }

    bw.write(box + "\n");


    bw.flush();
    bw.close();
    br.close();
  }
}
```