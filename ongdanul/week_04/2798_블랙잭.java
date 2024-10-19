import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        String[] parts = input.split(" ");

        int N = Integer.parseInt(parts[0]);
        int M = Integer.parseInt(parts[1]);

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int result = search(arr, N, M);
        System.out.println(result);

        sc.close();
    }

    // 탐색
    static int search(int[] arr, int N, int M) {
        int result = 0;

        // 배열 정렬
        Arrays.sort(arr);

        for (int i = 0; i < N - 2; i++) {
            // 첫 번째 카드가 M보다 크면 더 이상 볼 필요 없음
            if (arr[i] > M) break;

            for (int j = i + 1; j < N - 1; j++) {
                int sumTwo = arr[i] + arr[j];

                // 두 카드의 합이 M보다 크면 더 이상 볼 필요 없음
                if (sumTwo > M) break;

                for (int k = j + 1; k < N; k++) {
                    int temp = sumTwo + arr[k];

                    // M과 세 카드의 합이 같다면 바로 return
                    if (temp == M) return temp;

                    // result 갱신
                    if (result < temp && temp < M) {
                        result = temp;
                    }

                    // 세 카드의 합이 M을 넘으면 더 이상 탐색할 필요 없음
                    if (temp > M) break;
                }
            }
        }
        return result;
    }
}

/* 다른 풀이
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer str = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(str.nextToken());
        int M = Integer.parseInt(str.nextToken());

        int[] arr = new int[N];

        str = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(str.nextToken());
        }

        int result = search(arr, N, M);
        bw.write(result + " ");

        bw.flush();
        bw.close();
        br.close();
    }

    // 탐색
    static int search(int[] arr, int N, int M) {
        int result = 0;

        // 배열 정렬
        Arrays.sort(arr);

        for (int i = 0; i < N - 2; i++) {
            // 첫 번째 카드가 M보다 크면 더 이상 볼 필요 없음
            if (arr[i] > M) break;

            for (int j = i + 1; j < N - 1; j++) {
                int sumTwo = arr[i] + arr[j];

                // 두 카드의 합이 M보다 크면 더 이상 볼 필요 없음
                if (sumTwo > M) break;

                for (int k = j + 1; k < N; k++) {
                    int temp = sumTwo + arr[k];

                    // M과 세 카드의 합이 같다면 바로 return
                    if (temp == M) return temp;

                    // result 갱신
                    if (result < temp && temp < M) {
                        result = temp;
                    }

                    // 세 카드의 합이 M을 넘으면 더 이상 탐색할 필요 없음
                    if (temp > M) break;
                }
            }
        }
        return result;
    }
}
*/