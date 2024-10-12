## 🌵 문제 정보
최소+최대 (브론즈3) <br>
[🚗 10818](https://www.acmicpc.net/problem/10818)

## 🌵 문제 정의
`input` <br>
-  5 <br>
   20 10 35 30 7

`output` <br>
- 7 35

## 🌵 알고리즘 설계

```java
public class Main {
    public static void main(String[] args) {
        //N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int arr[] = new int[N];

        for(int i=0; i<N; i++) {
            arr[i]=sc.nextInt();
        }

        Arrays.sort(arr);

        System.out.println(arr[0]+" "+arr[arr.length-1]);
    }
}
```
1. 정수를 배열에 저장
2. Arrays.sort 이용
3. 배열은 마지막 요소가 전체 길이보다 1 작으므로 최대값을 구할 때 요소를 arr.length-1로 설정

## 🌵 추가