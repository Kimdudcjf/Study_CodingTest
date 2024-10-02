import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();  // 테스트 케이스의 개수

        for (int t = 0; t < T; t++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            // a의 마지막 자리를 가져옵니다.
            a = a % 10;

            // a의 마지막 자리에 대한 패턴을 찾습니다.
            int lastDigit;

            // 0일 경우는 10번 컴퓨터에서 처리됩니다.
            if (a == 0) {
                lastDigit = 10;
            } else {
                int[] pattern = new int[4];
                pattern[0] = a;
                for (int i = 1; i < 4; i++) {
                    pattern[i] = (pattern[i - 1] * a) % 10;
                }
                int index = (b - 1) % 4;
                lastDigit = pattern[index];
            }

            System.out.println(lastDigit);
        }
    }
}
