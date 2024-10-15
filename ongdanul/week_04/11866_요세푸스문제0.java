import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Deque<Integer> queue = new LinkedList<>();

        String input = sc.nextLine();
        String[] parts = input.split(" ");

        int N = Integer.parseInt(parts[0]);
        int K = Integer.parseInt(parts[1]);

        //queue에 추가
        for(int i=1; i<=N; i++) {
            queue.offer(i);
        }

        System.out.print('<');

        while(queue.size() > 1) {

            for(int i = 0; i < K - 1; i++) {
                int temp = queue.poll();
                queue.offer(temp);
            }

            System.out.print(queue.poll() + ", ");
        }

        System.out.print(queue.poll() + ">");

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

        StringBuilder sb = new StringBuilder();

        Deque<Integer> queue = new LinkedList<>();

        StringTokenizer str = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(str.nextToken());
        int K = Integer.parseInt(str.nextToken());

        //queue에 추가
        for(int i=1; i<=N; i++) {
            queue.offer(i);
        }

        sb.append('<');

        while(queue.size() > 1) {

            for(int i = 0; i < K - 1; i++) {
                int temp = queue.poll();
                queue.offer(temp);
            }

            sb.append(queue.poll()).append(", ");
        }

        sb.append(queue.poll()).append('>');

        bw.write(sb + " ");

        bw.flush();
        bw.close();
        br.close();
    }
}
*/