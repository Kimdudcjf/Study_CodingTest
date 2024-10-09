## 🌵 문제 정보
약수 (브론즈1) <br>
[🚗 1037](https://www.acmicpc.net/problem/1037)

## 🌵 문제 정의
`input` <br>
첫째 줄에 N의 진짜 약수의 개수가 주어진다. 이 개수는 50보다 작거나 같은 자연수이다. 둘째 줄에는 N의 진짜 약수가 주어진다. 1,000,000보다 작거나 같고, 2보다 크거나 같은 자연수이고, 중복되지 않는다.
-  6 <br>
   3 4 2 12 6 8

`output` <br>
- 24

## 🌵 알고리즘 설계

```java
public class Main {
    public static void main(String[] args) {
        /*
         * 양수 A가 N의 진짜 약수가 되려면, N이 A의 배수이고, A가 1과 N이 아니어야 한다.
         * 어떤 수 N의 진짜 약수가 모두 주어질 때, N을 구하는 프로그램을 작성하시오.
         */

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); //진짜 약수의 개수

        int arr[] = new int[N];

        for(int i=0; i<N; i++) {
            arr[i] = sc.nextInt();
        }

        if(arr.length == 1) {
            System.out.println(arr[0]*arr[0]);
        }
        else {
            int max=Arrays.stream(arr).max().orElse(0);
            int min=Arrays.stream(arr).min().orElse(0);
            System.out.println(max*min);
        }
    }
}

```
진짜 약수는 N의 약수들 중에서 1과 자기 자신(N)만 제외한 약수들 <br>
진짜 약수 중 가장 작은 수 x 가장 큰 수를 곱해서 수를 구한다
진짜 약수가 한 개라면 그 수의 제곱이 N이라는 뜻

## 🌵 추가