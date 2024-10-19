import java.util.Scanner;

public class Main {
    public static long fact(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        // N! 결과 출력
        System.out.println(fact(N));

        sc.close();
    }
}


