import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[30];

        // 28명의 학생 번호를 입력받음
        for (int i = 0; i < 28; i++) {
            // Index는 0부터 시작하므로 -1
            int student = sc.nextInt() - 1;
            // 과제 제출 표시
            arr[student] = 1;
        }

        // 과제를 제출하지 않은 학생 번호 출력
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 1)
                // 학생 번호 출력
                System.out.println(i + 1);
        }

        sc.close();
    }
}

/*다른 풀이
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = new int[30];

        // 28명의 학생 번호를 입력받음
        for (int i = 0; i < 28; i++) {
            // Index는 0부터 시작하므로 -1
            int student = Integer.parseInt(br.readLine()) - 1;
            // 과제 제출 표시
            arr[student] = 1;
        }

        // 과제를 제출하지 않은 학생 번호 출력
        for(int i = 0; i <arr.length; i++) {
            if (arr[i] != 1){
                bw.write((i + 1) + " ");
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
*/