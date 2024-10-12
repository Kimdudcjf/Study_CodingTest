import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int s = sc.nextInt();

        for (int t = 0; t < s; t++) {
            int[] A = new int[10];

            for (int i = 0; i < 10; i++) {
                A[i] = sc.nextInt();
            }

            Arrays.sort(A);
            System.out.println(A[7]);
        }

        sc.close();
    }
}

