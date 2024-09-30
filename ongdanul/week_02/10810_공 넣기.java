import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //바구니의 수
        int N = sc.nextInt();
        int[] arr = new int[N];

        //넣을 공의 수
        int M = sc.nextInt();

        for (int i = 0; i < M; i++) {
            int I = sc.nextInt();
            int J = sc.nextInt();
            int K = sc.nextInt();

            //배열의 Index는 0부터 시작하기 때문에 -1
            for (int j = I - 1; j < J; j++) {
                arr[j] = K;
            }
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


/* 보충 자료
import java.io.*;
import java.util.StringTokenizer;

public class Main {

    //readLine() 시 예외처리가 반드시 필요
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // StringTokenizer로 N과 M을 공백으로 구분
        StringTokenizer st = new StringTokenizer(br.readLine());
      *//*
        입력은 readLine()를 사용, 리턴 값이 String으로 고정
        ⚡️다른 타입으로 입력을 받고자 한다면 반드시 형변환이 필요하다.
      *//*


        //바구니의 수
        int N = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        //넣을 공의 수
        int M = Integer.parseInt(st.nextToken());
      *//*
        nextToken()를 쓰면 readLine()을 통해 입력 받은 값을
        공백 단위로 구분하여 순서대로 호출
      *//*


        for(int i = 0; i < M; i++) {
            // StringTokenizer로 공백으로 구분
            st = new StringTokenizer(br.readLine());

            int I = Integer.parseInt(st.nextToken());
            int J = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());

            //배열의 Index는 0부터 시작하기 때문에 -1
            for(int j = I - 1; j < J; j++) {
                arr[j] = K;
            }
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
      *//* 아래와 같음
        for(int i = 0; i < arr.length; i++) {
            bw.write(arr[i] + " ");
        }
       *//*

        br.close();
        bw.flush();
        bw.close();
    }
}
*/
