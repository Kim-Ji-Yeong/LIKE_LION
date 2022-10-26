![멋사](https://user-images.githubusercontent.com/81270199/198018670-e663a473-b410-4530-ad68-04b27ad671ff.png)

### 멋쟁이 사자처럼 백엔드 스쿨 2기
- 교육기간 : 22.09.19 ~ 2.17

<details>
<summary>week6</summary>
<div markdown="1">

## 221024 (k번째 수, DataSource 인터페이스 적용, 익명클래스 도입, JdbcContext 분리, JdbcTemplate 사용)

KthNum_Programmers_42748 : K번째 수

LikeLion-gradle . dao : DAO 복습(221021 내용)

Read-line-parser-gradle . dao : DataSource 인터페이스, 익명클래스, JdbcContext, JdbcTemplate

## 221025 (Hash, Dao 총 복습)

HashFunction, HashTableFunction : Hash 알고리즘 구현

Toby_Spring_Final . dao : Dao 총 복습


</div>
</details>

<details>
<summary>week5</summary>
<div markdown="1">

## 221017

* 별찍기 알고리즘
* db와 프로젝트 연결 (jdbc)
* 환경변수를 이용한 host, user, pw암호화
* connection, preparedStatement를 이용한 insert, select
* 병원정보 insert


## 221018

* 별찍기 알고리즘2
* connection의 분리 추상클래스, 클래스
* insert테스트 케이스 작성


</div>
</details>

<details>
<summary>week4</summary>
<div markdown="1">

## 221011 (알고리즘, Docker, MySQL)

Programmers_12931 : 자릿수 더하기

## 221012 (csv parser)

domain

  * Hospital : 데이터를 저장할 클래스 정의
parser

  * Parser : T를 리턴하는 parse 함수를 가지고 있는 interface (HospitalParser처럼 응용가능)

  * HospitalParser : 파일은 ,로 분리 후 0인덱스 값을 Hospital 형태로 리턴
LineReader : 각 줄을 읽어 T 형태로 리턴
Main : 서울시 병의원 위치 정보.csv를 가져와 사이즈와 id 출력

## 221013 (SelectionSort, .sql 형식으로 데이터 전처리)

bubblesort

  * BubbleSort01 : 버블 정렬 알고리즘(앞에서부터 값 고정)
LikeLion-gradle Repository : .sql 형식으로 데이터 전처리 후 MySQL에 불러오기

## 221014 (InsertionSort)

insertionsort

  * InsertionSort01 : 삽입 정렬 알고리즘(이중 for문 사용)

  * InsertionSort02 : 삽입 정렬 알고리즘(재귀 함수 사용)

</div>
</details>



<details>
<summary>week3</summary>
<div markdown="1">

## 221004 (Array)

HelloWorld : Hello World 출력
  
ArrayTest : 크기가 10인 배열 만들고 1~10 넣고 출력
  
PrintChange, PrintChange2 : 거스름돈 문제
Even_Odd : 홀수 짝수 문제
  
Even_Odd_1161 : 정수를 입력 받아 홀수 짝수 문제
  
## 221005 (Interface, List)

randomCalculator

  * interface를 만들어 랜덤한 수

  * 특정한 수 생성 함수 만든 후 사칙연산(baseNum 이용한 생성자 추가)
Calculator, CalculatorMain : 매개 변수 2개를 이용하여 사칙연산
Collection

  * List를 이용하여 임의의 이름 출력

  * 5명의 정보(반, 이름, 깃주소) 출력
  
## 221006 (List, Set, Map)
  
Student_List : List를 활용하여 학생이름 5명 출력

SetExercise : Set 테스트

randomNumberSet : 50개 랜덤한 수 생성 후 중복 제거

randomAlphabetSet : 50개 랜덤한 알파벳 생성 후 중복 제거

MapTest

 * Map에 이름과 깃주소를 넣고 출력

 * 깃주소를 하나 가져와서 알파벳별, 알파벳이 아닌 문자별 개수 출력

 * 문자열 알파벳 개수 출력
File

 * 파일에서 읽어서 한글자, 두글자, n글자 출력

 * 파일목록 출력

 * 1줄, n줄 읽기
  
## 221007 (대용량파일 불러오기)

MiniProject : 2021년 인구관련연간 자료를 활용하여 2021 서울에서 가장 많이 이사간 지역은 어디인지 알아내기

 * 파일 생성 및 작성

 * 모든 전입 전출 경우의 수, 특정 전출에 따른 모든 전입 경우의 수, 특정 전입 전출 경우의 수 출력

 * 히트맵을 위한 데이터 전처리 후 히트맵 그리기
ReadFile : 파일 읽어서 출력

</div>
</details>
