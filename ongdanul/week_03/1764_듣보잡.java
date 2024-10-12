import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        String[] parts = input.split(" ");
        int N = Integer.parseInt(parts[0]);
        int M = Integer.parseInt(parts[1]);

        /*
        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.nextLine();
        */

        HashSet<String> people  = new HashSet<>();
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            people.add(sc.nextLine());
        }

        for (int i = 0; i < M; i++) {
            String st = sc.nextLine();
            if (people.contains(st)) {
                list.add(st);
            }
        }

        Collections.sort(list);

        System.out.println(list.size());

        for (String s : list) {
            System.out.println(s);
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

    StringTokenizer str = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(str.nextToken());
    int M = Integer.parseInt(str.nextToken());

    HashSet<String> people  = new HashSet<>();
    ArrayList<String> list = new ArrayList<>();

    for (int i = 0; i < N; i++) {
      people.add(br.readLine());
    }

    for (int i = 0; i < M; i++) {
      String st = br.readLine();
      if (people.contains(st)) {
        list.add(st);
      }
    }

    Collections.sort(list);

    bw.write(list.size() + "\n");

    for (String s : list) {
      bw.write(s + "\n");
    }

    bw.flush();
    bw.close();
    br.close();
  }
}
*/