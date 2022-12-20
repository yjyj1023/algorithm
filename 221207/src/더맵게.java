import java.util.PriorityQueue;
import java.util.Queue;

public class 더맵게 {
    public int solution(int[] scoville, int K) {
        int answer = 0;

        Queue<Integer> scoville2 = new PriorityQueue<>();
        for (int i = 0; i < scoville.length; i++) {
            scoville2.add(scoville[i]);
        }


        while (scoville2.peek() < K) {
            if (scoville2.size() >= 2) {
                scoville2.add(scoville2.poll() + (scoville2.poll() * 2));
                answer++;
            } else {
                return -1;
            }
        }


        return answer;
    }

    public static void main(String[] args) {
        더맵게 q = new 더맵게();
        int[] arr = {1, 2, 3, 9, 10, 12};
        int result = q.solution(arr, 1200);
        System.out.println(result);
    }
}
