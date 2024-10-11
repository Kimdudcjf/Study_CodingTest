## 🌵 문제 정보
영수증 (브론즈4) <br>
[🚗 25304](https://www.acmicpc.net/problem/25304)

## 🌵 문제 정의
`input` <br>
-  260000 <br>
   4 <br>
   20000 5<br>
   30000 2<br>
   10000 6<br>
   5000 8

`output` <br>
- Yes

## 🌵 알고리즘 설계

```java
public class Main {
    public static void main(String[] args) {
        /*
         * 준원이는 저번 주에 살면서 처음으로 코스트코를 가 봤다. 정말 멋졌다. 그런데, 몇 개 담지도 않았는데 수상하게 높은 금액이 나오는 것이다!
         * 준원이는 영수증을 보면서 정확하게 계산된 것이 맞는지 확인해보려 한다.
         * 영수증에 적힌,
         * 구매한 각 물건의 가격과 개수
         * 구매한 물건들의 총 금액
         * 을 보고, 구매한 물건의 가격과 개수로 계산한 총 금액이 영수증에 적힌 총 금액과 일치하는지 검사해보자.
         */

        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int N = sc.nextInt();

        int c = 0;
        for(int i=0; i<N; i++) {
            int a= sc.nextInt();
            int b=sc.nextInt();

            c += (a*b);
        }

        if(c == X)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}

```

## 🌵 추가