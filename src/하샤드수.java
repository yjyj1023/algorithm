import java.util.Map;

public class 하샤드수 {
    public boolean solution(int x) {
        boolean answer = true;

        //1234 = 1*1000 + 2*100 + 3*10 + 4
        int sumOfDigit = 0;

        while(x>0){
            sumOfDigit += x%10;
            x = x/10;
        }

        return answer;
    }

    public static void main(String[] args) {
        하샤드수 a = new 하샤드수();

        System.out.println(a.solution(10));
        System.out.println(a.solution(12));
        System.out.println(a.solution(11));
        System.out.println(a.solution(13));
    }
}
