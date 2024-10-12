import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for (int i = n; 0 < i; i--) {
            System.out.println(i);
        }
        sc.close();

    }
}