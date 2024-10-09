## 🌵 문제 정보
커트라인 <br>
[🚗 25305](https://www.acmicpc.net/problem/25305)

## 🌵 문제 정의

2022 연세대학교 미래캠퍼스 슬기로운 코딩생활에 N명의 학생들이 응시했다

이들 중 점수가 가장 높은 k명은 상을 받을 것이다. 이 때, 상을 받는 커트라인이 몇 점인지 구하라

커트라인이란 상을 받는 사람들 중 점수가 가장 가장 낮은 사람의 점수를 말한다

`input` <br>
- 첫째 입력에는 응시자의 수 N과 상을 받는 사람의 수 k가 공백을 사이에 두고 주어진다
- 둘째 줄에는 각 학생의 점수 x가 공백을 사이에 두고 주어진다


- 5 2 <br>
  100 76 85 93 98

`output` <br>
- 상을 받는 커트라인을 출력


- 98

## 🌵 알고리즘 설계

1. Scanner 사용
```java
import java.util.Scanner;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int K = sc.nextInt();
    int[] arr = new int[N];

    for (int i = 0; i < N; i++) {
        arr[i] = sc.nextInt();
    }

    Arrays.sort(arr);
    
    System.out.print(arr[N-K] + " ");
    
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
    int N = Integer.parseInt(str.nextToken());
    int K = Integer.parseInt(str.nextToken());
    int[] arr = new int[N];

    str = new StringTokenizer(br.readLine());
    for (int i = 0; i < N; i++) {
      arr[i] = Integer.parseInt(str.nextToken());
    }

    Arrays.sort(arr);

    bw.write(arr[N-K] + " ");

    bw.flush();
    bw.close();
    br.close();
  }
}
```