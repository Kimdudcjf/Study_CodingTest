## 🌵 문제 정보
분해합 <br>
[🚗 2231](https://www.acmicpc.net/problem/2231)

## 🌵 문제 정의

어떤 자연수 N이 있을 때, 그 자연수 N의 분해합은 N과 N을 이루는 각 자리수의 합을 의미한다 <br>

어떤 자연수 M의 분해합이 N인 경우, M을 N의 생성자라 한다 <br>

예를 들어, 245의 분해합은 256(=245+2+4+5)이 된다 <br>

따라서 245는 256의 생성자가 된다 <br>

물론, 어떤 자연수의 경우에는 생성자가 없을 수도 있다 <br>

반대로, 생성자가 여러 개인 자연수도 있을 수 있다 <br>

자연수 N이 주어졌을 때, N의 가장 작은 생성자를 구해내는 프로그램을 작성하시오

`input`
- 첫째 줄에 자연수 N(1 ≤ N ≤ 1,000,000)이 주어진다


- 216

`output`
- 첫째 줄에 답을 출력한다, 생성자가 없는 경우에는 0을 출력


- 198

## 🌵 알고리즘 설계


1. Scanner 사용
```java
import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int N = Integer.parseInt(sc.nextLine());

    int result = 0;
    
    for(int i = 0; i < N; i++) {
      int number = i;
      int sum = 0; 
    
      while(number != 0) {
          sum += number % 10;
          number /= 10;
      }
    
      if(sum + i == N) {
          result = i;
          break;
      }
    
    }

    System.out.print(result);

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
        
        int N = Integer.parseInt(br.readLine());

        int result = 0;

        for(int i = 0; i < N; i++) {
            int number = i;
            int sum = 0;

            while(number != 0) {
                sum += number % 10;
                number /= 10;
            }

            if(sum + i == N) {
                result = i;
                break;
            }

        }

        bw.write(result + " ");

        bw.flush();
        bw.close();
        br.close();
    }
}
```