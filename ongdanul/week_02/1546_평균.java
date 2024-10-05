import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 과목의 수
        int N = sc.nextInt();

        // 원래 점수와 조작한 점수를 저장할 배열
        double[] score = new double[N];

        // 원래 점수의 최고점
        double max = 0;
        // 조작한 점수의 총 점
        double sum = 0;

        for (int i = 0; i < N; i++) {
            score[i] = sc.nextDouble();

            if (score[i] > max) {
                max = score[i];
            }
        }

        for (int i = 0; i < N; i++) {
            double fakeScore = (score[i] / max) * 100;
            sum += fakeScore;
        }

        // 평균
        double avg = sum / N;

        System.out.println(avg);

        sc.close();
    }
}

/*다른 풀이
import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        double[] score = new double[N];

        double max = 0;
        double sum = 0;

        StringTokenizer str = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            score[i] = Double.parseDouble(str.nextToken());

            if (score[i] > max) {
                max = score[i];
            }
        }

        for (int i = 0; i < N; i++) {
            double fakeScore = (score[i] / max) * 100;
            sum += fakeScore;
        }

        double avg = sum / N;

        //bw.write()는 문자열을 받기 때문에 avg 변수를 소수점 두 자리까지 포맷팅하여 문자열로 변환
        bw.write(String.format("%.2f", avg));

        br.close();
        bw.flush();
        bw.close();
    }
}
*/