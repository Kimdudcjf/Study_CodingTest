[👉 15552번: 빠른 A+B](https://www.acmicpc.net/problem/15552)

## 문제 정의
<details><summary> 문제
</summary>

#### 본격적으로 for문 문제를 풀기 전에 주의해야 할 점이 있다. 
입출력 방식이 느리면 여러 줄을 입력받거나 출력할 때 시간초과가 날 수 있다는 점이다.
Java를 사용하고 있다면, Scanner와 System.out.println 대신 BufferedReader와 BufferedWriter를 사용할 수 있다. 
BufferedWriter.flush는 맨 마지막에 한 번만 하면 된다.
또한 입력과 출력 스트림은 별개이므로, 테스트케이스를 전부 입력받아서 저장한 뒤 전부 출력할 필요는 없다. 
테스트케이스를 하나 받은 뒤 하나 출력해도 된다.
자세한 설명 및 다른 언어의 경우는 이 글에 설명되어 있다.
[이 블로그](https://www.acmicpc.net/blog/view/55) 글에서 BOJ의 기타 여러 가지 팁을 볼 수 있다.
</details>

`input`
- 첫 줄에 테스트케이스의 개수 T가 주어진다. T는 최대 1,000,000이다.
- 다음 T줄에는 각각 두 정수 A와 B가 주어진다. A와 B는 1 이상, 1,000 이하이다.

`output`
- 각 테스트케이스마다 A+B를 한 줄에 하나씩 순서대로 출력한다.

## 코드

```java
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        int A, B;
        String str;

        for (int i = 0; i < T; i++) {
            str = br.readLine();
            A = Integer.parseInt(str.split(" ")[0]);
            B = Integer.parseInt(str.split(" ")[1]);
            bw.write(A + B + "\n");
        }
        bw.flush();
    }
}
```

## 메모
계속되는 시간 초과로 다른 사람들의 풀이를 참고하여 풀었다.