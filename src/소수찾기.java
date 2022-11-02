import java.util.ArrayList;
import java.util.List;

public class 소수찾기 {

    //remove 사용(속도가 느림)
    public int solution(int n) {
        int answer = 0;

        List<Integer> num = new ArrayList<>();
        // 2 ~ 50채우기
        for (int i = 2; i <= n; i++) num.add(i);

        for (int i = 2; i <= (int)Math.sqrt(n); i++) {
            for (int j = 0; j < num.size(); j++) {
                if (num.get(j) % i == 0 && num.get(j) > i) num.remove(j);
            }
        }

        return num.size();
    }

    //remove를 사용하지 않음(더 빠르다)
    public int solution2(int n) {
        int answer = 0;

        List<Integer> num = new ArrayList<>();
        List<Boolean> checks = new ArrayList<>();

        // 2 ~ 50채우기
        for (int i = 2; i <= n; i++) num.add(i);
        for (int i = 2; i <= n; i++) checks.add(true);

        for (int i = 2; i <= (int)Math.sqrt(n); i++) {
            for (int j = 0; j < num.size(); j++) {
                if (num.get(j) % i == 0 && num.get(j) > i) checks.set(j, false);
            }
        }
        int cnt = 0;

        for (boolean i: checks) {
            if(i==true){
                cnt++;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        소수찾기 a = new 소수찾기();


        int result1 = a.solution2(50);
        System.out.println(result1);

        int result2 = a.solution2(5);
        System.out.println(result2);
    }
}
