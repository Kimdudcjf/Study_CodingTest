package week_03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String stringA = sc.nextLine();
        String stringB = sc.nextLine();

        int stringALen = stringA.length();
        int stringBLen = stringB.length();

        int resultLen = stringA.replace(stringB, "").length();

        System.out.println((stringALen - resultLen) / stringBLen);
    }
}
