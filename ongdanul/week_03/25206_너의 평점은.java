import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 전공 평점 = (SUM(학점*과목평점)) / SUM(학점) -> totalSum / gradeSum
        // 과목 평점 = 등급에 따라, P는 제외
        double totalSum = 0;
        double gradeSum = 0;
        String[] gradeList = {"A+", "A0", "B+", "B0", "C+", "C0", "D+", "D0", "F", "P"};
        double[] gradeScore = {4.5, 4.0, 3.5, 3.0, 2.5, 2.0, 1.5, 1.0, 0.0, 0.0};

        for (int i = 0; i < 20; i++) {
            // 과목명은 사용하지 않으므로 저장하지 않음
            sc.next();
            // 학점
            double score = sc.nextDouble();
            // 등급
            String grade = sc.next();

            for (int j = 0; j < gradeList.length; j++) {
                if (grade.equals(gradeList[j])) {
                    // 학점*과목평점 계산
                    totalSum += score * gradeScore[j];
                    // "P" 학점이 아닌 경우에만 gradeSum에 추가
                    if (!grade.equals("P")) {
                        gradeSum += score;
                    }
          /*
          if (grade.equals("P")) {
             continue;
          } 와 기능은 똑같으나 불필요한 continue를 사용하지 않으므로 코드가 더 간결해짐
          */
                    break;
                }
            }
        }

        double avg = totalSum/ gradeSum;

        System.out.printf("%.6f\n", avg);

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

        // 전공 평점 = (SUM(학점*과목평점)) / SUM(학점) -> totalSum / gradeSum
        // 과목 평점 = 등급에 따라, P는 제외
        double totalSum = 0;
        double gradeSum = 0;
        String[] gradeList = {"A+", "A0", "B+", "B0", "C+", "C0", "D+", "D0", "F", "P"};
        double[] gradeScore = {4.5, 4.0, 3.5, 3.0, 2.5, 2.0, 1.5, 1.0, 0.0, 0.0};

        for (int i = 0; i < 20; i++) {
            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str, " ");
            // 과목명은 사용하지 않으므로 저장하지 않음
            st.nextToken();
            // 학점
            double score = Double.parseDouble(st.nextToken());
            // 등급
            String grade = st.nextToken();

            for (int j = 0; j < gradeList.length; j++) {
                if (grade.equals(gradeList[j])) {
                    // 학점*과목평점 계산
                    totalSum += score * gradeScore[j];
                    // "P" 학점이 아닌 경우에만 gradeSum에 추가
                    if (!grade.equals("P")) {
                        gradeSum += score;
                    }
          */
/*
          if (grade.equals("P")) {
             continue;
          } 와 기능은 똑같으나 불필요한 continue를 사용하지 않으므로 코드가 더 간결해짐
          *//*

                    break;
                }
            }
        }

        double avg = totalSum/ gradeSum;

        bw.write(String.format("%.6f\n", avg));

        br.close();
        bw.flush();
        bw.close();
    }
}
*/
