## 🌵 문제 정보
균형잡힌 세상 <br>
[🚗 4949](https://www.acmicpc.net/problem/4949)

## 🌵 문제 정의
어떤 문자열이 주어졌을 때, 괄호들의 균형이 잘 맞춰져 있는지 판단하는 프로그램을 만든다 <br>

문자열에 포함되는 괄호는 소괄호("( )") 와 대괄호("[ ]")로 2종류이고, <br>

문자열이 균형을 이루는 조건은 아래와 같다 <br>

모든 왼쪽 소괄호("(")는 오른쪽 소괄호(")")와만 짝을 이뤄야 한다 <br>
모든 왼쪽 대괄호("[")는 오른쪽 대괄호("]")와만 짝을 이뤄야 한다 <br>
모든 오른쪽 괄호들은 자신과 짝을 이룰 수 있는 왼쪽 괄호가 존재한다 <br>
모든 괄호들의 짝은 1:1 매칭만 가능하다. 즉, 괄호 하나가 둘 이상의 괄호와 짝지어지지 않는다 <br>
짝을 이루는 두 괄호가 있을 때, 그 사이에 있는 문자열도 균형이 잡혀야 한다 <br>
문자열이 주어졌을 때 균형잡힌 문자열인지 아닌지를 판단해보자 <br>


`input` <br>
- 각 문자열은 마지막 글자를 제외하고 영문 알파벳, 공백, 소괄호("( )"), <br>
  대괄호("[ ]")로 이루어져 있으며, 온점(".")으로 끝나고, 길이는 100글자보다 작거나 같다
- 입력의 종료조건으로 맨 마지막에 온점 하나(".")가 들어온다.


- So when I die (the [first] I will see in (heaven) is a score list). <br>
  [ first in ] ( first out ). <br>
  Half Moon tonight (At least it is better than no Moon at all]. <br>
  A rope may form )( a trail in a maze. <br>
  Help( I[m being held prisoner in a fortune cookie factory)]. <br>
  ([ (([( [ ] ) ( ) (( ))] )) ]). <br>
  . <br>
  .

`output` <br>
- 각 줄마다 해당 문자열이 균형을 이루고 있으면 "yes"를, 아니면 "no"를 출력한다 <br>


- yes <br>
  yes <br>
  no <br>
  no <br>
  no <br>
  yes <br>
  yes

## 🌵 알고리즘 설계

여는 괄호일 때 stack에 추가하고 닫는 괄호일 때 stack에서 pop해서 stack을 비움 <br>

stack이 비어있는경우와 아닌경우로 yes와 no를 판단함

1. Scanner 사용
```java
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            String str = sc.nextLine();
            //.입력시 프로그램 종료
            if (str.equals(".")) {
                break;
            }

            Stack<String> stack = new Stack<>();

            //공백을 기준으로 str을 쪼개서 배열 st에 저장
            String[] st = str.split("");
            for(String word : st){
                switch (word) {
                    case ("("):
                    case ("["):
                        stack.push(word);
                        break;
                    case (")"):
                        //stack이 비어있지않고 직전에 push한게 '('인 경우 스택에서 제거 
                        if(!stack.isEmpty() && stack.peek().equals("(")){
                            stack.pop();
                        } else {
                            stack.push(")");
                        }
                        break;
                    case ("]"):
                        //stack이 비어있지않고 직전에 push한게 '['인 경우 스택에서 제거
                        if(!stack.isEmpty() && stack.peek().equals("[")) {
                            stack.pop();
                        } else {
                            stack.push("]");
                        }
                        break;
                    default: continue;
                }
            }

            if (stack.empty()) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }

        sc.close();
    }
}
```

<br>

2.Stream 사용
```java
import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String str = br.readLine();
            //.입력시 프로그램 종료
            if (str.equals(".")) {
                break;
            }

            Stack<String> stack = new Stack<>();

            //공백을 기준으로 str을 쪼개서 배열 st에 저장
            String[] st = str.split("");
            for(String word : st){
                switch (word) {
                    case ("("):
                    case ("["):
                        stack.push(word);
                        break;
                    case (")"):
                        //stack이 비어있지않고 직전에 push한게 '('인 경우 스택에서 제거 
                        if(!stack.isEmpty() && stack.peek().equals("(")){
                            stack.pop();
                        } else {
                            stack.push(")");
                        }
                        break;
                    case ("]"):
                        //stack이 비어있지않고 직전에 push한게 '['인 경우 스택에서 제거
                        if(!stack.isEmpty() && stack.peek().equals("[")) {
                            stack.pop();
                        } else {
                            stack.push("]");
                        }
                        break;
                    default: continue;
                }
            }

            if (stack.empty()) {
                bw.write("yes\n");
            } else {
                bw.write("no\n");
            }
        }
        
        br.close();
        bw.flush();
        bw.close();
    }
}
```