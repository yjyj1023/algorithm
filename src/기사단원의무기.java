public class 기사단원의무기 {
    public int solution(int number, int limit, int power) {
        int answer = 0;

        int[] num = new int[number];  //약수가 들어갈 배열 선언
        int cnt; //약수 개수 카운트

        //약수 구하기
        for (int i = 1; i <= number; i++) {
            cnt = 0;
            for (int j = 1; j*j <= i; j++) {
                if(i%j == 0){
                    cnt++;
                    if(j*j<i){
                        cnt++;
                    }
                }
            }
            num[i-1] = cnt;
        }

        for (int i = 0; i < num.length; i++) {
            if(num[i] > limit){
                answer += power;
            }else {
                answer += num[i];
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        기사단원의무기 q = new 기사단원의무기();
        int result = q.solution(10,3,2);
        System.out.println(result);

    }

}
