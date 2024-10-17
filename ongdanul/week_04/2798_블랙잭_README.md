## 🌵 문제 정보
블랙잭 <br>
[🚗 2798](https://www.acmicpc.net/problem/2798)

## 🌵 문제 정의

카지노에서 제일 인기 있는 게임 블랙잭의 규칙은 상당히 쉽다 <br>

카드의 합이 21을 넘지 않는 한도 내에서, 카드의 합을 최대한 크게 만드는 게임이다 <br>

김정인 버전의 블랙잭에서 각 카드에는 양의 정수가 쓰여 있다 <br>

그 다음, 딜러는 N장의 카드를 모두 숫자가 보이도록 바닥에 놓는다 <br>

그런 후에 딜러는 숫자 M을 크게 외친다 <br>

이제 플레이어는 제한된 시간 안에 N장의 카드 중에서 3장의 카드를 골라야 한다 <br>

블랙잭 변형 게임이기 때문에, 플레이어가 고른 카드의 합은 M을 넘지 않으면서 M과 최대한 가깝게 만들어야 한다 <br>

N장의 카드에 써져 있는 숫자가 주어졌을 때, M을 넘지 않으면서 M에 최대한 가까운 카드 3장의 합을 구해 출력하시오

`input`
- 첫째 줄에 카드의 개수 N(3 ≤ N ≤ 100)과 M(10 ≤ M ≤ 300,000)이 주어진다
- 둘째 줄에는 카드에 쓰여 있는 수가 주어지며, 이 값은 100,000을 넘지 않는 양의 정수이다 
- 합이 M을 넘지 않는 카드 3장을 찾을 수 있는 경우만 입력으로 주어진다


- 5 21 <br>
  5 6 7 8 9

`output`
- 첫째 줄에 M을 넘지 않으면서 M에 최대한 가까운 카드 3장의 합을 출력


- 21

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

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int result = search(arr, N, M);
        System.out.println(result);

        sc.close();
    }

    // 탐색
    static int search(int[] arr, int N, int M) {
        int result = 0;

        // 배열 정렬
        Arrays.sort(arr);

        for (int i = 0; i < N - 2; i++) {
            // 첫 번째 카드가 M보다 크면 더 이상 볼 필요 없음
            if (arr[i] > M) break;

            for (int j = i + 1; j < N - 1; j++) {
                int sumTwo = arr[i] + arr[j];

                // 두 카드의 합이 M보다 크면 더 이상 볼 필요 없음
                if (sumTwo > M) break;

                for (int k = j + 1; k < N; k++) {
                    int temp = sumTwo + arr[k];

                    // M과 세 카드의 합이 같다면 바로 return
                    if (temp == M) return temp;

                    // result 갱신
                    if (result < temp && temp < M) {
                        result = temp;
                    }

                    // 세 카드의 합이 M을 넘으면 더 이상 탐색할 필요 없음
                    if (temp > M) break;
                }
            }
        }
        return result;
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

        int[] arr = new int[N];

        str = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(str.nextToken());
        }

        int result = search(arr, N, M);
        bw.write(result + " ");

        bw.flush();
        bw.close();
        br.close();
    }

    // 탐색
    static int search(int[] arr, int N, int M) {
        int result = 0;

        // 배열 정렬
        Arrays.sort(arr);

        for (int i = 0; i < N - 2; i++) {
            // 첫 번째 카드가 M보다 크면 더 이상 볼 필요 없음
            if (arr[i] > M) break;

            for (int j = i + 1; j < N - 1; j++) {
                int sumTwo = arr[i] + arr[j];

                // 두 카드의 합이 M보다 크면 더 이상 볼 필요 없음
                if (sumTwo > M) break;

                for (int k = j + 1; k < N; k++) {
                    int temp = sumTwo + arr[k];

                    // M과 세 카드의 합이 같다면 바로 return
                    if (temp == M) return temp;

                    // result 갱신
                    if (result < temp && temp < M) {
                        result = temp;
                    }

                    // 세 카드의 합이 M을 넘으면 더 이상 탐색할 필요 없음
                    if (temp > M) break;
                }
            }
        }
        return result;
    }
}
```