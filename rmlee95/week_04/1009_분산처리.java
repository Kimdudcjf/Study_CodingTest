import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        long[] dataCase = new long[T];

        for (int i = 0; i < T; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            long tmp = 1;

            for (int j = 0; j < b; j++) {
                tmp = (tmp * a) % 10;
            }
            dataCase[i] = tmp;
        }

        for (long data : dataCase) {
            if (data % 10 == 0) {
                System.out.println(10);
            } else {
                System.out.println(data % 10);
            }
        }
    }
}