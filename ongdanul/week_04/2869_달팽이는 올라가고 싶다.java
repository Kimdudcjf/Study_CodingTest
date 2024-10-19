import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int V = sc.nextInt();

        //(막대 길이 - 미끄러진 길이) / (올라간 길이 - 미끄러진 길이)
        int day = (V - B) / (A - B);

        //나머지가 있을 경우 (다 못올라간 경우)
        if ((V - B) % (A - B) != 0) {
            day++;
        }
        System.out.println(day);

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

        int A = Integer.parseInt(str.nextToken());
        int B = Integer.parseInt(str.nextToken());
        int V = Integer.parseInt(str.nextToken());

        //(막대 길이 - 미끄러진 길이) / (올라간 길이 - 미끄러진 길이)
        int day = (V - B) / (A - B);

        //나머지가 있을 경우 (다 못올라간 경우)
        if ((V - B) % (A - B) != 0) {
            day++;
        }

        bw.write(day + " ");

        bw.flush();
        bw.close();
        br.close();
    }
*/