```java
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] prices = new Integer[n];

        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }

        Arrays.sort(prices, Comparator.reverseOrder());
        int sum = Arrays.stream(prices)
                .mapToInt(Integer::intValue) // 래퍼타입을 int형으로 캐스팅
                .sum();

        for (int i = 0; i < n; i++) {
            if (i % 3 == 2) {
                sum -= prices[i];
            }
        }
        System.out.println(sum);
    }
}