import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 소인수분해 {
    public boolean[] findPrimeNumber(int a) {  //에라토스테네스체 사용

        boolean[] isPrime = new boolean[a + 1];

        isPrime[0] = false;
        isPrime[1] = false;

        for (int i = 2; i <= a; i++) {
            isPrime[i] = true;
        }

        for (int i = 2; i * i <= a; i++) {
            for (int j = i * i; j <= a; j += i) {
                isPrime[j] = false;
            }
        }

        return isPrime;  // true 인 값이 소수
    }

    public List<Integer> solution(int a) {
        boolean[] isPrime = findPrimeNumber(a);  //true 인 값이 소수
        List<Integer> list = new ArrayList<>();  //소수를 담을 list 선언

        while(a != 1){  // a==1 이면 소인수 분해 끝
            for (int i = 2; i < isPrime.length; i++) {
                if (isPrime[i]) {  //isPrime이 true이면
                    if (a % i == 0) {  //나눴을때 0 이면 소인수
                        a = a / i;
                        list.add(i);  //list에 소수 추가
                        break;  // 다시 2부터 체크하기 위해 break
                    } else if (a == 1) {  // a==1 이면 소인수 분해 끝
                        break;
                    }
                }
            }
        }

        return list;
    }


    public static void main(String[] args) {
        소인수분해 q = new 소인수분해();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        List<Integer> result = q.solution(num);
        for (int i : result) {
            System.out.print(i + " ");
        }
        ;
    }
}
