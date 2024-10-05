import java.util.*;
public class Main {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        Integer[] arr = new Integer[N];

        for(int i=0; i<N; i++) {
            arr[i] = scan.nextInt();
        }
        // 내림차순 정렬
        Arrays.sort(arr, Comparator.reverseOrder());

        int sum = 0;
        for(int i=0; i<N; i++){
            //Index 번호이기때문에 나머지가 2인게 3의 배수
            if(i%3==2) {
                continue;
            }
            sum += arr[i];
        }
        System.out.println(sum);
    }
}

/*다른 풀이
import java.io.*;
import java.util.*;


public class Main {
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    StringTokenizer str = new StringTokenizer(br.readLine());

    int N = Integer.parseInt(str.nextToken());

    Integer arr[] = new Integer[N];
    for(int i=0; i<N; i++) {
      str = new StringTokenizer(br.readLine());
      arr[i] = Integer.parseInt(str.nextToken());
    }
    // 내림차순 정렬
    Arrays.sort(arr, Comparator.reverseOrder());

    int sum = 0;
    for(int i=0; i<N; i++) {
      //Index 번호이기때문에 나머지가 2인게 3의 배수
      if(i%3==2) {
        continue;
      }
      sum += arr[i];
    }

    bw.write(sum + " ");

    br.close();
    bw.flush();
    bw.close();
  }
}
*/