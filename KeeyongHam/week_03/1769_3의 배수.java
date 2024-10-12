package week_03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputStr = br.readLine();
        String[] strings = inputStr.split("");

        int cnt = 0;
        int sum = 0;

        if (inputStr.length() == 1) {
            sum = Integer.parseInt(inputStr);
        } else {
            while (true) {
                cnt++;
                sum = Arrays.stream(strings)
                        .mapToInt(Integer::parseInt)
                        .sum();

                if (sum < 10) {
                    break;
                }
                strings = String.valueOf(sum).split("");
            }
        }
        System.out.println(cnt);
        System.out.println(sum % 3 == 0 ? "YES" : "NO");
    }
}
