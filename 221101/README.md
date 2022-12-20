# 221101-algorithm

# 1. 알고리즘
## 1.1 문제
- __실습__: 13, 17, 19, 23 이 소수인지 판별하는 알고리즘을 만들어 보고 소수인지 구해 보세요.

- __참고 문제__: [프로그래머스-소수찾기1](https://school.programmers.co.kr/learn/courses/30/lessons/42839), [프로그래머스-소수찾기2](https://school.programmers.co.kr/learn/courses/30/lessons/12921)

## 1.2 알아야할 사항
- __소수란?__  
   - 2, 3, 5, 7, 11, 13, 17, 19..등등 1과 자기 자신 외에 나누어떨어지는게 없는 수이다.
   
- __소수를 판별하는법__  
   방법 1) n이 들어왔을때 n-1까지 나누고 나머지가 0이 아니면 소수이다.  
   방법 2) n이 들어왔을때 n/2까지 나누고 나머지가 0이 아니면 소수이다.  
   방법 3) n이 들어왔을때 루트n까지 나누고 나머지가 0이 아니면 소수이다.  
   방법 4) 에라토스테네스 체  

## 1.3 구현
- 여기서는 소수를 판별하는법 방법 1~3번까지만 적용하고 에라토스테네스 체는 다음 시간에 하기로 한다.
```java
public class PrimeDivideUntil {

    //n이 들어왔을때 n-1까지 나누고 나머지가 0이 아니면 소수이다.
    boolean isPrime(int num) {
        boolean answer = true;

        for (int i = 2; i < num; i++) {
            if(num%i == 0){
                answer = false;
            }
        }
        return answer;
    }

    //n이 들어왔을때 n/2까지 나누고 나머지가 0이 아니면 소수이다.
    boolean isPrime2(int num) {
        boolean answer = true;

        for (int i = 2; i <= num/2; i++) {
            if(num%i == 0){
                answer = false;
            }
        }
        return answer;
    }

    //n이 들어왔을때 루트n까지 나누고 나머지가 0이 아니면 소수이다.
    boolean isPrime3(int num) {
        boolean answer = true;

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if(num%i == 0){
                answer = false;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        PrimeDivideUntil a = new PrimeDivideUntil();

        boolean result = a.isPrime2(15);
        System.out.println(result);

        boolean result2 = a.isPrime2(17);
        System.out.println(result2);

        boolean result3 = a.isPrime2(19);
        System.out.println(result3);

        boolean result4 = a.isPrime2(23);
        System.out.println(result4);
    }
}
```
## 1.4 Template Callback 적용해보기
- 위의 구현 코드를 보면 바뀌는 부분은 for문에서 i<num밖에 없다.
- 따라서 Template Callback을 적용하면 바뀌는 부분을 최소화 할 수 있다.

>- Template, Callback은 언제사용할까?
>   - 함수를 매개변수(parameter)로 받고 싶을 때 사용한다.
>   - 아래 코드처럼 특정 부분(논리연산 부분)만 변하고 나머지는 똑같을때 Template Callback을 적용해 변하는 부분을 최소화 할 수 있다.
>```java
>boolean isPrime(int num, 함수(parameter가 2개)) {
>   for (int i = 2; i < num; i++) {
>       if(num % i == 0) return false;
>   }
>   return true;
>}
>```

### 1.4.1 Template Callback 적용 1단계
- 중복되는 연산에서 논리연산 부분만 다르기 때문에 someOperator 메소드로 분리했다.
```java
public class TemplateCallbackPrime {
   boolean someOperation(int a, int b) {
       return a < b;
   }
   boolean isPrime(int num) {
       for (int i = 2; someOperation(i, num); i++) {
           if(num % i == 0) return false;
       }
       return true;
   }

   public static void main(String[] args) {
       TemplateCallbackPrime tcp = new TemplateCallbackPrime();
       boolean r = tcp.isPrime(17);
       System.out.println(r);
   }
}

```

### 1.4.2 Template Callback 적용 2단계
- 위에서 작성한 someOperator 메소드는 방법1만 적용되기 때문에 방법2,3도 따로 메소드를 작성해 수정해야한다. 따라서 인터페이스를 생성해 Template을 분리해준다.
- StatementStrategy 인터페이스를 생성하고 기존에 작성했던 메소드는 삭제한다.
```java
interface StatementStrategy {
   boolean compare(int a, int b);
}

public class TemplateCallbackPrime {
   boolean isPrime(int num, StatementStrategy stmt) {
       for (int i = 2; stmt.compare(i, num); i++) {
           if(num % i == 0) return false;
       }
       return true;
   }
```
### 1.4.2 Template Callback 적용 3단계
- 2단계에서 인터페이스를 작성하고 구현하지 않았기 때문에 __익명 내부클래스__를 이용해 구현해 준다.
- main 메소드를 보면 isPrime에 매개변수로 익명 내부 클래스를 사용하여 인터페이스를 방법3으로 구현해 주었다.
```java
public class TemplateCallbackPrime {
   boolean isPrime(int num, StatementStrategy stmt) {
       for (int i = 2; stmt.compare(i, num); i++) {
           System.out.println(i);
           if(num % i == 0) return false;
       }
       return true;
   }

   public static void main(String[] args) {
       TemplateCallbackPrime tcp = new TemplateCallbackPrime();
       boolean r = tcp.isPrime(17, new StatementStrategy() {
           @Override
           public boolean compare(int a, int b) {
               return a < Math.sqrt(b);
           }
       });
       System.out.println(r);
   }
}
```

- 하지만 위같은 방법은 가독성이 떨어지므로 아래 코드처럼 __람다__를 이용해 조금더 가독성있게 바꿀 수 있다.
- 람다식을 이용하면 익명 클래스를 구현할 필요 없이 동작 파라미터 형식의 코드를 더 쉽게 구현할 수 있다.
```java
interface StatementStrategy{
    boolean compare(int a, int b);
}

public class TemplateCallbackPrime {
    boolean isPrime(int num, StatementStrategy stmt) {
        boolean answer = true;

        for (int i = 2; stmt.compare(i,num); i++) {
            if(num%i == 0){
                answer = false;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        TemplateCallbackPrime tc = new TemplateCallbackPrime();
        boolean r = tc.isPrime(13, (a,b) -> a<b);
        boolean r2 = tc.isPrime(17, (a,b) -> a < b/2);
        boolean r3 = tc.isPrime(19, (a,b) -> a < Math.sqrt(b));

        System.out.println(r);
        System.out.println(r2);
        System.out.println(r3);
    }
}
```
