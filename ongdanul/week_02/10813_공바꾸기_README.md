

## 🌵 문제 정보
공 바꾸기 <br>
[🚗 10813](https://www.acmicpc.net/problem/10813)

## 🌵 문제 정의

도현이는 바구니를 총 N개 가지고 있고, <br>
각각의 바구니에는 1번부터 N번까지 번호가 매겨져 있다 <br>
<br>
바구니에는 공이 1개씩 들어있고, <br>
처음에는 바구니에 적혀있는 번호와 같은 번호가 적힌 공이 들어있다 <br>

도현이는 앞으로 M번 공을 바꾸려고 한다 <br>

도현이는 공을 바꿀 바구니 2개를 선택하고, <br>
두 바구니에 들어있는 공을 서로 교환한다

공을 어떻게 바꿀지가 주어졌을 때, <br>
M번 공을 바꾼 이후에 각 바구니에 어떤 공이 들어있는지 구하시오

`input` <br>
- 첫째 줄에 N (1 ≤ N ≤ 100)과 M (1 ≤ M ≤ 100)이 주어진다.

- 둘째 줄부터 M개의 줄에 걸쳐서 공을 교환할 방법이 주어진다. <br>
  각 방법은 두 정수 i j로 이루어져 있으며, <br>
  i번 바구니와 j번 바구니에 들어있는 공을 교환한다는 뜻이다. <br>
  (1 ≤ i ≤ j ≤ N)
- 도현이는 입력으로 주어진 순서대로 공을 교환한다.
  <br><br>

- 5 4 <br>
  1 2 <br>
  3 4 <br>
  1 4 <br>
  2 2

`output` <br>
- 1번 바구니부터 N번 바구니에 들어있는 공의 번호를 공백으로 구분해 출력
  <br><br>
- 3 1 4 2 5

## 🌵 알고리즘 설계

1차원 배열 문제 <br>

첫번째 입력에 N과 M 이 주어지고, <br>

입력한 M의 수에 따라 M개의 줄에 걸쳐서 공을 교환할 방법을 입력 받음 <br>

i 와 j 에 들어있는 값을 서로 교환 <br>

⚡️temp라는 빈 공간의 변수에 arr[I] 값을 넣어주고 <br>

arr[I] 이 빈 공간이 됐을 때 그자리에 arr[J] 값을 넣어 주고, <br>

arr[J] 이 빈공간이 됬을때 temp 값을 넣어 값을 순환<br>

1. Scanner 사용

```java
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
  
    //바구니의 수
    int N = sc.nextInt();
    int[] arr = new int[N];
    
    //공을 바꿀 수
    int M = sc.nextInt();

    //바꾸기 위해 임시 저장할 곳
    int temp;

    //배열의 Index는 0부터 시작하지만 바구니는 1부터기 때문에 +1
    for(int i = 0; i < arr.length; i++) {
      arr[i] = i + 1;
    }
    
    for(int i = 0; i < M; i++) {
      //Index는 0부터니까 -1
      int I = sc.nextInt() - 1;
      int J = sc.nextInt() - 1;

      temp = arr[I];
      arr[I] = arr[J];
      arr[J] = temp;
    }
  
    for (int i : arr) {
        System.out.print(i + " ");
    }
    /* 아래와 같음
    for(int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    */
  }
}
```

<br>

2.Stream 사용

```java
import java.io.*;
        import java.util.StringTokenizer;

public class Main {
  //readLine() 시 예외처리가 반드시 필요
  public static void main(String[] args) throws IOException{

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    // StringTokenizer로 N과 M을 공백으로 구분
    /*
    입력은 readLine()를 사용, 리턴 값이 String으로 고정
    ⚡️다른 타입으로 입력을 받고자 한다면 반드시 형변환이 필요하다.
    */
    StringTokenizer st = new StringTokenizer(br.readLine());
    //바구니의 수
    int N = Integer.parseInt(st.nextToken());
    int arr[] = new int[N];
    //공을 바꿀 수
    int M = Integer.parseInt(st.nextToken());
    //바꾸기 위해 임시 저장할 곳
    int temp;
    /*
    nextToken()를 쓰면 readLine()을 통해 입력 받은 값을 
    공백 단위로 구분하여 순서대로 호출
    */

    //배열의 Index는 0부터 시작하지만 바구니는 1부터기 때문에 +1
    for(int i = 0; i < arr.length; i++) {
      arr[i] = i + 1;                     
    }
    
    for(int i = 0; i < M; i++) {
      st = new StringTokenizer(br.readLine());
      //Index는 0부터니까 -1
      int I = Integer.parseInt(st.nextToken()) - 1;
      int J = Integer.parseInt(st.nextToken()) - 1;

      temp = arr[I];
      arr[I] = arr[J];
      arr[J] = temp;
    }
    
    for(int i = 0; i <arr.length; i++) {
      bw.write(arr[i] + " ");
    }

    br.close();
    bw.flush();
    bw.close();
  }
}
```
