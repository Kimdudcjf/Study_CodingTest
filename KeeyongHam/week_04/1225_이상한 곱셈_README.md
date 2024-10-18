## 🌵 문제 정보
이상한 곱셈 <br>
[🚗 1225](https://www.acmicpc.net/problem/1225)

## 🌵 문제 정의

A×B를 계산하다 지겨워진 형택이는 A×B를 새로운 방법으로 정의하려고 한다.

A에서 한 자리를 뽑고 × B에서 임의로 한 자리를 뽑아 곱한다.

의 가능한 모든 조합 (A가 n자리, B가 m자리 수라면 총 가능한 조합은 n×m개)을 더한 수로 정의하려고 한다.

예를 들어 121×34는

1×3 + 1×4 + 2×3 + 2×4 + 1×3 + 1×4 = 28

이 된다. 이러한 형택이의 곱셈 결과를 구하는 프로그램을 작성하시오.

`input` <br>

* 첫째 줄에 A와 B가 주어진다. 주어지는 두 수는 모두 10,000자리를 넘지 않는 음이 아닌 정수이다. 수가 0인 경우에는 0만 주어지며, 그 외의 경우 수는 0으로 시작하지 않는다.
* 123 45



`output` <br>
* 첫째 줄에 형택이의 곱셈 결과를 출력한다.


* 54

## 🌵 알고리즘 설계

1. 입력받은 두 수를 배열의 형태로 저장한다.
2. A 크기 만큼 반복하고 내부에 B 크기 만큼 반복한다.
3. 내부 A[i] + B[j] 만큼 곱하고 그값을 저장한다
4. 저장한 값을 출력

```java
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] A = sc.next().split("");
        String[] B = sc.next().split("");

        long sum = 0;

        for (int i = 0; i < A.length; i++) {
            int AtoInt = Integer.parseInt(A[i]);
            for (int j = 0; j < B.length; j++) {
                int BToInt = Integer.parseInt(B[j]);
                sum += (long) AtoInt * BToInt;
            }
        }

        System.out.println(sum);
    }
}
```