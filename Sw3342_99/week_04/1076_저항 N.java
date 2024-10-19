import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> CTV = new HashMap<>();
        CTV.put("black", 0);
        CTV.put("brown", 1);
        CTV.put("red", 2);
        CTV.put("orange", 3);
        CTV.put("yellow", 4);
        CTV.put("green", 5);
        CTV.put("blue", 6);
        CTV.put("violet", 7);
        CTV.put("grey", 8);
        CTV.put("white", 9);

        HashMap<String, Integer> CTM = new HashMap<>();
        CTM.put("black", 1);
        CTM.put("brown", 10);
        CTM.put("red", 100);
        CTM.put("orange", 1000);
        CTM.put("yellow", 10000);
        CTM.put("green", 100000);
        CTM.put("blue", 1000000);
        CTM.put("violet", 10000000);
        CTM.put("grey", 100000000);
        CTM.put("white", 1000000000);

        Scanner scanner = new Scanner(System.in);

        String first = scanner.nextLine().toLowerCase();
        String second = scanner.nextLine().toLowerCase();
        String third = scanner.nextLine().toLowerCase();

        int value = CTV.get(first) * 10 + CTV.get(second);
        int multiplier = CTM.get(third);
        long res = value * (long)multiplier;

        System.out.println(res);

        scanner.close();
    }
}
