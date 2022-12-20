import java.util.HashMap;
import java.util.Map;

public class 완주하지못한선수 {
    public String solution(String[] participant, String[] completion) {
        String answer = "";

        //해시맵 생성 <참가자, 동명이인 수>
        Map<String,Integer> member = new HashMap<>();

        //참가자를 해시맵에 넣음.
        for(int i = 0; i< participant.length; i++){
            if(member.containsKey(participant[i])){  //동명이인이 들어오면 value++
                int temp = member.get(participant[i]);
                member.put(participant[i],temp+1);
            }else{  //처음 들어오는 사람이면 value=1
                member.put(participant[i],1);
            }
        }

        //완주한 사람의 value를 1씩 줄임.
        for(int i = 0; i<completion.length; i++){
            int temp = member.get(completion[i]);
            member.put(completion[i],temp-1);
        }


        for (String key : member.keySet()) {  //member의 key를 전체 순환하면서
            if (member.get(key) == 1) {  //value가 1인값을 return한다.
                answer = key;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        완주하지못한선수 a = new 완주하지못한선수();
        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav" };

        String result = a.solution(participant,completion);

        System.out.println(result);
    }
}
