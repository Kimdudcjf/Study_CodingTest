# 문제 정보

[👉 25206번: 너의 평점은](https://www.acmicpc.net/problem/25206)

## 문제 정의
<details><summary> 문제
</summary>

#### 인하대학교 컴퓨터공학과를 졸업하기 위해서는, 전공평점이 3.3 이상이거나 졸업고사를 통과해야 한다. 그런데 아뿔싸, 치훈이는 깜빡하고 졸업고사를 응시하지 않았다는 사실을 깨달았다!

치훈이의 전공평점을 계산해주는 프로그램을 작성해보자.

전공평점은 전공과목별 (학점 × 과목평점)의 합을 학점의 총합으로 나눈 값이다.

인하대학교 컴퓨터공학과의 등급에 따른 과목평점은 다음 표와 같다.

- A+ : 4.5
- A0 : 4.0
- B+ : 3.5
- B0 : 3.0
- C+ : 2.5
- C0 : 2.0
- D+ : 1.5
- D0 : 1.0
- F : 0.0

P/F 과목의 경우 등급이 P또는 F로 표시되는데, 등급이 P인 과목은 계산에서 제외해야 한다.

과연 치훈이는 무사히 졸업할 수 있을까?

</details>

`input`
- 20줄에 걸쳐 치훈이가 수강한 전공과목의 과목명, 학점, 등급이 공백으로 구분되어 주어진다.
- 예제 <br>
  ObjectOrientedProgramming1 3.0 A+ <br>
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
  ProblemSolving 4.0 P <br>

`output`
- 치훈이의 전공평점을 출력한다. 정답과의 절대오차 또는 상대오차가 \(10^{-4}\) 이하이면 정답으로 인정한다.
- 예제 <br>
  3.284483


## 코드

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 전공 평점을 담을 변수
        double score = 0;
        // 총 학점을 담을 변수
        double creditSum = 0;
        // 학점과 평점을 담을 변수
        double credit, grade = 0;
        // 반복문으로 입력 받기
        for (int i = 0; i < 20; i++) {
            String[] arr = sc.nextLine().split(" ");
            credit = Double.parseDouble(arr[1]);
            // switch 문으로 평점 구하기
            switch (arr[2].charAt(0)) {
                case 'A':
                    if (arr[2].charAt(1) == '+')
                        grade = 4.5;
                    else
                        grade = 4.0;
                    break;
                case 'B':
                    if (arr[2].charAt(1) == '+')
                        grade = 3.5;
                    else
                        grade = 3.0;
                    break;
                case 'C':
                    if (arr[2].charAt(1) == '+')
                        grade = 2.5;
                    else
                        grade = 2.0;
                    break;
                case 'D':
                    if (arr[2].charAt(1) == '+')
                        grade = 1.5;
                    else
                        grade = 1.0;
                    break;
                case 'F':
                    grade = 0;
                    break;
                case 'P':
                    continue;
            }
            creditSum += credit;
            score += credit * grade;
            credit = 0;
            grade = 0;
        }
        System.out.printf("%.6f", score / creditSum);
    }
}
```

## 메모