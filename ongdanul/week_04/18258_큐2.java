import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();

        Deque<Integer> queue = new LinkedList<>();

        int N = Integer.parseInt(br.readLine());

        StringTokenizer str;

        while (N-- > 0) {
            str = new StringTokenizer(br.readLine());

            switch (str.nextToken()) {

                case "push":
                    // offer는 큐의 맨 뒤에 요소를 추가
                    queue.offer(Integer.parseInt(str.nextToken()));
                    break;

                case "pop":
                    // poll은 가장 앞에 있는 요소를 삭제, 삭제할 원소가 없을 경우 예외를 던지는 것이 아닌 null을 반환
                    Integer pollItem = queue.poll();
                    if (pollItem == null) {
                        sb.append(-1).append('\n');
                    } else {
                        sb.append(pollItem).append('\n');
                    }
                    break;

                case "size":
                    sb.append(queue.size()).append('\n');
                    break;

                case "empty":
                    if (queue.isEmpty()) {
                        sb.append(1).append('\n');
                    } else {
                        sb.append(0).append('\n');
                    }
                    break;

                case "front":
                    // peek()은 큐에 꺼낼 요소가 없을 경우 null을 반환
                    Integer peekItem = queue.peek();
                    if (peekItem == null) {
                        sb.append(-1).append('\n');
                    } else {
                        sb.append(peekItem).append('\n');
                    }
                    break;

                case "back":
                    // peekLast()은 큐에 꺼낼 요소가 없을 경우 null을 반환
                    Integer peekLastItem = queue.peekLast();
                    if (peekLastItem == null) {
                        sb.append(-1).append('\n');
                    } else {
                        sb.append(peekLastItem).append('\n');
                    }
                    break;
            }
        }
        bw.write(sb + " ");

        bw.flush();
        bw.close();
        br.close();
    }
}