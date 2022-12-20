import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class 같은숫자는싫어 {
    public int[] solution(int []arr) {  //스택 안쓰고
        int[] answer = {};

        //정답 리스트 선언
        List<Integer> answerList = new ArrayList<>();

        //배열의 첫번째 수 넣기
        answerList.add(arr[0]);

        for (int i = 1; i < arr.length; i++) { //배열의 1~맨끝 까지
            if(arr[i] != arr[i-1]){  //앞 원소와 같지 않으면 리스트에 넣음
                answerList.add(arr[i]);
            }
        }

        //리스트 -> 배열로
        answer = new int[answerList.size()];
        for (int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }

        return answer;
    }

    public int[] solution2(int []arr) {  //스택 쓰고
        int[] answer = {};

        Stack<Integer> answerStack = new Stack<>();

        answerStack.push(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            if(answerStack.peek() != arr[i]){
                answerStack.push(arr[i]);
            }
        }

        //스택 -> 배열로
        answer = new int[answerStack.size()];
        for (int i = answerStack.size()-1; i >= 0 ; i--) { //스택이 거꾸로 꺼내서 배열도 뒤에서 부터 넣음
            answer[i] = answerStack.pop();
        }


        return answer;
    }

    public static void main(String[] args) {
        같은숫자는싫어 a = new 같은숫자는싫어();

        int[] arr = {1,1,3,3,0,1,1};

        int[] result = a.solution(arr);

        for(int i = 0; i<result.length; i++){
            System.out.print(result[i]+" ");
        }

        System.out.println();

        int[] result2 = a.solution2(arr);

        for(int i = 0; i<result2.length; i++){
            System.out.print(result2[i]+" ");
        }
    }
}
