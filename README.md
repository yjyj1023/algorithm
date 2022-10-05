# 221004-gitpush-algorithm

# 1. Git 사용하기
## 1. Git 이란?
- 형상 관리 도구 또는 버전 관리 시스템이라고도 한다. 
- Git은 소스코드를 효과적으로 관리할 수 있게 해주는 공개소프트웨어이다.
- 비슷한 도구로 SVN이 있지만 잘 사용하지 않는다.

## 2. git bash 명령어
- git clone: 로컬 리포지토리(내 pc: clone 명령어를 실행하는 사람)에서 리모트 리포지토리(git hub, gitbucket, aws~...)로 옮기는 과정
- git bash에 붙어넣기 하는법: shift + insert
- ls: 목록 출력
- cd ~: ~ 폴더로 이동
- mkdir: 폴더 생성

## 3. 소스트리
### push 하는법
1. new tab에서 Create 클릭 탐색에서 폴더 선택한 후 생성
2. 왼쪽 위 커밋 누르고 올릴 파일들 +눌러서 java파일 스테이지에 올리기
<.iml 파일과 .idea 파일은 무시하기>
![](https://velog.velcdn.com/images/lyj1023/post/9e95d795-201d-422b-8540-6dcaec40ffdc/image.png)
![](https://velog.velcdn.com/images/lyj1023/post/e564abee-4b9b-48b4-963c-940450f48854/image.png)

3. 하단 커밋 창에 코드 설명 작성 후 커밋하기
4. github 홈페이지에 들어가서 Repositories에 new클릭해서 새로운 레포지토리 만들기
5. 소스트리로 다시 돌아가서 저장소에 저장소 설정들어간 후 추가 클릭
6. 원격이름 origin, url은 아까 생성했던 레포지토리 url붙여넣기
7. 그 후 Push 클릭하여 모두 선택후 리모트 브랜치를 main으로 바꾼후 push 하기


# 2. 알고리즘
## 1. 화폐 매수 구하는 프로그램 구현하기
![](https://velog.velcdn.com/images/lyj1023/post/b7d6d676-b67f-446c-8e9f-2a41e32aa366/image.png)
```java
package src;

import java.util.Scanner;

public class CurrencyCnt {
    public static void main(String[] args) {
        //현금으로 돈을 받고 25000원을 거슬러 주어야 합니다.
        //5만원 몇장 만원 몇장 5천원 몇장?
        //Scanner sc = new Scanner(System.in);

        //int currency = sc.nextInt();

        int currency = 25000;

        int currency50000 = 50000;
        int currency10000 = 10000;
        int currency5000 = 5000;
        int currency1000 = 1000;
        int currency500 = 500;
        int currency100 = 100;
        int currency50 = 50;
        int currency10 = 10;

        System.out.printf("50000원 %d장, 나머지: %d원 %n", currency/currency50000, currency%currency50000);
        currency = currency%currency50000;

        System.out.printf("10000원 %d장, 나머지: %d원 %n", currency/currency10000, currency%currency10000);
        currency = currency%currency10000;

        System.out.printf("5000원 %d장, 나머지: %d원 %n", currency/currency5000, currency%currency5000);
        currency = currency%currency5000;

        System.out.printf("1000원 %d장, 나머지: %d원 %n", currency/currency1000, currency%currency1000);
        currency = currency%currency1000;

        System.out.printf("500원 %d개, 나머지: %d원 %n", currency/currency500, currency%currency500);
        currency = currency%currency500;

        System.out.printf("100원 %d개, 나머지: %d원 %n", currency/currency100, currency%currency100);
        currency = currency%currency100;

        System.out.printf("50원 %d개, 나머지: %d원 %n", currency/currency50, currency%currency50);
        currency = currency%currency50;

        System.out.printf("10원 %d개, 나머지: %d원 %n", currency/currency10, currency%currency10);
        currency = currency%currency10;

        System.out.printf("나머지: " + currency);
    }
}

```

## 2. 코드업 문제
### 1156번 홀수 짝수 구별
```java
package src;

import java.util.Scanner;

public class EvenOdd {

    public static void main(String[] args) {
        /*
        용준이와 봉찬이는 공기 놀이로 내기를 하였다.
        만약 홀수개의 돌을 쥐게 되면 용준이가 이기게 되고, 짝수개의 돌을 쥐게 되면 봉찬이가 이기는 것으로 룰을 정하였다.
        어떤 자연수가 입력되면  홀수이면 "odd"을 출력하고, 짝수이면 "even"을 출력하시오.
        */

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if(num%2 == 0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }

    }
}

```

### 1161번 홀수와 짝수 그리고 더하기
```java
package src;

import java.util.Scanner;

public class EvenOdd2 {
    public static String getEvenOdd(int num){
        if(num%2 == 0){
            return "짝수";
        }
        else{
            return "홀수";
        }
    }

    public static void main(String[] args) {
        /*
        정수 두개가 입력으로 들어온다.
        만약 첫번째 정수가 홀수이면 "홀수"를 출력하고, 짝수이면 "짝수"를 출력한 후  "+"를 출력한다.
        그리고 두번째 정수가 홀수이면 "홀수"를 출력하고, 짝수이면 "짝수"를 출력한 후  "="을 출력하고 결과로 나오는 값이 홀수인지 짝수인지 출력한다.

        예를들어,
        5 7 이 입력되면 "홀수+홀수=짝수"가 출력된다.
        5 6 이 입력되면 "홀수+짝수=홀수"가 출력된다.
         */

        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        String result1 = getEvenOdd(num1);
        String result2 = getEvenOdd(num2);
        String result3 = getEvenOdd(num1+num2);
        System.out.println(result1+"+"+result2+"="+result3);
    }
}

```
