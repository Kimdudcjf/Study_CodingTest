import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Deque<Integer> queue = new LinkedList<>();

        int N = Integer.parseInt(br.readLine());

        //queue에 추가
        for(int i=1; i<=N; i++) {
            queue.offer(i);
        }

        //첫번째 요소를 제거하고 queue의 끝에 다시 추가
        while(queue.size()>1) {
            queue.poll();
            queue.offer(queue.poll());
        }

        bw.write(String.valueOf(queue.poll()));

        bw.flush();
        bw.close();
        br.close();
    }
}