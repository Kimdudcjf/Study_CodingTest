import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int chess[] = {1,1,2,2,2,8};
        int input[] = new int[6];

        for(int i =0; i<chess.length; i++) {
            input[i] = sc.nextInt();
        }

        for(int i =0; i<chess.length; i++) {
            System.out.print(chess[i]-input[i]+" ");
        }

    }
}

/* 다른 풀이
import java.io.*;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int chess[] = {1,1,2,2,2,8};
    int input[] = new int[6];

    StringTokenizer str = new StringTokenizer(br.readLine(), " ");
    for(int i =0; i<chess.length; i++) {
      input[i] =  Integer.parseInt(str.nextToken());
    }

    for(int i =0; i<chess.length; i++) {
      bw.write((chess[i]-input[i])+" ");
    }

    bw.flush();
    bw.close();
    br.close();
  }
}
*/