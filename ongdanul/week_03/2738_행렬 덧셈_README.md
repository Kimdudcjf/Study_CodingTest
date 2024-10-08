## 🌵 문제 정보
행렬 덧셈 <br>
[🚗 2738](https://www.acmicpc.net/problem/2738)

## 🌵 문제 정의

N*M크기의 두 행렬 A와 B가 주어졌을 때, 두 행렬을 더하는 프로그램을 작성하시오

`input` <br>
- 첫째 입력에 행렬의 크기 N 과 M이 주어진다
- 두번째 입력부터 N개의 줄에 행렬 A의 원소 M개가 차례대로 주어진다
- 이어서 N개의 줄에 행렬 B의 원소 M개가 차례대로 주어진다 <br>
  N과 M은 100보다 작거나 같고, 행렬의 원소는 절댓값이 100보다 작거나 같은 정수이다


- 3 3 <br>
  1 1 1 <br
  2 2 2 <br
  0 1 0 <br
  3 3 3 <br
  4 4 4 <br
  5 5 100

`output` <br>
- 첫째 줄부터 N개의 줄에 행렬 A와 B를 더한 행렬을 출력한다


- 4 4 4 <br>
  6 6 6 <br>
  5 6 100

## 🌵 알고리즘 설계

크기가 [N] [M]인 INT형 배열을 만들고 입력받는 원소들을 저장, <br>

두 번째로 입력받을 때 같은 인덱스에 있는 수를 더해서 출력한다

1. Scanner 사용
```java
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int M = sc.nextInt();
    int[][] arr = new int[N][M];

    for (int i = 0; i < N; i++) {
      for (int j = 0; j < M; j++) {
        arr[i][j] = sc.nextInt();
      }
    }

    for (int i = 0; i < N; i++) {
      for (int j = 0; j < M; j++) {
        if (j == M - 1) {
          System.out.print(arr[i][j] + sc.nextInt());
        } else {
          System.out.print((arr[i][j] + sc.nextInt()) + " ");
        }
      }
      System.out.println();
    }
    
    sc.close();
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

    StringTokenizer str = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(str.nextToken());
    int M = Integer.parseInt(str.nextToken());
    int[][] arr = new int[N][M];

    for (int i = 0; i < N; i++) {
      str = new StringTokenizer(br.readLine());
      for (int j = 0; j < M; j++) {
        arr[i][j] = Integer.parseInt(str.nextToken());
      }
    }

    for (int i = 0; i < N; i++) {
      str = new StringTokenizer(br.readLine());
      for (int j = 0; j < M; j++) {
        bw.write(arr[i][j] + Integer.parseInt(str.nextToken()) + " ");
      }
    }

    bw.flush();
    bw.close();
    br.close();
  }
}
```