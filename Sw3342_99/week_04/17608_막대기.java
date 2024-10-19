import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] heights = new int[N];

        for (int i = 0; i < N; i++) {
            heights[i] = scanner.nextInt();
        }

        int Count = 1;
        int maxHeight = heights[N - 1];

        for (int i = N - 2; i >= 0; i--) {
            if (heights[i] > maxHeight) {
                Count++;
                maxHeight = heights[i];
            }
        }

        System.out.println(Count);

        scanner.close();
    }
}
