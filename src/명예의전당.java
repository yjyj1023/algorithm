import java.util.PriorityQueue;

public class 명예의전당 {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < score.length; i++) {
            if (pq.size() < k) {   //pq의 크기가 k보다 작을 때
                pq.add(score[i]);
            }
            else {   //pq의 크기가 k와 같을 때
                if (pq.peek() < score[i]) {  //pq의 제일 작은 값이 새로들어온 score 보다 작을 때
                    pq.poll();
                    pq.add(score[i]);
                }
            }
            answer[i] = pq.peek();  //answer 에 제일 작은 값을 넣음
        }

        return answer;
    }

    public static void main(String[] args) {
        명예의전당 q = new 명예의전당();
        int[] arr = {10, 100, 20, 150, 1, 100, 200};
        int[] result = q.solution(3, arr);

        for (int i : result) {
            System.out.print(i + " ");
        }

        System.out.println();

        int[] arr2 = {0, 300, 40, 300, 20, 70, 150, 50, 500, 1000};
        int[] result2 = q.solution(4, arr2);

        for (int i : result2) {
            System.out.print(i + " ");
        }
    }
}
