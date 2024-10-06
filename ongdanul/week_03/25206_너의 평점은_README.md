## 🌵 문제 정보
너의 평점은 <br>
[🚗 25206](https://www.acmicpc.net/problem/25206)

## 🌵 문제 정의

전공평점을 계산해주는 프로그램을 작성해보자 <br>

전공평점은 전공과목별 (학점 × 과목평점)의 합을 학점의 총합으로 나눈 값이다 <br>

인하대학교 컴퓨터공학과의 등급에 따른 과목평점은 다음과 같다 <br>

A+	4.5 <br>
A0	4.0 <br>
B+	3.5 <br>
B0	3.0 <br>
C+	2.5 <br>
C0	2.0 <br>
D+	1.5 <br>
D0	1.0 <br>
F	0.0 <br>

P/F 과목의 경우 등급이 P또는 F로 표시되는데, 등급이 P인 과목은 계산에서 제외해야 한다

제한
- 1 ≤ 과목명의 길이 ≤ 50
- 과목명은 알파벳 대소문자 또는 숫자로만 이루어져 있으며, 띄어쓰기 없이 주어진다, 입력으로 주어지는 모든 과목명은 서로 다르다
- 학점은 1.0,2.0,3.0,4.0중 하나
- 등급은 A+,A0,B+,B0,C+,C0,D+,D0,F,P중 하나
- 적어도 한 과목은 등급이 P가 아님이 보장


`input` <br>
- 20줄에 걸쳐 치훈이가 수강한 전공과목의 과목명, 학점, 등급이 공백으로 구분되어 주어진다


- ObjectOrientedProgramming1 3.0 A+ <br>
  IntroductiontoComputerEngineering 3.0 A+ <br>
  ObjectOrientedProgramming2 3.0 A0 <br>
  CreativeComputerEngineeringDesign 3.0 A+ <br>
  AssemblyLanguage 3.0 A+ <br>
  InternetProgramming 3.0 B0 <br>
  ApplicationProgramminginJava 3.0 A0 <br>
  SystemProgramming 3.0 B0 <br>
  OperatingSystem 3.0 B0 <br>
  WirelessCommunicationsandNetworking 3.0 C+ <br>
  LogicCircuits 3.0 B0 <br>
  DataStructure 4.0 A+ <br>
  MicroprocessorApplication 3.0 B+ <br>
  EmbeddedSoftware 3.0 C0 <br>
  ComputerSecurity 3.0 D+ <br>
  Database 3.0 C+ <br>
  Algorithm 3.0 B0 <br>
  CapstoneDesigninCSE 3.0 B+ <br>
  CompilerDesign 3.0 D0 <br>
  ProblemSolving 4.0 P

`output` <br>
- 전공평점을 출력


- 3.284483

## 🌵 알고리즘 설계

과목명 학점 등급 세가지를 한줄로 입력받음 <br>

입력 받은 등급을 과목평점으로 치환하여 전공 평점을 계산 <br>

이때 등급이 P인 과목은 계산에서 제외

- 등급과 등급별 과목평점을 배열로 만들어두어 입력된 값에 따라 치환되게끔 로직 구성

1. Scanner 사용
```java
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // 전공 평점 = (SUM(학점*과목평점)) / SUM(학점) -> totalSum / gradeSum
    // 과목 평점 = 등급에 따라, P는 제외 
    double totalSum = 0;
    double gradeSum = 0;
    String[] gradeList = {"A+", "A0", "B+", "B0", "C+", "C0", "D+", "D0", "F", "P"};
    double[] gradeScore = {4.5, 4.0, 3.5, 3.0, 2.5, 2.0, 1.5, 1.0, 0.0, 0.0};

    for (int i = 0; i < 20; i++) {
      // 과목명은 사용하지 않으므로 저장하지 않음
      sc.next();
      // 학점
      double score = sc.nextDouble();
      // 등급 
      String grade = sc.next();

      for (int j = 0; j < gradeList.length; j++) {
        if (grade.equals(gradeList[j])) {
          // 학점*과목평점 계산 
          totalSum += score * gradeScore[j];
          // "P" 학점이 아닌 경우에만 gradeSum에 추가
          if (!grade.equals("P")) {
            gradeSum += score;
          }
          /*
          if (grade.equals("P")) { 
             continue; 
          } 와 기능은 똑같으나 불필요한 continue를 사용하지 않으므로 코드가 더 간결해짐
          */
          break;
        }
      }
    }

    double avg = totalSum/ gradeSum;

    System.out.printf("%.6f\n", avg);

    sc.close();
  }
}
```

<br>

2.Stream 사용
```java
import java.io.*;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    // 전공 평점 = (SUM(학점*과목평점)) / SUM(학점) -> totalSum / gradeSum
    // 과목 평점 = 등급에 따라, P는 제외 
    double totalSum = 0;
    double gradeSum = 0;
    String[] gradeList = {"A+", "A0", "B+", "B0", "C+", "C0", "D+", "D0", "F", "P"};
    double[] gradeScore = {4.5, 4.0, 3.5, 3.0, 2.5, 2.0, 1.5, 1.0, 0.0, 0.0};

    for (int i = 0; i < 20; i++) {
      String str = br.readLine();
      StringTokenizer st = new StringTokenizer(str, " ");
      // 과목명은 사용하지 않으므로 저장하지 않음
      st.nextToken();
      // 학점
      double score = Double.parseDouble(st.nextToken());
      // 등급 
      String grade = st.nextToken();

      for (int j = 0; j < gradeList.length; j++) {
        if (grade.equals(gradeList[j])) {
          // 학점*과목평점 계산 
          totalSum += score * gradeScore[j];
          // "P" 학점이 아닌 경우에만 gradeSum에 추가
          if (!grade.equals("P")) {
            gradeSum += score;
          }
          /*
          if (grade.equals("P")) { 
             continue; 
          } 와 기능은 똑같으나 불필요한 continue를 사용하지 않으므로 코드가 더 간결해짐
          */
          break;
        }
      }
    }

    double avg = totalSum/ gradeSum;

    bw.write(String.format("%.6f\n", avg));

    br.close();
    bw.flush();
    bw.close();
  }
}
```