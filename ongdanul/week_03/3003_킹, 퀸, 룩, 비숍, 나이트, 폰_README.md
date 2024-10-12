## 🌵 문제 정보
킹, 퀸, 룩, 비숍, 나이트, 폰 <br>
[🚗 3003](https://www.acmicpc.net/problem/3003)

## 🌵 문제 정의

체스는 총 16개의 피스를 사용하며, 킹 1개, 퀸 1개, 룩 2개, 비숍 2개, 나이트 2개, 폰 8개로 구성 <br>

흰색 피스의 개수가 주어졌을 때, 몇 개를 더하거나 빼야 올바른 세트가 되는지 구하는 프로그램을 작성

`input` <br>
- 첫째 줄에 동혁이가 찾은 흰색 킹, 퀸, 룩, 비숍, 나이트, 폰의 개수가 주어진다 <br>
  0이 값은 0보다 크거나 같고 10보다 작거나 같은 정수


- 0 1 2 2 2 7

`output` <br>
- 첫째 줄에 입력에서 주어진 순서대로 몇 개의 피스를 더하거나 빼야 되는지를 출력 <br>
  만약 수가 양수라면 동혁이는 그 개수 만큼 피스를 더해야 하는 것 <br>
  음수라면 제거해야 하는 것


- 1 0 0 0 0 1

## 🌵 알고리즘 설계

킹, 퀸, 룩, 비숍, 나이트, 폰 의 초기값을 배열로 선언하여, <br>

입력받은 각 수들을 각 체스말에 맞추어 해당 Index에 선언된 수와 비교하고 출력한다

1. Scanner 사용
```java
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int chess[] = {1,1,2,2,2,8};
    int input[] = new int[6];
    
    for(int i =0; i<chess.length; i++) {
      input[i] = sc.nextInt();
    }
    
    for(int i =0; i<chess.length; i++) {
      System.out.print(chess[i]-input[i]+" ");
    }

  }
}
```

<br>

2.Stream 사용
```java
import java.io.*;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int chess[] = {1,1,2,2,2,8};
    int input[] = new int[6];

    StringTokenizer str = new StringTokenizer(br.readLine(), " ");
    for(int i =0; i<chess.length; i++) {
      input[i] =  Integer.parseInt(str.nextToken());
    }

    for(int i =0; i<chess.length; i++) {
      bw.write((chess[i]-input[i])+" ");
    }

    bw.flush();
    bw.close();
    br.close();
  }
}
```