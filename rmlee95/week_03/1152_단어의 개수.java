import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        // 입력으로 공백만 입력될 경우를 고려
        if (str.equals(" ")) {
            System.out.println(0);
        } else {
            // 일력받은 문자열 앞뒤 공백제거
            str = str.trim();

            // split 매서드 활용해서 배열에 담기
            String[] words = str.split(" ");

            // 배열의 길이 출력으로 단어의 개수 출력
            System.out.println(words.length);
        }
    }
}