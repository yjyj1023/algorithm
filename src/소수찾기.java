import java.util.ArrayList;
import java.util.List;

public class 소수찾기 {
    public void solution(int n) {
        int answer = 0;

        List<Integer> num = new ArrayList<>();
        // 2 ~ 50채우기
        for (int i = 2; i <= n; i++) num.add(i);

        for (int i = 2; i < (int)Math.sqrt(n); i++) {
            for (int j = 0; j < num.size(); j++) {
                if (num.get(j) % i == 0 && num.get(j) > i) num.remove(j);
            }

        }

        System.out.println(num);
        System.out.println(num.size());
    }

    public static void main(String[] args) {
        소수찾기 a = new 소수찾기();

        a.solution(50);

//        int result1 = a.solution(50);
//        System.out.println(result1);
//
//        int result2 = a.solution(5);
//        System.out.println(result2
//        );
    }
}
