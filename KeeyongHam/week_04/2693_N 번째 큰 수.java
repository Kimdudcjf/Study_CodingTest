package week_04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        List<Integer> intList = new ArrayList<>();
        for (int i = 0; i < T; i++) {
            for (int j = 0; j < 10; j++) {
                intList.add(sc.nextInt());
            }
            intList.sort((o1, o2) -> o1.compareTo(o2));
            System.out.println(intList.get(7));
            intList.clear();
        }

    }
}