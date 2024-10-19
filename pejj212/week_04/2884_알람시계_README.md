## 🌵 문제 정보
알람시계 (브론즈3) <br>
[🚗 2884](https://www.acmicpc.net/problem/2884)

## 🌵 문제 정의
`input` <br>
첫째 줄에 두 정수 H와 M이 주어진다. (0 ≤ H ≤ 23, 0 ≤ M ≤ 59) 그리고 이것은 현재 상근이가 설정한 알람 시간 H시 M분을 의미한다.

입력 시간은 24시간 표현을 사용한다. 24시간 표현에서 하루의 시작은 0:0(자정)이고, 끝은 23:59(다음날 자정 1분 전)이다. 시간을 나타낼 때, 불필요한 0은 사용하지 않는다.
-  0 30

`output` <br>
- 23 45

## 🌵 알고리즘 설계

```java
public class Main {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);

        int H=sc.nextInt();
        int M=sc.nextInt();

        if(M<45) {
            H--;
            M=60-(45-M);

            if(H<0)
                H=23;

            System.out.println(H + " " + M);
        }
        else {
            System.out.println(H + " " + (M-45));
        }
    }
}
```

## 🌵 추가