import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.nextLine());

        //이름 = 키 , 출/퇴근 상태 = 값
        HashSet<String> work = new HashSet<>();

        for (int i = 0; i < N; i++) {
            String input = sc.nextLine();
            String[] parts = input.split(" ");

            String key = parts[0];
            String value = parts[1];

            if(value.equals("enter")){
                //출근일 경우 저장
                work.add(key);
            }else if(value.equals("leave")){
                //퇴근일 경우 제거
                work.remove(key);
            }
        }

        //역순 정렬을 위해 list 생성
        ArrayList<String> list = new ArrayList<>(work);
        Collections.sort(list, Collections.reverseOrder());

        for (String name : list) {
            System.out.println(name);
        }

        sc.close();
    }
}

/* 다른 풀이
import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


    int N = Integer.parseInt(br.readLine());

    //이름 = 키 , 출/퇴근 상태 = 값
    HashSet<String> work = new HashSet<>();

    for (int i = 0; i < N; i++) {
        StringTokenizer str = new StringTokenizer(br.readLine());

        String key = str.nextToken();
        String value = str.nextToken();

        if(value.equals("enter")){
            //출근일 경우 저장
            work.add(key);
        }else if(value.equals("leave")){
            //퇴근일 경우 제거
            work.remove(key);
        }
    }

    //역순 정렬을 위해 list 생성
    ArrayList<String> list = new ArrayList<>(work);
    Collections.sort(list, Collections.reverseOrder());

    for (String name : list) {
        bw.write(name + "\n");
    }

    bw.flush();
    bw.close();
    br.close();
  }
}
*/