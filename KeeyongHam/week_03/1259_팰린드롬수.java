package week_03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String inputStr = sc.nextLine();

            if (inputStr.equals("0")) {
                break;
            }

            String[] strings = inputStr.split("");

            boolean isSame = true;

            for (int i = 0; i < strings.length; i++) {
                if (!strings[i].equals(strings[strings.length - (1 + i)])) {
                    isSame = false;
                }
            }

            if (isSame) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}
