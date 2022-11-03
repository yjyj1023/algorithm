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

        boolean[] checks = new boolean[n+1];

        // 초기화
        checks[0] = false;
        checks[1] = false;
        for (int i = 2; i < n+1; i++) checks[i] = true;

        //루트n만큼 반복한다.
        for (int i = 2; i <= (int)Math.sqrt(n); i++) {
            for (int j = 2*i; j < n+1; j+=i) { //초기값: 2*i, 공차: i
                checks[j] = false;
            }
        }

        for (boolean i: checks) {
            if(i==true){
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        소수찾기 a = new 소수찾기();

        int result1 = a.solution2(50);
        System.out.println(result1);

        int result2 = a.solution2(5);
        System.out.println(result2);
    }
}
