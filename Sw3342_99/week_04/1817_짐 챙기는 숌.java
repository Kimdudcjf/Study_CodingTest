import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();

        if (N == 0) {
            System.out.println(0);
            return;
        }

        int[] weights = new int[N];

        for (int i = 0; i < N; i++) {
            weights[i] = scanner.nextInt();
        }

        int boxCount = 1;
        int currentWeight = 0;

        for (int i = 0; i < N; i++) {
            if (currentWeight + weights[i] > M) {
                boxCount++;
                currentWeight = weights[i];
            } else {
                currentWeight += weights[i];
            }
        }

        System.out.println(boxCount);

        scanner.close();
    }
}
