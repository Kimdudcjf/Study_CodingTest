import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int sum = (A * 60) + B;
        sum += C;

        int hour = (sum / 60) % 24;
        int min = sum % 60;

        System.out.println(hour + " " + min);
    }
}