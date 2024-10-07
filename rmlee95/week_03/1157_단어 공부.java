import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        // 알파벳 별 개수 카운팅을 위해 배열 생성
        int[] alphabet = new int[26];

        for (int i = 0; i <str.length(); i++) {
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                alphabet[str.charAt(i) - 'A']++;
            } else {
                alphabet[str.charAt(i) - 'a']++;
            }
        }

        int max = -1;
        char result = ' ';

        for (int i = 0; i < alphabet.length; i++) {
            if (alphabet[i] > max) {
                max = alphabet[i];
                result = (char) (i + 65);
            } else if (alphabet[i] == max) {
                result = '?';
            }
        }
        System.out.println(result);
    }
}