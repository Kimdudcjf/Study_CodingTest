import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

class day5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        Integer[] pr = new Integer[n];

        for (int i = 0; i < n; i++) {
            pr[i] = scanner.nextInt();
        }

        Arrays.sort(pr, Collections.reverseOrder());

        int total = 0;

        for (int i = 0; i < n; i++) {
            if ((i + 1) % 3 != 0) {
                total += pr[i];
            }
        }

        System.out.println(total);

        scanner.close();
    }
}
