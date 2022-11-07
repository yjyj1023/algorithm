import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 나누어떨어지는숫자배열 {
    public int[] solution(int[] arr, int divisor) {
        int[] answer;

        //나누어 떨어지는 값을 저장할 리스트 선언
        List<Integer> result = new ArrayList<>();

        //나누어 떨어지는 값을 리스트에 저장
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % divisor == 0){
                result.add(arr[i]);
            }
        }

        if(result.size()==0){  //나누어 떨어지는 값이 없으면 -1을 리턴
            answer = new int[1];
            answer[0] = -1;

        }else{    //나누어 떨어지는 값이 있으면
            answer = new int[result.size()];

            //리스트를 배열에 저장하고
            for (int i = 0; i < result.size(); i++) {
                answer[i] = result.get(i);
            }

            //배열을 정렬한다.
            Arrays.sort(answer);
        }

        return answer;
    }

    public static void main(String[] args) {
        나누어떨어지는숫자배열 a = new 나누어떨어지는숫자배열();

        int[] arr = {3,2,6};
        int[] result = a.solution(arr,10);

        for(int i : result){
            System.out.printf(i+" ");
        }
    }
}
