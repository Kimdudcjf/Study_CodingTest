package week_04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> inputList = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i < 9; i++) {
            int inputInt = sc.nextInt();
            inputList.add(inputInt);
            sum += inputInt;
        }

        for (int i = 0; i < inputList.size(); i++) {
            for (int j = i + 1; j < inputList.size(); j++) {
                if (sum - (inputList.get(i) + inputList.get(j)) == 100) {
                    inputList.remove(j);
                    inputList.remove(i);
                    break;
                }
            }
            if (inputList.size() == 7) {
                break;
            }
        }
        inputList.sort((o1, o2) -> o1.compareTo(o2));
        for (Integer i : inputList) {
            System.out.println(i);
        }
    }
}
