## 🌵 문제 정보
짐 챙기는 숌 <br>
[🚗 1817](https://www.acmicpc.net/problem/1817)

## 🌵 문제 정의
숌은 짐을 챙겨서 겨울캠프에서 집으로 가려고 한다. 근데 숌은 공부를 많이 하러 캠프에 온 것이기 때문에 책을 엄청나게 많이 가지고 왔다. 숌은 이 책을 방에 탑처럼 쌓아 놨다.

숌은 책을 박스에 차곡차곡 넣어서 택배로 미리 보내려고 한다. 책은 탑처럼 차곡차곡 쌓여있기 때문에, 차례대로 박스에 넣을 수밖에 없다.

각각의 책은 무게가 있다. 그리고 박스는 최대 넣을수 있는 무게가 있다. 숌이 필요한 박스의 개수의 최솟값을 구하는 프로그램을 작성하시오.
`input` 첫째 줄에 책의 개수 N과 박스에 넣을 수 있는 최대 무게 M이 주어진다. N은 0보다 크거나 같고 50보다 작거나 같은 정수이고, M은 1,000보다 작거나 같은 자연수이다. N이 0보다 큰 경우 둘째 줄에 책의 무게가 공백을 사이에 두고 주어진다. 책의 무게는 M보다 작거나 같은 자연수이다.<br>
- 6 10
  5 5 5 5 5 5

`output` 첫째 줄에 필요한 박스의 개수의 최솟값을 출력한다.<br>
- 3

## 🌵 알고리즘 설계

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        
        if (N == 0) {
            System.out.println(0);
            return;
        }

        int[] weights = new int[N];
        
        for (int i = 0; i < N; i++) {
            weights[i] = scanner.nextInt();
        }

        int boxCount = 1;
        int currentWeight = 0; 
        
        for (int i = 0; i < N; i++) {
            if (currentWeight + weights[i] > M) {
                boxCount++;
                currentWeight = weights[i];
            } else {
                currentWeight += weights[i];
            }
        }
        
        System.out.println(boxCount);

        scanner.close();
    }
}


```