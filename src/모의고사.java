public class 모의고사 {
    public int[] solution(int[] answers) {
        int[] answer = {};
        int[] p1 = {1, 2, 3, 4, 5};
        int[] p2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] p3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int p1Cnt = 0;
        int p2Cnt = 0;
        int p3Cnt = 0;

        for(int i = 0; i<answers.length; i++){
            if(answers[i] == p1[i]){
                p1Cnt += 1;
            }
        }
        for(int i = 0; i<answers.length; i++){
            if(answers[i] == p2[i]){
                p2Cnt += 1;
            }
        }
        for(int i = 0; i<answers.length; i++){
            if(answers[i] == p3[i]){
                p3Cnt += 1;
            }
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

        for(int i : result2){
            System.out.printf(i+" ");
        }
    }
}
