import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int N = sc.nextInt();
        int a, b;

        for (int i = 0; i < N; i++) {
            a = sc.nextInt();
            b = sc.nextInt();
            X -= a * b;
        }

        System.out.println(X == 0 ? "Yes" : "No");
    }
}