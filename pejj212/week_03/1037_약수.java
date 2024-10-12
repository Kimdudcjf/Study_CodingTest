public class Main {
    public static void main(String[] args) {
        /*
         * 양수 A가 N의 진짜 약수가 되려면, N이 A의 배수이고, A가 1과 N이 아니어야 한다.
         * 어떤 수 N의 진짜 약수가 모두 주어질 때, N을 구하는 프로그램을 작성하시오.
         */

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); //진짜 약수의 개수

        int arr[] = new int[N];

        for(int i=0; i<N; i++) {
            arr[i] = sc.nextInt();
        }

        if(arr.length == 1) {
            System.out.println(arr[0]*arr[0]);
        }
        else {
            int max=Arrays.stream(arr).max().orElse(0);
            int min=Arrays.stream(arr).min().orElse(0);
            System.out.println(max*min);
        }
    }
}