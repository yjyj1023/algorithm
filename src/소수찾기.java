import java.util.ArrayList;
import java.util.List;

public class 소수찾기 {
    public void solution(int n) {
        int answer = 0;

        List<Integer> num = new ArrayList<>();
        for(int i = 2; i<= n; i++){
            if(i%2!=0 | i==2){
                num.add(i);
            }

        }
        for(int i: num) {
            System.out.printf(i+" ");
        }

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
