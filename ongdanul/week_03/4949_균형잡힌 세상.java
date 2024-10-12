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

/* 다른 풀이
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
*/