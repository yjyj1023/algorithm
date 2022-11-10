import java.util.ArrayList;
import java.util.List;

public class 같은숫자는싫어 {
    public int[] solution(int []arr) {
        int[] answer = {};

        List<Integer> answerList = new ArrayList<>();
        answerList.add(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] != arr[i-1]){
                answerList.add(arr[i]);
            }
        }

        answer = new int[answerList.size()];
        for (int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }


        return answer;
    }

    public static void main(String[] args) {
        같은숫자는싫어 a = new 같은숫자는싫어();

        int[] arr = {1,1,3,3,0,1,1};

        int[] result = a.solution(arr);
        for(int i : result){
            System.out.print(result+" ");
        }
    }
}
