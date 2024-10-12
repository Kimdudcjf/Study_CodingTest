package week_03;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int U = sc.nextInt();
        int N = sc.nextInt();

        sc.nextLine();


        Map<Integer, List<String>> resultMap = new HashMap<>();

        for (int i = 0; i < N; i++) {
            String[] strings = sc.nextLine().split(" ");

            String name = strings[0];
            int price = Integer.parseInt(strings[1]);

            if (!resultMap.containsKey(price)) {
                List<String> names = new ArrayList<>();
                names.add(name);
                resultMap.put(price, names);
            } else {
                resultMap.get(price).add(name);
            }
        }

        ArrayList<Integer> keySet = new ArrayList<>(resultMap.keySet());

        keySet.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(resultMap.get(o1).size(), resultMap.get(o2).size());
            }
        });

        System.out.println(resultMap.get(keySet.get(0)).get(0) + " " + keySet.get(0));
    }
}