## 🌵 문제 정보
평균 <br>
[🚗 1546](https://www.acmicpc.net/problem/1546)

## 🌵 문제 정의
세준이는 점수를 조작해서 집에 가져가기로 했다 <br>

세준이의 점수 중 최댓값 M <br>

모든 점수를 점수 / M * 100으로 고쳤다 <br>

예를 들어, 세준이의 최고점이 70이고, 수학점수가 50이었으면 <br>

수학점수는 50/70*100이 되어 71.43점이 된다 <br>

세준이의 성적을 위의 방법대로 새로 계산했을 때, 새로운 평균을 구하는 프로그램을 작성하시오.


`input` <br>
- 첫번째 입력에 시험 본 과목의 개수 N이 주어진다, 이 값은 1000보다 작거나 같다
- 둘째 줄에 세준이의 현재 성적이 주어진다, <br>
  이 값은 100보다 작거나 같은 음이 아닌 정수이고, 적어도 하나의 값은 0보다 크다.


- 3 <br>
  40 80 60

`output` <br>
- 새로운 평균을 출력한다


- 75.0

## 🌵 알고리즘 설계

과목 수를 입력받아 배열의 크기 지정 <br>

점수를 입력받아 배열에 저장하고 배열을 순회하며 최대값을 찾아 max에 저장 <br>

배열을 순회하며 세준이가 점수를 조작하는 방식으로 fakeScore를 계산해서 sum에 fakeScore의 총 합을 저장 <br>

sum을 과목 수 로 나누어서 평균을 출력

1. Scanner 사용
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 과목의 수
        int N = sc.nextInt();

        // 원래 점수와 조작한 점수를 저장할 배열
        double[] score = new double[N];

        // 원래 점수의 최고점
        double max = 0;
        // 조작한 점수의 총 점
        double sum = 0;

        for (int i = 0; i < N; i++) {
            score[i] = sc.nextDouble();

            if (score[i] > max) {
                max = score[i];
            }
        }

        for (int i = 0; i < N; i++) {
            double fakeScore = (score[i] / max) * 100;
            sum += fakeScore;
        }

        // 평균
        double avg = sum / N;

        System.out.println(avg);

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

        int N = Integer.parseInt(br.readLine());

        double[] score = new double[N];

        double max = 0;
        double sum = 0;

        StringTokenizer str = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            score[i] = Double.parseDouble(str.nextToken());

            if (score[i] > max) {
                max = score[i];
            }
        }

        for (int i = 0; i < N; i++) {
            double fakeScore = (score[i] / max) * 100;
            sum += fakeScore;
        }

        double avg = sum / N;

        //bw.write()는 문자열을 받기 때문에 avg 변수를 소수점 두 자리까지 포맷팅하여 문자열로 변환
        bw.write(String.format("%.2f", avg));

        br.close();
        bw.flush();
        bw.close();
    }
}
```
