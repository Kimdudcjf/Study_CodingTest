import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class day1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int first = sc.nextInt();
        List<Integer> divisors = new ArrayList<>();
        for (int i = 0; i < first; i++) {
            divisors.add(sc.nextInt());
        }

        int min = Collections.min(divisors);
        int max = Collections.max(divisors);

        int N = min * max;

        System.out.println(N);

        sc.close();
    }
}