import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 바구니의 개수를 입력받아 배열의 길이 설정
        int[] arrNum = new int[sc.nextInt()];

        // 몇번 순서 변경을 수행할지 담을 변수 선언 및 입력 받은 값 대입
        int num = sc.nextInt();

        // 바구니의 배열을 초기화
        for (int i = 0; i < arrNum.length; i++) {
            arrNum[i] = i + 1;
        }

        // 시작과 끝의 위치를 담을 변수와 임시로 데이터를 담을 변수 선언
        int start, end, tmp;

        // num에 받은 값 만큼 반복
        for (int i = 0; i < num; i++) {
            start = sc.nextInt() - 1;
            end = sc.nextInt() - 1;
            // 이중 for문으로 실질적인 리버스
            for (int j = start, k = end; j < k; j++,k--) {
                tmp = arrNum[j];
                arrNum[j] = arrNum[k];
                arrNum[k] = tmp;
            }
        }
        // for문으로 배열을 출력 (Delimiter로는 " " 공백을 사용)
        for (int i = 0; i < arrNum.length; i++) {
            System.out.print(arrNum[i] + " ");
        }
    }
}