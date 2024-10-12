import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        String[] parts = input.split(" ");
        //책 개수
        int N = Integer.parseInt(parts[0]);
        //박스 최대 무게
        int M = Integer.parseInt(parts[1]);

        /*
        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.nextLine();
        */

        if (N == 0) {
            System.out.println("0");
            sc.close();
            return;
        }

        int[] books = new int[N];

        //초기 박스
        int box = 1;
        //박스에 담긴 책 무게
        int booksWeight = 0;

        //책 무게
        for (int i = 0; i < N; i++) {
            books[i] = sc.nextInt();
        }

        //박스 개수
        for(int i = 0 ; i < N; i++){
            booksWeight += books[i];

            //박스의 무게가 최대 무게를 초과하면 박스++
            if(booksWeight > M){
                box++;
                booksWeight = books[i];
            }
        }

        System.out.println(box);

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
    //책 개수
    int N = Integer.parseInt(str.nextToken());
    //박스 최대 무게
    int M = Integer.parseInt(str.nextToken());

    if (N == 0) {
      bw.write("0\n");
      bw.flush();
      bw.close();
      br.close();
      return;
    }

    int[] books = new int[N];

    //초기 박스
    int box = 1;
    //박스에 담긴 책 무게
    int booksWeight = 0;

    str = new StringTokenizer(br.readLine());
    //책 무게
    for (int i = 0; i < N; i++) {
      books[i] = Integer.parseInt(str.nextToken());
    }

    //박스 개수
    for(int i = 0 ; i < N; i++){
      booksWeight += books[i];

      //박스의 무게가 최대 무게를 초과하면 박스++
      if(booksWeight > M){
        box++;
        booksWeight = books[i];
      }
    }

    bw.write(box + "\n");


    bw.flush();
    bw.close();
    br.close();
  }
}
*/