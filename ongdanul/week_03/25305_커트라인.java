import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        System.out.print(arr[N-K] + " ");

        sc.close();
    }
}

/* 다른 풀이
import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    StringTokenizer str = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(str.nextToken());
    int K = Integer.parseInt(str.nextToken());
    int[] arr = new int[N];

    str = new StringTokenizer(br.readLine());
    for (int i = 0; i < N; i++) {
      arr[i] = Integer.parseInt(str.nextToken());
    }

    Arrays.sort(arr);

    bw.write(arr[N-K] + " ");

    bw.flush();
    bw.close();
    br.close();
  }
}
*/