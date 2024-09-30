# 💻 알고리즘 및 코딩 테스트 스터디 (JAVA)
`알고리즘 코딩 테스트 공부를 진행하며,` <br>
`추가로 github branch 전략을 연습하기 위한 스터디`

|진행 기간|2024년 09월 25일 ~ 2024년 10월 27일|
|:-:|:-:|
|정기 스터디 시간|토요일 14:00 ~ 15:00 [1h]|
|활용 사이트|[백준](https://www.acmicpc.net/)|
|언어|JAVA|

# ✔️ 스터디 방법
- 1일 1문제 풀이 후 매일 commit 및 push 진행
- 주차별 투표로 선정한 문제를 공통 문제로 풀이 진행 <br>
(디스코드에서 자신이 풀고 싶은 문제를 올리고 투표로 문제 선정 ⚡️마감 일요일 PM10:00)

# ✔️ 참여 방법
0. **스터디의 컨벤션 및 규칙을 확인한다** 
1. 이 repository를 fork 한다
2. 생성된 원격 저장소를 clone하여 IDE로 연동한다
3. 원본 repository와 동기화 하기 위해 remote 설정을 해주고 확인한다 <br>
`git remote add <별명> <원본 repository url>` <br>
`git remote -v`
4.  branch를 생성한 후 컨벤션 및 규칙을 준수하며 작업한 후 문제별로 commit 및 push를 진행한다
5. 원본 repository로의 PR요청은 정해진 시간에 진행한다 <br>
6.  PR요청 후 merge가 완료되었다고 스터디장이 알려주면 기존에 작업하던 branch는 삭제하고, <br>
`git fetch <별명>` 을 통해 원본 repository 의 변경 사항을 업데이트 받은 후 새로운 branch를 만들어서 작업을 다시 진행한다

⚡️스터디가 종료될 때 가지 4~6 단계를 반복한다

# ✔️ 컨벤션 및 규칙
### 🔹 Branch Naming 컨벤션
- Branch Naming 컨벤션 : 
githubID / #Issue_번호 <br>
ex) ongdanul / #1

> 각 주차마다 branch를 새롭게 생성해서, 소스 코드를 PR 요청하는 방식

### 🔹 Commit Message 컨벤션
- Commit Message : 
[Baekjoon_문제번호]문제명
ex) [Baekjoon_2557]Hello World

### 🔹 PR 컨벤션 및 규칙<br>
- Pull Request 컨벤션  :
[Week_@@]githubID #Issue_번호<br>
ex) [Week_@@]ongdanul / #1

> repository에 merge가 완료되면 merge 된 branch는 삭제시키고 <br>
fetch를 통해 fork repository를 최신으로 업데이트 하고 branch를 다시 생성한다

# ✔️ Directory 구조 및 Naming 컨벤션
- Directory 구조 : githubID / week_@@ /
- java File Naming 컨벤션 :
문제번호_문제명.java <br>
ex) 2557_HelloWorld.java <br><br>
- md File Naming 컨벤션 :
문제번호_문제명_README.md <br>
ex) 2557_HelloWorld_README.md<br>

```
└── 📂githubID
       ├── 📂week_@@
       │      ├── 💾문제번호_문제명.java
       │      └── 💾문제번호_문제명_README.md
       ├── 📂...
       └── 📂week_@@
````


<h2>스터디 멤버</h2>

|<img src="https://avatars.githubusercontent.com/u/156433565?v=4" width="150" height="150"/>|<img src="" width="150" height="150"/>|<img src="https://avatars.githubusercontent.com/u/106094690?v=4" width="150" height="150"/>|<img src="https://avatars.githubusercontent.com/u/183355547?v=4" width="150" height="150"/>|<img src="https://avatars.githubusercontent.com/u/106459398?v=4" width="150" height="150"/>|
|:-:|:-:|:-:|:-:|:-:|
|[@ongdanul](https://github.com/ongdanul)|[]()|[@pejj212](https://github.com/pejj212)|[@rmlee95](https://github.com/rmlee95)|[@Sw3342_99](https://github.com/Kimdudcjf)|

<br>

>참고한 repo:  <br> 
>https://github.com/Study-CodingTest/Study <br>
>https://github.com/ellynhan/challenge100-codingtest-study
<br><br> 
>참고한 branch 전략:  <br>
>https://pers0n4.io/github-remote-repository-and-upstream/ <br>
>https://seungwubaek.github.io/tools/git/contributing_using_pull_request/<br>
> https://inpa.tistory.com/entry/GIT-%E2%9A%A1%EF%B8%8F-%EA%B9%83%ED%97%99-PRPull-Request-%EB%B3%B4%EB%82%B4%EB%8A%94-%EB%B0%A9%EB%B2%95-folk-issue
<br><br> 
>참고한 Issue와 PR 연결:  <br>
>https://velog.io/@sagesrkim/Github-issue%EC%99%80-PR-%EC%97%B0%EA%B2%B0%ED%95%98%EC%97%AC-%ED%98%91%EC%97%85%ED%95%98%EB%8A%94-%EB%B0%A9%EB%B2%95
