public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int sum = 0;
        Integer [] arr = new Integer[N];

        for(int i=0; i<arr.length; i++) {
            arr[i]=sc.nextInt();
        }

        Arrays.sort(arr, Collections.reverseOrder()); //내림차순

        for(int i=0; i<arr.length; i++) {
            if(!(i % 3 == 2)) {
                sum += arr[i];
            }
        }

        System.out.println(sum);
    }
}