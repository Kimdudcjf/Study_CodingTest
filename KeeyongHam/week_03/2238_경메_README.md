## 🌵 문제 정보
경매 <br>
[🚗 2238](https://www.acmicpc.net/problem/2238)

## 🌵 문제 정의

경매는 여러 사람이 하나의 물건을 사려고 할 때, 각 사람이 원하는 가격을 제시하면 그 중 가장 높은 가격으로 물건을 팔게 되는 방식이다. 이러한 고전적인 경매 방식은 꽤 널리 쓰이는데, 최근에는 인터넷 쇼핑몰에서 반대의 경매 방식을 택하기도 한다. 즉, 여러 사람이 가격을 제시하면, 그 중 가장 낮은 가격으로 물건을 팔게 되는 방식도 쓰인다.

하지만 이럴 경우, 모든 사람들이 1원에 물건을 사겠다고 하는 사태가 발생할 수 있다. 따라서 같은 가격을 제시한 사람이 둘 이상일 경우에는 무효로 하는 방식이 쓰인다. 하지만 모든 가격을 여러 사람이 제시하는 경우도 있을 수 있기 때문에, 다음과 같은 방식으로 경매 당첨자를 선택하기로 한다.

우선 가장 적은 수의 사람이 제시한 가격을 찾는다. 이러한 경우가 여럿 있다면, 가장 낮은 가격으로 물건을 팔게 된다. 이때, 그 가격을 제시한 사람들 중에서 가장 먼저 제시한 사람이 물건을 살 수 있게 된다.

각각의 사람들이 제시한 가격이 주어졌을 때, 경매에 낙찰(당첨)되는 사람을 구하는 프로그램을 작성하시오.



`input` <br>

* 첫째 줄에 두 정수 U(1 ≤ U ≤ 10,000), N(1 ≤ N ≤ 100,000)이 주어진다. U는 금액의 상한이고, N은 경매에 참여한 회수이다. 다음 N개의 줄에는 사람 이름 S(공백 없는 알파벳 대소문자 10자 이하)와, 그 사람이 제시한 가격 P(1 ≤ P ≤ U, 정수)이 경매에 참여한(가격을 제시한) 순서대로 주어진다.

* 10 4 <br>
  Lew 10 <br>
  CD 5 <br>
  Fe 5 <br>
  CD 7


`output` <br>

* 첫째 줄에 낙찰된 사람의 이름과 그 가격을 출력한다.

* CD 7

## 🌵 알고리즘 설계

1. U, N을 입력받는다
2. N만큼 순회하며 Map에 key = 가격, value는 이름을 list형으로 집어 넣는다(중복된 가격을 적은 사람을 찾기위해)
3. key를 list로 뽑아내고, value의 크기가 작은 순으로 정렬한다
4. value의 크기가 가장 작은 값을 이름과 금액으로 출력한다.

```java
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int U = sc.nextInt();
        int N = sc.nextInt();

        sc.nextLine();


        Map<Integer, List<String>> resultMap = new HashMap<>();

        //N만큼 순회
        for (int i = 0; i < N; i++) {
            String[] strings = sc.nextLine().split(" ");

            String name = strings[0];
            int price = Integer.parseInt(strings[1]);

            //같은 키(금액)이 없으면 리스트 생성 후 값(이름)을 집어 넣는다
            if (!resultMap.containsKey(price)) {
                List<String> names = new ArrayList<>();
                names.add(name);
                resultMap.put(price, names);
                
            //같은 키(금액)이 잇으면 그 값의 리스트에 이름을 추가한다.
            } else {
                resultMap.get(price).add(name);
            }
        }

        //key를 리스트로 뽑아낸다.
        ArrayList<Integer> keySet = new ArrayList<>(resultMap.keySet());

        //key를 value(같은 금액을 쓴 사람들)의 크기가 작은 순서대로 정렬
        keySet.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(resultMap.get(o1).size(), resultMap.get(o2).size());
            }
        });

        //value의 크기가 가장 작은사람의 이름과 금액을 출력한다.
        System.out.println(resultMap.get(keySet.get(0)).get(0) + " " + keySet.get(0));
    }
}
```