import java.util.Scanner;

public class 약수의합 {
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            if (Math.floorMod(n, i) == 0) {
                answer += i;
            }
        }
        return answer;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        약수의합 q = new 약수의합();
        int result = q.solution(n);
        System.out.println(result);
    }
}
