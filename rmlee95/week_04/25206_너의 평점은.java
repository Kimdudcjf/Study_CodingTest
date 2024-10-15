import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 전공 평점을 담을 변수
        double score = 0;
        // 총 학점을 담을 변수
        double creditSum = 0;
        // 학점과 평점을 담을 변수
        double credit, grade = 0;
        // 반복문으로 입력 받기
        for (int i = 0; i < 20; i++) {
            String[] arr = sc.nextLine().split(" ");
            credit = Double.parseDouble(arr[1]);
            // switch 문으로 평점 구하기
            switch (arr[2].charAt(0)) {
                case 'A':
                    if (arr[2].charAt(1) == '+')
                        grade = 4.5;
                    else
                        grade = 4.0;
                    break;
                case 'B':
                    if (arr[2].charAt(1) == '+')
                        grade = 3.5;
                    else
                        grade = 3.0;
                    break;
                case 'C':
                    if (arr[2].charAt(1) == '+')
                        grade = 2.5;
                    else
                        grade = 2.0;
                    break;
                case 'D':
                    if (arr[2].charAt(1) == '+')
                        grade = 1.5;
                    else
                        grade = 1.0;
                    break;
                case 'F':
                    grade = 0;
                    break;
                case 'P':
                    continue;
            }
            creditSum += credit;
            score += credit * grade;
            credit = 0;
            grade = 0;
        }
        System.out.printf("%.6f", score / creditSum);
    }
}