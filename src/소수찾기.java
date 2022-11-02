import java.util.ArrayList;
import java.util.List;

public class 소수찾기 {
    public void solution(int n) {
        int answer = 0;

        List<Integer> num = new ArrayList<>();
        // 2 ~ 50채우기
        for (int i = 2; i <= n; i++) num.add(i);

        // 2의 배수 지우기 2제외
        for (int i = 0; i < num.size(); i++) {
            if (num.get(i) % 2 == 0 && num.get(i) > 2) num.remove(i);
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
