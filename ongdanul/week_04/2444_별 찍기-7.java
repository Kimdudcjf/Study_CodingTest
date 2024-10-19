import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = 0;

        N = sc.nextInt();
        for(int i = 1; i <= N; i++) {

            for(int j = 1; j <= N - i; j++ ) {
                System.out.print(" ");
            }
            for(int j = 1; j <= i*2 -1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = 1; i <= N - 1 ; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for(int j = 1; j <= ((N - i) * 2 - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}