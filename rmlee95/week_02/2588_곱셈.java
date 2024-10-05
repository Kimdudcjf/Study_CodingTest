import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arrB = new ArrayList<>();

        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = a * b;

        while (b > 0) {
            arrB.add(b % 10);
            b /= 10;
        }

        for (int i = 0; i < arrB.size(); i++) {
            System.out.println(a * arrB.get(i));
        }

        System.out.println(result);
    }
}