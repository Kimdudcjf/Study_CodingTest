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
        for(int i=0; i<arr.length; i++) {
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

/* 다른 풀이
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
*/