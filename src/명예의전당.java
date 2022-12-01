import java.util.PriorityQueue;

public class 명예의전당 {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < score.length; i++) {
            if (pq.size() < k){
                pq.add(score[i]);
                answer[i] = pq.peek();

            }else {
                if (pq.peek() < score[i]){
                    pq.poll();
                    pq.add(score[i]);
                    answer[i] = pq.peek();
                }else {
                    answer[i] = pq.peek();
                }

            }

        }
        return answer;
    }

    public static void main(String[] args) {
        명예의전당 q = new 명예의전당();
        int[] arr = {10, 100, 20, 150, 1, 100, 200};
        int[] result = q.solution(3, arr);

        for(int i: result){
            System.out.print(i+" ");
        }

        System.out.println();

        int[] arr2 = {0, 300, 40, 300, 20, 70, 150, 50, 500, 1000};
        int[] result2 = q.solution(4, arr2);

        for(int i: result2){
            System.out.print(i+" ");
        }
    }
}
