import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 재귀함수1855 {
    public int fibonacci(int num){
        if(num == 1 | num ==2) return 1;

        return fibonacci(num-1)+fibonacci(num-2);
    }

    public int fibonacci2(int n){
        if(n == 1 | n == 2) return 1;

        List<Integer> fibonacciNums = new ArrayList<>();
        fibonacciNums.add(1);
        fibonacciNums.add(1);
        for (int j = 2; j < n; j++) {
            fibonacciNums.add(fibonacciNums.get(j - 1) + fibonacciNums.get(j - 2));
        }
        return fibonacciNums.get(n - 1);
    }

    public static void main(String[] args) {
        재귀함수1855 a = new 재귀함수1855();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        a.fibonacci(num);
        System.out.println(a.fibonacci(num));
    }
}
