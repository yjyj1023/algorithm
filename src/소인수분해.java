import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 소인수분해 {
    public boolean[] findPrimeNumber(int a) {

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

        return isPrime;
    }

    public List<Integer> solution(int a) {
        boolean[] isPrime = findPrimeNumber(a);
        List<Integer> list = new ArrayList<>();

        while(a != 1){
            for (int i = 2; i < isPrime.length; i++) {
                if (isPrime[i]) {
                    if (a % i == 0) {
                        a = a / i;
                        list.add(i);
                        break;
                    } else if (a == 1) {
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
