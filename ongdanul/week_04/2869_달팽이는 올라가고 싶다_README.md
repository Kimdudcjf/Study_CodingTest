## 🌵 문제 정보
달팽이는 올라가고 싶다 <br>
[🚗 2869](https://www.acmicpc.net/problem/2869)

## 🌵 문제 정의

땅 위에 달팽이가 있다. 이 달팽이는 높이가 V미터인 나무 막대를 올라갈 것이다

달팽이는 낮에 A미터 올라갈 수 있다. 하지만, 밤에 잠을 자는 동안 B미터 미끄러진다

또, 정상에 올라간 후에는 미끄러지지 않는다

달팽이가 나무 막대를 모두 올라가려면, 며칠이 걸리는지 구하는 프로그램을 작성하시오

`input`
- 첫째 줄에 세 정수 A, B, V가 공백으로 구분되어서 주어진다 (1 ≤ B < A ≤ V ≤ 1,000,000,000)


- 2 1 5

`output`
- 첫째 줄에 달팽이가 나무 막대를 모두 올라가는데 며칠이 걸리는지 출력


- 4

## 🌵 알고리즘 설계

A, B, V가 주어졌을 때 '정상에 올라간 후에는 미끄러지지 않는다'는 조건을 적용, <br>

A 일 때 나머지 블럭이 남아있다면 하루가 더 소요 <br>

B 은 항상 A 보다 횟수가 하나 작다

1. Scanner 사용
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int V = sc.nextInt();

        //(막대 길이 - 미끄러진 길이) / (올라간 길이 - 미끄러진 길이)
        int day = (V - B) / (A - B);

        //나머지가 있을 경우 (다 못올라간 경우)
        if ((V - B) % (A - B) != 0) {
            day++;
        }
        System.out.println(day);

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

        int A = Integer.parseInt(str.nextToken());
        int B = Integer.parseInt(str.nextToken());
        int V = Integer.parseInt(str.nextToken());

        //(막대 길이 - 미끄러진 길이) / (올라간 길이 - 미끄러진 길이)
        int day = (V - B) / (A - B);

        //나머지가 있을 경우 (다 못올라간 경우)
        if ((V - B) % (A - B) != 0) {
            day++;
        }
        
        bw.write(day + " ");

        bw.flush();
        bw.close();
        br.close();
    }
}
```