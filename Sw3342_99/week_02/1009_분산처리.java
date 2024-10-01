
import java.util.Scanner;

class day2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("a 값 입력");
        int a = sc.nextInt();

        System.out.println("b 값 입력");
        int b = sc.nextInt();

        int total = a * b;

        int last = total % 10;

        if (last == 0) {
            last = 10;
        }

        System.out.println(last);
    }
}