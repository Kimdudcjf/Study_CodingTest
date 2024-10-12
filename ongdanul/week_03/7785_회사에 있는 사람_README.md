## 🌵 문제 정보
회사에 있는 사람 <br>
[🚗 7785](https://www.acmicpc.net/problem/7785)

## 🌵 문제 정의

상근이는 세계적인 소프트웨어 회사 기글에서 일한다. 이 회사의 가장 큰 특징은 자유로운 출퇴근 시간이다 <br>

따라서, 직원들은 반드시 9시부터 6시까지 회사에 있지 않아도 된다 <br>

각 직원은 자기가 원할 때 출근할 수 있고, 아무때나 퇴근할 수 있다 <br>

상근이는 모든 사람의 출입카드 시스템의 로그를 가지고 있다 <br>

이 로그는 어떤 사람이 회사에 들어왔는지, 나갔는지가 기록되어져 있다 <br>

로그가 주어졌을 때, 현재 회사에 있는 모든 사람을 구하는 프로그램을 작성하시오

`input` <br>
- 첫째 줄에 로그에 기록된 출입 기록의 수 n이 주어진다. (2 ≤ n ≤ 106)
  다음 n개의 줄에는 출입 기록이 순서대로 주어지며, 각 사람의 이름이 주어지고 
  "enter"나 "leave"가 주어진다 "enter"인 경우는 출근, "leave"인 경우는 퇴근이다 
- 회사에는 동명이인이 없으며, 대소문자가 다른 경우에는 다른 이름이다
  사람들의 이름은 알파벳 대소문자로 구성된 5글자 이하의 문자열이다


- 4 <br>
  Baha enter <br>
  Askar enter <br>
  Baha leave <br>
  Artem enter

`output` <br>
- 현재 회사에 있는 사람의 이름을 사전 순의 역순으로 한 줄에 한 명씩 출력


- Askar <br>
  Artem

## 🌵 알고리즘 설계

N 만큼 입력을 받고 출근한 사람의 이름과 출근,퇴근 여부가 주어질때 <br>

HashSet 을 이용하여 키(사람의 이름)에 따른 값(출/퇴근 여부)의 변화를 적용시키고 <br>

출근한 상태의 사람의 이름을 출력한다, 이때 정렬은 역순으로 한다

1. Scanner 사용
```java
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
```

<br>

2.Stream 사용
```java
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
```