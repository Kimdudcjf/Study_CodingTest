import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] arr = new int[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (j == M - 1) {
                    System.out.print(arr[i][j] + sc.nextInt());
                } else {
                    System.out.print((arr[i][j] + sc.nextInt()) + " ");
                }
            }
            System.out.println();
        }

        sc.close();
    }
}

/* 다른 풀이
import java.io.*;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    StringTokenizer str = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(str.nextToken());
    int M = Integer.parseInt(str.nextToken());
    int[][] arr = new int[N][M];

    for (int i = 0; i < N; i++) {
      str = new StringTokenizer(br.readLine());
      for (int j = 0; j < M; j++) {
        arr[i][j] = Integer.parseInt(str.nextToken());
      }
    }

    for (int i = 0; i < N; i++) {
      str = new StringTokenizer(br.readLine());
      for (int j = 0; j < M; j++) {
        bw.write(arr[i][j] + Integer.parseInt(str.nextToken()) + " ");
      }
    }

    bw.flush();
    bw.close();
    br.close();
  }
}
*/