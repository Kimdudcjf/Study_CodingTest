import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[][] chArr = new char[5][15];
        int n = 0;
        String result = "";

        for (int i = 0; i < chArr.length; i++) {
            String str = sc.nextLine();
            if (str.length() > n) {
                n = str.length();
            }
            for (int j = 0; j < str.length(); j++) {
                chArr[i][j] = str.charAt(j);
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < chArr.length; j++) {
                if (chArr[j][i] == '\0') {
                    continue;
                }
                result += chArr[j][i];
            }
        }

        System.out.println(result);
    }
}