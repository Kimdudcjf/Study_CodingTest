## 🌵 문제 정보
바구니 뒤집기 <br>
[🚗 10811](https://www.acmicpc.net/problem/10811)

## 🌵 문제 정의

도현이는 바구니를 총 N개 가지고 있고, 각각의 바구니에는 1번부터 N번까지 번호가 순서대로 적혀져 있다 <br>

도현이는 M번 바구니의 순서를 역순으로 만들려고 한다 <br>

도현이는 한 번 순서를 역순으로 바꿀 때, 순서를 역순으로 만들 범위를 정하고, <br>

그 범위에 들어있는 바구니의 순서를 역순으로 만든다 <br>

바구니의 순서를 어떻게 바꿀지 주어졌을 때, M번 바구니의 순서를 역순으로 만든 다음, <br>

바구니에 적혀있는 번호를 가장 왼쪽 바구니부터 출력하는 프로그램을 작성하시오 <br>

`input` <br>

- 첫번째 입력에는 N (1 ≤ N ≤ 100)과 M (1 ≤ M ≤ 100)이 주어진다

- 두번째 입력부터는 입력된 M의 수만큼 입력을 받는다

- 바구니의 순서를 역순으로 만드는 방법은 i, j로 나타내고, <br>
  왼쪽으로부터 i번째 바구니부터 j번째 바구니의 순서를 역순으로 만든다는 뜻이다. (1 ≤ i ≤ j ≤ N)


- 5 4 <br>
  1 2 <br>
  3 4 <br>
  1 4 <br>
  2 2

`output` <br>
- 모든 순서를 바꾼 다음에, 가장 왼쪽에 있는 바구니부터 출력한다.


- 3 4 1 2 5


## 🌵 알고리즘 설계

1차원 배열 문제 <br>

첫번째 입력에 N과 M 이 주어지고, <br>

입력한 M의 수에 따라 M개의 줄에 걸쳐서 공을 교환할 방법을 입력 받음 <br>

Index i 부터 j 까지 들어있는 값을 역순으로 교환하는데 이걸 입력된 M의 수만큼 i와 j를 받아 반복함 <br>

⚡️temp라는 빈 공간의 변수에 arr[I] 값을 넣어주고 <br>

arr[I] 이 빈 공간이 됐을 때 그자리에 arr[J] 값을 넣어 주고, <br>

arr[J] 이 빈공간이 됬을때 temp 값을 넣어 값을 순환시키는 걸 i부터 j까지 역순이 될때까지 반복<br>

1. Scanner 사용
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // n개의 바구니
        int n = sc.nextInt();
        // 시행 횟수
        int m = sc.nextInt();

        int temp;

        int arr[] = new int[n];
        // Index는 0부터고 바구니는 1부터라 +1
        for(int i=0; i<n; i++) {
            arr[i] = i + 1;
        }

        for(int i=0; i<m; i++) {
            //Index I
            int I = sc.nextInt() - 1;
            //Index j
            int J = sc.nextInt() - 1;

            // I와 J 사이의 바구니 순서를 뒤집기
            while(I < J) {
                temp = arr[I];
                arr[I] = arr[J];
                arr[J] = temp;
                I++;
                J--;
            }
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }        
        /*
        for(int i=0; i<arr.length; i++) {
          System.out.print(arr[i]+" ");
        }
        */

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
	public static void main(String[] args) throws IOException{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            
            StringTokenizer str = new StringTokenizer(br.readLine());
		
            int n = Integer.parseInt(str.nextToken());
            int m = Integer.parseInt(str.nextToken()); 
            
            int temp;
            
            int arr[] = new int[n];
            for(int i=0; i<n; i++) {
              arr[i] = i + 1;
            }
            
            for(int i=0; i<m; i++) {
              str = new StringTokenizer(br.readLine());
              
              int I = Integer.parseInt(str.nextToken()) - 1;
              int J = Integer.parseInt(str.nextToken()) - 1;
            
              while(I < J) {
                  temp = arr[I];
                  arr[I] = arr[J];
                  arr[J] = temp;
                  I++;
                  J--;
              }
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