import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 책의 개수
        int M = sc.nextInt(); // 박스에 넣을 수 있는 최대 무게
        int book;
        int weight = 0;
        int result = 0; // N = 0일 경우를 위해 0으로 초기화

        for (int i = 0; i < N; i++) {
            book = sc.nextInt();

            // 박스에 넣을 수 있는 최대 무게를 넘을 경우
            if (weight + book > M) {
                weight = book; // 다음 박스에 담기
                result++; // 박스 수 증가
            } else {
                weight += book;
            }
        }
        if (weight > 0) { // 위의 조건문에서 다음 박스에 담은 경우
            result++;
        }
        System.out.println(result);
    }
}