import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class 모의고사 {
    public int[] solution(int[] answers) {
        int[] answer = {};

        //문자열로 선언
        String p1 = "12345";
        String p2 = "21232425";
        String p3 = "3311224455";

        //답만큼 학생 답 반복하기
        p1 = p1.repeat(answer.length/p1.length()+1);
        p2 = p2.repeat(answer.length/p2.length()+1);
        p3 = p3.repeat(answer.length/p3.length()+1);

        //몇개 맞추는지 cnt하는 배열
        int[] cnt = {0,0,0};

        //채점하기
        for(int i = 0; i<answers.length; i++){
            if(answers[i] == Character.getNumericValue(p1.charAt(i))){ //Character.getNumericValue: char을 정수로 변환
                cnt[0] += 1;
            }

            if(answers[i] == Character.getNumericValue(p2.charAt(i))){
                cnt[1] += 1;
            }

            if(answers[i] == Character.getNumericValue(p3.charAt(i))){
                cnt[2] += 1;
            }
        }

        //max값을 찾는다.
        int maxScore = Math.max(cnt[0], Math.max(cnt[1], cnt[2]));

        List<Integer> studentWithTheMaxScore  = new ArrayList<>();

        for(int i = 0; i<cnt.length; i++){
            if(cnt[i] == maxScore){
                studentWithTheMaxScore .add(i+1);
            }
        }

        //answer 선언하기
        answer = new int[studentWithTheMaxScore.size()];
        for (int i = 0; i<studentWithTheMaxScore.size(); i++){
            answer[i] = studentWithTheMaxScore.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int[] b = {1,3,2,4,2};

        모의고사 x = new 모의고사();

        int[] result = x.solution(a);
        int[] result2 = x.solution(b);

        for(int i : result){
            System.out.printf(i+" ");
        }

        System.out.println();
        for(int i : result2){
            System.out.printf(i+" ");
        }
    }
}
