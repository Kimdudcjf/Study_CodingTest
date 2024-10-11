## 🌵 문제 정보
듣보잡 <br>
[🚗 1764](https://www.acmicpc.net/problem/1764)

## 🌵 문제 정의

김진영이 듣도 못한 사람의 명단과, 보도 못한 사람의 명단이 주어질 때, <br>

듣도 보도 못한 사람의 명단을 구하는 프로그램을 작성하시오

`input` <br>
- 첫째 줄에 듣도 못한 사람의 수 N, 보도 못한 사람의 수 M이 주어진다
- 이어서 둘째 줄부터 N개의 줄에 걸쳐 듣도 못한 사람의 이름과, <br> 
  N+2째 줄부터 보도 못한 사람의 이름이 순서대로 주어진다 <br>
  이름은 띄어쓰기 없이 알파벳 소문자로만 이루어지며, 그 길이는 20 이하이다 <br>
  N, M은 500,000 이하의 자연수이다
- 듣도 못한 사람의 명단에는 중복되는 이름이 없으며, 보도 못한 사람의 명단도 마찬가지이다


- 3 4 <br>
  ohhenrie <br>
  charlie <br>
  baesangwook <br>
  obama <br>
  baesangwook <br>
  ohhenrie <br>
  clinton

`output` <br>
- 듣보잡의 수와 그 명단을 사전순으로 출력


- 2 <br>
  baesangwook <br>
  ohhenrie

## 🌵 알고리즘 설계

1. Scanner 사용
```java
import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String input = sc.nextLine();
    String[] parts = input.split(" ");
    int N = Integer.parseInt(parts[0]);
    int M = Integer.parseInt(parts[1]);
    
    /*
    int N = sc.nextInt();
    int M = sc.nextInt();
    sc.nextLine();
    */

    HashSet<String> people  = new HashSet<>();
    ArrayList<String> list = new ArrayList<>();

    for (int i = 0; i < N; i++) {
      people.add(sc.nextLine());
    }

    for (int i = 0; i < M; i++) {
      String st = sc.nextLine();
      if (people.contains(st)) {
        list.add(st);
      }
    }

    Collections.sort(list);

    System.out.println(list.size());

    for (String s : list) {
      System.out.println(s);
    }
    
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
    int M = Integer.parseInt(str.nextToken());

    HashSet<String> people  = new HashSet<>();
    ArrayList<String> list = new ArrayList<>();

    for (int i = 0; i < N; i++) {
      people.add(br.readLine());
    }

    for (int i = 0; i < M; i++) {
      String st = br.readLine();
      if (people.contains(st)) {
        list.add(st);
      }
    }

    Collections.sort(list);

    bw.write(list.size() + "\n");

    for (String s : list) {
      bw.write(s + "\n");
    }

    bw.flush();
    bw.close();
    br.close();
  }
}
```